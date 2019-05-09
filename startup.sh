#!/bin/sh
java -jar -Dspring.profiles.active=local -Dserver.port=${PORT} App.jar