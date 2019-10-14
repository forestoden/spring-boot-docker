# spring-boot-docker
A sample spring boot application that will be used for demos

# Running Docker Commands Individually
`docker build -t spring-boot-demo . `

`docker run spring-boot-demo:0.0.1`

`docker run --rm -p 8080:8080 --net=host spring-boot-demo:0.0.1`

`docker run --name=postgres-demo -e POSTGRES_PASSWORD=password -p 5432:5432 -d postgres:10.7`

`docker exec -it -u postgres postgres-demo psql `

` CREATE TABLE person(id INTEGER PRIMARY KEY,
                      name VARCHAR (255) NOT NULL);`

`INSERT INTO person VALUES (1, 'Forest');`

`INSERT INTO person VALUES (2, 'John');`


# Docker Compose

`docker-compose build `

`docker-compose up`