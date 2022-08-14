FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} node-service.jar
ENTRYPOINT ["java","-jar","/node-service.jar"]
EXPOSE 9002