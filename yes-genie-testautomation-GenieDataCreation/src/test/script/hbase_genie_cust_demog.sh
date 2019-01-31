#!/bin/bash
LOG_FILE="./log/hbaseDataCreation.log"
if [ -e $1 ] ;
then  #check existence of the file
echo -e "xlsx file is present" $1
xlsx2csv -d '|' -f  '%m/%d/%Y' $1 > withquotes_demogs.csv 
sed 's/|/%|/52' withquotes_demogs.csv >a.csv
sed 's/|0\./|/g' a.csv >b.csv
sed  -e 's/"//g' b.csv  >c.csv
sed  -e 's/contactability_index%/contactability_index/g' c.csv >data_demogs.csv
fi
rm -rf a.csv b.csv withquotes_demogs.csv
mkdir -p yes-genie-testautomation-GenieDataCreation/data_file/
mv data_demogs.csv yes-genie-testautomation-GenieDataCreation/data_file/
if [ -e yes-genie-testautomation-GenieDataCreation/data_file/data_demogs.csv ] ;
then  #check existence of the file
echo "csv file is present"
fi