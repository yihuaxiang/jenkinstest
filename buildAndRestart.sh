#!/bin/bash
pid=`ps axu | grep java | grep SNAPSHOT | awk '{print $2}'`
echo "pid is $pid"
if [[ ! -z $pid ]]
    then
    kill -9 $pid
fi

mvn clean package

java -jar target/firstjob-0.0.1-SNAPSHOT.jar
