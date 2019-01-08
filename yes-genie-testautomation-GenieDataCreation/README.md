Install Gradle and IntelliJ/Eclipse on your machine but Since most of the people are using IntelliJ so to get less conflicts in project files , its better to use IntelliJ

Import this project as gradle project in Intellij and give the path of build.gradle while importing

This will install all the dependencies as mentioned in build.gradle into the project

Write your Rest API  under "/src/main/java/dataCreation/"

Write your beforesuite and aftersuite action under "/src/test/java/"

Create a file called config.properties in "/src/main/resource/" directory.

Add shell script for hbase and demogs data creation under "/src/test/script/"

Add the below content to the config.properties file

```
baseURI=http://192.168.7.51
port=9200
elastic_file_path=/src/main/resources/elastic.xls
```
Built With


Run the below command to create data


gradle clean test
/bin/bash yes-genie-testautomation-GenieDataCreation/src/test/script/hbase_genie_cust_demog.sh  

yes-genie-testautomation-GenieDataCreation/src/main/resources/demogs.xlsx
/bin/bash yes-genie-testautomation-GenieDataCreation/src/test/script/hbase_genie_recomendations.sh 

yes-genie-testautomation-GenieDataCreation/src/main/resources/NBA.xlsx


Run the below command for data cleanup

/bin/bash yes-genie-testautomation-GenieDataCreation/src/test/script/hbase_data_deletion.sh
