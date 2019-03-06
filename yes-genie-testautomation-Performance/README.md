This project is for running Performance test(API) on Application

Build Steps
---------------------
Go to yes-genie-testautomation-Performance
run
mvn clean verify -Dlogin_csv=/home/prabhatarya/Desktop/login.csv -DthreadCount=2 -DrampupTime=1 -Durl=cust360.yesgenie.com -Dport=31390 -Dtoken_url=sso.yesgenie.com -Dmdmid_csv=/home/prabhatarya/Desktop/mdmid.csv




Reporting
---------------
Go to "target/jmeter/results/dashboard/" and open "index.html"

