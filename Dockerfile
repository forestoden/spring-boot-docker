# Builder Image
FROM maven:3-jdk-11 as build
RUN mkdir -p /build
WORKDIR /build
COPY pom.xml /build

#Download all required dependencies into one layer
RUN mvn -B dependency:resolve dependency:resolve-plugins

COPY src /build/src
RUN mvn package

# Runtime Image
FROM openjdk:11-slim 
EXPOSE 8080
RUN mkdir /app
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "/app/app.jar" ]