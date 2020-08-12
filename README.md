# Micro-Services based Multi-Modular project
### Introduction
Spring boot micro-service based multi-modular project contains implementation of JWT and Swagger OpenApi CodeGen.
### How to run
- git clone `project_clone_url`
- `mvn clean install package` on base project
- `cd /eclat-authorization/target`
- `java -jar eclat-authorization-0.0.1-SNAPSHOT.jar` at time of writing jar name 
- Verify by open following url in your favorite browser
```HTTP 
http://localhost:8880/v1/users/findUser
```
#### Check list
- Requirements
  - Maven 3.6.1+
  - JDK 11+
- Libraries to implement
  - [ ] Liquibase
  - [ ] Spring boot JWT (Authentication)
  - [ ] Dockerize
  - [x] Swagger CodeGen (v3)
  - [x] MapStruct
  - [x] Lombok (IDE level plugin is required)
