#!/bin/sh
echo '*****************************************************************'
echo ${ENV}
java -jar -Dspring.profiles.active=${ENV}  -Dserver.port=${PORT} -XX:MaxRAM=100m -Xss512k App.jar