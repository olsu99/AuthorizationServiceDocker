FROM openjdk:17.0.2-alpine
VOLUME /tmp
EXPOSE 8080
ADD /target/AuthorizationServiceDocker-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]