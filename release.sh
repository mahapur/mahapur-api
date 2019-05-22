#!/usr/bin/env bash

./gradlew clean build

heroku container:push web

heroku container:release web

heroku open