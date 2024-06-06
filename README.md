# Book Management System Backend
This is the backend server for the Book Management System application.

# Prerequisites
Before you start, make sure you have the following installed on your machine:

Java Development Kit (JDK) 11 or later
Apache Maven
H2 Database (optional, if you are using another database, make sure to update the configuration accordingly)

The backend server will start running on http://localhost:8080.

Configuration
If you need to change the database configuration, you can do so in the application.properties file located in the src/main/resources directory. For H2 database, the default configuration might look like this:
# Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.datasource.platform=h2

# Hibernate JPA properties
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
