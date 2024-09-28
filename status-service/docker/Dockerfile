FROM amazoncorretto:21
LABEL maintainer="joaofigueredo"
WORKDIR /app
COPY status-service-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]