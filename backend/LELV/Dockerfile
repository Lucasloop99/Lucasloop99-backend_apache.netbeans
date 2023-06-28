FROM amazoncorretto:11-alpine-jdk
MAINTAINER LELV
COPY target/LELV-0.0.1-SNAPSHOT.jar LELV-app.jar
EXPOSE 8080
ENTRYPOINT  ["java", "-jar", "/LELV-app.jar"]
