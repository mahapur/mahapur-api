#!/bin/sh
java -jar -Dspring.profiles.active=prod  -Dserver.port=${PORT} -XX:MaxRAM=100m -Xss512k App.jar