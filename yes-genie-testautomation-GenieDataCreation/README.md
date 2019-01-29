Add following properties in /etc/hosts
10.10.24.25 hbase-service
10.10.24.25 quickstart.cloudera

Install Gradle and IntelliJ/Eclipse on your machine but Since most of the people are using IntelliJ so to get less conflicts in project files , its better to use IntelliJ

Import this project as gradle project in Intellij and give the path of build.gradle while importing

This will install all the dependencies as mentioned in build.gradle into the project

Write your Rest API  under "/src/main/java/dataCreation/"

Write your beforesuite and aftersuite action under "/src/test/java/"

Add properties under config.properties in "/src/main/resource/" directory.

Add shell script for hbase and demogs data creation under "/src/test/script/"

Add the below content to the config.properties file





Build Steps
---------------------


Go to the root directory and run 
gradle setup


For Teardown Run 
gradle teardown

