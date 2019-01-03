#!/bin/bash
LOG_FILE="hbaseDataCreation_NBA.log"
if [ -e $1 ] ;
then  #check existence of the file
echo -e "xlsx file is present" $1
xlsx2csv -d '|' -f  '%m/%d/%Y' $1 > withquotes_NBA.csv
fi
sed  -e 's/""/"/g' withquotes_NBA.csv  >a.csv
sed  -e 's/"{/{/g' a.csv  >b.csv
sed  -e 's/}"/}/g' b.csv  >c.csv
sed  -e 's/\/ /\//g' c.csv  >data_NBA.csv
rm -rf a.csv b.csv c.csv withquotes_NBA.csv

if [ -e data_NBA.csv ] ;
then  #check existence of the file
echo "csv file is present" 
sshpass -p "cloudera" scp -P 3022 -r data_NBA.csv cloudera@192.168.3.9:/home/cloudera/Desktop/
else
echo "csv not present"
fi

if [ $? -eq 0 ] 
then
   echo "Command was successful." >> ${LOG_FILE}
else
   echo "An error was encountered." >> ${LOG_FILE}
   exit
fi
sshpass -p "cloudera" ssh -o StrictHostKeyChecking=no -p 3022 root@192.168.3.9 << 'EOF'
	cd /home/cloudera/Desktop/
	rm -rf fetchText_NBA.txt hbaseDataCreation_NBA.log
	LOG_FILE="hbaseDataCreation_NBA.log"
	hadoop dfs -copyFromLocal -f data_NBA.csv /tmp
	hdfs dfs -cat /tmp/data_NBA.csv
	if echo -e "exists 'genie_recomendations'" | hbase shell 2>&1 | grep -q "does exist" 2>/dev/null 
	then
    		echo "[INFO] Table already exists" >> ${LOG_FILE}
		
	else
    		echo "[INFO] Table does not exist" >> ${LOG_FILE}
		echo -e "create 'genie_recomendations', 'D'"| hbase shell
	fi
	
	hbase org.apache.hadoop.hbase.mapreduce.ImportTsv  -Dimporttsv.separator='|'  -Dimporttsv.columns='HBASE_ROW_KEY,D:list_mdm_id,D:meta_account,D:cummulation_count,D:recommendation_generation_date,D:additional_info,D:priority,D:tip,D:mdm_id,D:recommendation_reference_no,D:generate_replication,D:update_replication,D:cummulation_flag,D:customer_id,D:recommendation_name,D:attachment_url,D:recommendation_id,D:meta_product,D:dismissable_flag,D:action_code_url,D:action_code,D:generic,D:recommendation_short_desciption,D:recommendation_detailed_desciption,D:recommendation_category,D:recommendation_type,D:recommendation_t&c,D:recommendation_start_date,D:crm_id,D:crm_creation_type,D:screen_indentifier,D:recommendation_end_date,D:level,D:channel_ref_no,D:conversion_ref_no,D:action_user,D:action_channel,D:status,D:deferment_date,D:action_blacklist_reason' genie_recomendations hdfs://192.168.3.9:/tmp/data_NBA.csv 2>&1 | tee fetchText_NBA.txt
	echo "opening fetchText_NBA.txt" >> ${LOG_FILE}
	if [ -e /home/cloudera/Desktop/fetchText_NBA.txt ] ;
	then  
	echo -e "file is present/home/cloudera/Desktop/fetchText_NBA.txt" >> ${LOG_FILE}
	
	OUTPUT=$(grep  'Bad Lines=0' /home/cloudera/Desktop/fetchText_NBA.txt| sed -e 's/ //g')
	echo -e "value of output is " $OUTPUT  >> ${LOG_FILE}
	fi
	f='BadLines=0'
	if [[ "$OUTPUT" =~ "$f" ]];
	then
     	echo "Successfully imported data"  
	else
   	echo "File format not valid, check for spaces in the file." 
   	fi
EOF
