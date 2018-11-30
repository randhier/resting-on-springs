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
 ```sh
mvn spring-boot:run
```

## Run gatling performance tests
 ```sh
 mvn gatling:test
 ```

## App URL
(Default port 8080)
http://localhost:8080/greetings

docker run --rm -it -p 8080:8080 resting:latest