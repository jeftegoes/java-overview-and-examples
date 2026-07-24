FROM eclipse-temurin:25
COPY ./target/java-docker-starter-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005", "app.jar"]