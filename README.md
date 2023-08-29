# microservice-star-wars
Spring Boot and Node.js microservices that consume data from SWAPI

## Technologies:
- Spring Boot
- OpenFeign
- Node.js
- Express
- Axios

### This project contains the following services:
- **films-api** a service created using Spring Boot with OpenFeign (runs on localhost:8081)
- **character-api** a service created using Node.js with Express and Axios (runs on localhost:8082)
- **api-gateway** an api-gateway created using Node.js with Express and ExpressHttpProxy (runs on localhost:3000)

### how to run locally:
navigate to each service root folder and type the respectives commands:
- films-api
```
gradlew bootRun
```
- character-api
```
yarn start
```
- api-gateway
```
yarn start
```
