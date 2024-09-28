FROM amazoncorretto:21
LABEL maintainer="joaofigueredo"
WORKDIR /app
COPY veiculo-service-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]