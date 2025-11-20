FROM eclipse-temurin:17-jdk
VOLUME /temp
COPY target/country-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


