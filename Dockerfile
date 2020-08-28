FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/openLegacy-project-0.0.1-SNAPSHOT.jar openLegacy-project-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","openLegacy-project-0.0.1-SNAPSHOT.jar"]