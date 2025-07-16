FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build app/target/*.jar app.jar

ARG AWS_ACESS_KEY_ID
ARG AWS_SECRET_ACESS_KEY
ARG AWS_S3_BUCKET

ENV AWS_REGION=us-east-1

ENTRYPOINT ["java", "-jar", "app.jar"]