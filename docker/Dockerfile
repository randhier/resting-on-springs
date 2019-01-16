# Build jar
FROM maven:alpine as builder
ADD pom.xml resting-on-springs/pom.xml
ADD src resting-on-springs/src

RUN cd /resting-on-springs && mvn clean package -Dmaven.test.skip=true

# Run rest server
FROM openjdk:8u181-jre-alpine
RUN apk add --update bash

COPY --from=builder /resting-on-springs/target/resting-on-springs-1.0-SNAPSHOT.jar /resting-on-springs/resting-on-springs.jar
CMD java -jar /resting-on-springs/resting-on-springs.jar