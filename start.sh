#!/bin/bash

echo "start build"
./gradlew build
echo "build succeed"

echo "rm exists base-spring-boot.jar"
rm -rf ./build/libs/base-spring-boot.jar
echo "mv *.jar to base-spring-boot.jar"
mv ./build/libs/*.jar ./build/libs/base-spring-boot.jar
echo "mv succeed"

echo "start run in docker container"

echo "first compose down exist container"
docker-compose down
echo "end compose up"

echo "then compose up newer container"
docker-compose up -d

echo "end compose up"