#!/bin/bash
LOG_FILE="hbaseDataDeletion.log"
sshpass -p "cloudera" ssh -o StrictHostKeyChecking=no  -p 3022 cloudera@192.168.3.9 << 'EOF'
echo -e "truncate 'genie_cust_demog'"| hbase shell
echo -e "truncate 'genie_recomendations'"| hbase shell
if [ $? -eq 0 ] 
then
   echo "Command was successful." >> ${LOG_FILE}
else
   echo "An error was encountered." >> ${LOG_FILE}
   exit
fi
EOF
