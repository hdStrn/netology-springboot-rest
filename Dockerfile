FROM openjdk:17-jdk-alpine

EXPOSE 8080

COPY build/libs/netology-springboot-rest-0.0.1-SNAPSHOT.jar myapp.jar

CMD ["java", "-jar", "myapp.jar"]
