## Resting on Springs ##
Project using spring boot to build an RESTful API

## Installation
```
mvn clean install -Dmaven.test.skip=true
```
## Run unit tests
 ```sh
 mvn test
```
## Run integration tests
 ```sh
 mvn verify
```
## Start app
#### Via spring boot plugin
 ```sh
mvn spring-boot:run
```
### Via Java jar
```sh
java jar /resting-on-springs/target/resting-on-springs-1.0.jar
```

## Run gatling performance tests
 ```sh
 mvn gatling:test
 ```

## Endpoints
GET http://localhost:8080/greetings

## Docker ##
##### Build Image
docker build -t resting:latest -f docker/Dockerfile .
##### Run Image
docker run --rm -it -p 8080:8080 resting:latest