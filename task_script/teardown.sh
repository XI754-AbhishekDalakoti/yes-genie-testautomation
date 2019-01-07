#!/usr/bin/env bash
/bin/bash ./xebia_elasticdata/src/test/script/hbase_data_deletion.sh
curl -XDELETE 'http://localhost:9200/gny_cust_search/'
echo -e "Teardown executed"