#!/bin/sh
java -jar -Dspring.profiles.active=prod -Dserver.port=${PORT} App.jar