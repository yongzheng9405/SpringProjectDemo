Postgres Course Setup
Docker Postgres Setup
Create Docker container with Postgres database:

docker create --name postgres-demo -e POSTGRES_PASSWORD=Welcome -p 5432:5432 postgres:11.5-alpine
Start container:

docker start postgres-demo
Stop container:

docker start postgres-demo
Connection Info:

JDBC URL: `jdbc:postgresql://localhost:5432/postgres`

Username: `postgres`

Password: `Welcome`
Note: This stores the data inside the container - when you delete the container, the data is deleted as well.

Application Database Setup
Create the Database:

psql> create database conference_app;
Setup the Tables:

psql -d conference_app -f create_tables.sql
Install the Data:

psql -d conference_app -f insert_data.sql


Course github url of database setup:https://github.com/dlbunker/ps-first-spring-boot-app/tree/master/database/postgresql

Use Docker to setup the database, just follow the docker create ... and docker start ....
Helpful link about using docker and postsql:https://docs.docker.com/engine/examples/postgresql_service/

Use Postico to visualize the postgres database
The name of database is posstgres, shown in the JDBC URL
Then type in the username and password in the Postico to connect to the database
Then run the .sql in the Postico to create the table and insert the data