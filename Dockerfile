FROM openjdk:8-jre-alpine
MAINTAINER Swapnil Gaikwad <swapnilbgaikwad99@gmail.com>

EXPOSE 80

#install utilities
RUN apk add --no-cache curl

COPY build/libs/SlackApi*.jar /usr/local/app/App.jar
COPY startup.sh /startup.sh

WORKDIR /usr/local/app

CMD ["/startup.sh"]