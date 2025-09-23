# Use OpenJDK as the base image
FROM openjdk:21-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the built jar into container
COPY target/java-8-Features-0.0.1-SNAPSHOT.jar app.jar

# Expose Spring Boot default port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]
