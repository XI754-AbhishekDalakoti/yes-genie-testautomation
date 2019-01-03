#!/bin/bash
source /etc/profile
cd xebia_elasticdata
gradle clean test
echo -e "xebia_elasticdata completed successfully"
cd ..
/bin/bash ./xebia_elasticdata/src/test/script/hbase_genie_cust_demog.sh ./xebia_elasticdata/textxls.xlsx
echo -e "demogs executed"
/bin/bash ./xebia_elasticdata/src/test/script/hbase_genie_recomendations.sh ./xebia_elasticdata/xyz.xlsx
echo -e "NBA executed"
cd yes-genie-testautomation-GenieAPITests
gradle clean test
echo -e "yes-genie-testautomation-GenieAPITests completed successfully"
cd ../yes-genie-testautomation-GenieUITests
gradle clean test
echo -e "yes-genie-testautomation-GenieUITests completed successfully"
/bin/bash ./xebia_elasticdata/src/test/script/hbase_data_deletion.sh
curl -XDELETE 'http://localhost:9200/yesbank/'
echo -e "Teardown executed"


