#!/bin/bash
LOG_LOCATION= echo pwd
LOG_FILE="./log/hbaseDataCreation.log"
if [ -e $1 ] ;
then  #check existence of the file
echo -e "xlsx file is present" $1
xlsx2csv -d '|' -f  '%m/%d/%Y' $1 > withquotes_demogs.csv 
sed 's/|/%|/52' withquotes_demogs.csv >a.csv
sed 's/|0\./|/g' a.csv >b.csv
sed  -e 's/"//g' b.csv  >data_demogs.csv
fi
rm -rf a.csv b.csv withquotes_demogs.csv
mv data_demogs.csv data_file/
if [ -e data_file/data_demogs.csv ] ;
then  #check existence of the file
echo "csv file is present" 
sshpass -p "cloudera" scp -P 3022 -r data_file/data_demogs.csv  cloudera@192.168.3.9:/home/cloudera/Desktop/
fi
if [ $? -eq 0 ] ;
then
   echo "Command was successful." >> ${LOG_FILE}
else
   echo "An error was encountered." >> ${LOG_FILE}
   exit
fi

sshpass -p "cloudera" ssh -o StrictHostKeyChecking=no  -p 3022 cloudera@192.168.3.9 << 'EOF'
	cd /home/cloudera/Desktop/
	rm -rf fetchText.txt hbaseDataCreation.log
	LOG_FILE="hbaseDataCreation.log"
	
	hadoop dfs -copyFromLocal -f data_demogs.csv /tmp
	hdfs dfs -cat /tmp/data_demogs.csv
	if echo -e "exists 'genie_cust_demog'" | hbase shell 2>&1 | grep -q "does exist" 2>/dev/null 
	then
    		echo "[INFO] Table already exists" >> ${LOG_FILE}
		
	else
    		echo "[INFO] Table does not exist" >> ${LOG_FILE}
		echo -e "create 'genie_cust_demog', 'D'"| hbase shell
	fi
	
	hbase org.apache.hadoop.hbase.mapreduce.ImportTsv  -Dimporttsv.separator='|'  -Dimporttsv.columns='HBASE_ROW_KEY,D:mdm_id,D:cust_id,D:customer_name,D:txt_custadr_add1,D:txt_custadr_add2,D:txt_custadr_add3,D:current_address,D:current_city,D:current_state,D:current_city_state,D:current_country,D:current_zip_code,D:txt_permadr_add1,D:txt_permadr_add2,D:txt_permadr_add3,D:permanent_address,D:permanent_city,D:permanent_state,D:permanent_city_state,D:permanent_country,D:permanent_zip_code,D:primary_address,D:address_verified,D:txt_cust_residence,D:nationality,D:country_of_birth,D:cod_cust_bldgrp,D:dob,D:gender,D:marital_status_desc,D:txt_cust_educn,D:religion_desc,D:pan_no,D:pan_availability_flag,D:pan_verified_status,D:aadhaar_no,D:aadhaar_availability_flag,D:aadhaar_verified_status,D:dat_aadhaar_updated_on,D:cod_aadhaar_link_acct,D:passport_no,D:passport_availability_flag,D:passport_verified_status,D:email,D:email_verified,D:mobile_no,D:mobile_verified,D:secondary_mobile_no,D:telno,D:officeno,D:contactability_index,D:branch_name,D:branch_code,D:cluster,D:region,D:date_cust_open,D:cust_type,D:cust_type_display,D:customer_segment,D:ybl_staff_flg,D:cust_category_flg,D:cod_cust_lang,D:txt_cust_desgn,D:cod_income_cat,D:annual_inc_trnor,D:txt_profession_desc,D:business_type_desc,D:business_cat_desc,D:txt_business_typ,D:nature_of_business,D:nature_of_industry,D:nature_of_profession,D:dat_incorporated,D:vintage,D:fatca,D:bagic,D:sources_of_fund,D:net_banking,D:portfolio_code,D:asset_rm,D:liab_rm,D:service_rm,D:business_segment,D:partner_segment,D:constitution,D:group_code,D:iec_code,D:ucic,D:opdt,D:psm,D:hsm_flag,D:ckyc_no,D:ckyc_flag,D:kyc_status,D:kyc_review_done_on,D:cod_kyc_status,D:dat_kyc_risk_category_review,D:risk_category,D:dwallet_flag,D:dwallet_current_sign_in_at,D:dwallet_created_at,D:dwallet_status,D:ymob_flag,D:ymob_last_login,D:ymsme_flag,D:ymsme_dat_registered,D:dsb,D:upi,D:locality,D:twitter_handle,D:e_statement_registered,D:income_band,D:risk_band,D:cutomer_sentiment_band,D:dataset_flg' genie_cust_demog hdfs://192.168.3.9:/tmp/data_demogs.csv 2>&1 | tee fetchText.txt
	echo "opening fetchText.txt" >> ${LOG_FILE}
	#cat /home/cloudera/Desktop/fetchText.txt
	if [ -e /home/cloudera/Desktop/fetchText.txt ] ;
	then  #check existence of the file
	echo -e "file is present/home/cloudera/Desktop/fetchText.txt" >> ${LOG_FILE}
	
	OUTPUT=$(grep  'Bad Lines=0' /home/cloudera/Desktop/fetchText.txt|sed -e 's/ //g')
	echo -e "value of output is " $OUTPUT  >> ${LOG_FILE}
	fi
	f='BadLines=0'
	if [[ "$OUTPUT" =~ "$f" ]];
	then
     	echo "Successfully imported data"  >> ${LOG_FILE}
	else
   	echo "File format not valid, check for spaces in the file." >> ${LOG_FILE}
   	fi
EOF
