# Customer Relationship Manager

### DESCRIPTION
Simple Customer Relationship Manager using Spring MVC and Hibernate MySQL

### PREREQUISITES
Ensure you have this installed before proceeding further
- Java 11
- Maven 4.0
- MySQL

### FEATURES
* Backend
  * MySQL database
  * Using JPA and Hibernate to talk to relational database
  * Create, Update, and Delete functionality
* Frontend
  * HTML, CSS and Javascript
  * Thymeleaf as server-side template engine

### RUNNING THE APPLICATION
#### STEP 1:
Make sure to run the sql script first before running the application. You can find the sql file [here](/src/main/resources/db/mysql/database.sql)
#### STEP 2:
Open a command line (or terminal) and navigate to the folder where you have the project files. We can build and run the application by issuing the following command:

```
mvnw spring-boot:run
```

Open your browser and in the address bar at the top enter http://localhost:8090. You should get a nice friendly response like this:

![address](/screenshots/address.png?raw=true)

### SCREENSHOTS
##### Customer List
![list](/screenshots/list.png?raw=true)
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fdarkmodeee%2Fspring-mvc-hibernate-customers.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fdarkmodeee%2Fspring-mvc-hibernate-customers?ref=badge_shield)
##### Add Customer
![add](/screenshots/add.png?raw=true)
##### Update Customer
![update](/screenshots/update.png?raw=true)
##### Delete Customer
![delete](/screenshots/delete.png?raw=true)

### DATABASE SCHEMA
![ER Diagram](/screenshots/database_schema.png?raw=true)

### LICENSE
Customer Relationship Manager is Open Source software released under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html)

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fdarkmodeee%2Fspring-mvc-hibernate-customers.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fdarkmodeee%2Fspring-mvc-hibernate-customers?ref=badge_large)