# Use a slim Java runtime
FROM openjdk:17-jdk-slim

# Add the jar file to the container
COPY build/libs/hello-world-java-1.0.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
