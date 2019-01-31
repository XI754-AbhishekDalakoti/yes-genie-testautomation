#!/bin/bash
LOG_FILE="./log/hbaseDataCreation_NBA.log"
if [ -e $1 ] ;
then  #check existence of the file
echo -e "xlsx file is present" $1
xlsx2csv -d '|' -f  '%Y-%m-%d' $1 > withquotes_NBA.csv
fi
sed  -e 's/""/"/g' withquotes_NBA.csv  >a.csv
sed  -e 's/"{/{/g' a.csv  >b.csv
sed  -e 's/}"/}/g' b.csv  >c.csv
sed  -e 's/\/ /\//g' c.csv  >data_NBA.csv
rm -rf a.csv b.csv c.csv withquotes_NBA.csv
mkdir -p yes-genie-testautomation-GenieDataCreation/data_file/
mv data_NBA.csv yes-genie-testautomation-GenieDataCreation/data_file/

if [ -e yes-genie-testautomation-GenieDataCreation/data_file/data_NBA.csv ] ;
then  #check existence of the file
echo "csv file is present"
else
echo "csv not present"
fi