FROM amazoncorretto:21
LABEL maintainer="joaofigueredo"
WORKDIR /app
COPY imovel-service-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]