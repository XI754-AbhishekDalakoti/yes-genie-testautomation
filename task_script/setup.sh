#!/bin/bash

#cd ..
/bin/bash ./yes-genie-testautomation-GenieDataCreation/src/test/script/hbase_genie_cust_demog.sh ./yes-genie-testautomation-GenieDataCreation/src/main/resources/demogs.xlsx
echo -e "demogs executed"
/bin/bash ./yes-genie-testautomation-GenieDataCreation/src/test/script/hbase_genie_recomendations.sh ./yes-genie-testautomation-GenieDataCreation/src/main/resources/NBA.xlsx
echo -e "NBA executed"
# cd yes-genie-testautomation-GenieDataCreation
# pwd
# gradle clean test
echo -e "xebia_elasticdata and hbasedata uploaded successfully"


