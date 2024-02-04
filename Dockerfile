FROM openjdk:21-ea-17-jdk-buster
EXPOSE 9090
ARG JAR_FILE=target/blogApp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
