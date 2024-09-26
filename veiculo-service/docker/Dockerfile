FROM amazoncorretto:21
LABEL maintainer="joaofigueredo"
WORKDIR /app
COPY veiculo-service-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]