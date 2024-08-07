FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/calculator-0.0.1-SNAPSHOT.jar /app/calculator.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar". "calculator.jar" ]

