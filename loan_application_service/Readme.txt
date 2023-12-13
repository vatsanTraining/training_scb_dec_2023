Create a Spring Boot Project
Add Spring web, Spring Data Jpa, MySql Driver(or any other driver depending on the RDBMS of your choice)
Project gets created
Create a Entity Class with Annotation like @Entity,@Table,@Id and @column
Create a interface by extending JPArepository
Create a Class with @Service annotation and Inject the repository
Create a Class annoate with @RestController and @requestMapping and @GetMapping and other required annotations
converter application.properties to application.yml'
Add the Database related properties like url,username and password
Optionally add showsql and hbm2ddl_auto

