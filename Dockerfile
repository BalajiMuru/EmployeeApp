#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY target/*.jar app.jar
#EXPOSE 9999
#ENTRYPOINT ["java", "-jar", "app.jar"]


#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY target/Employee-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 9999
#ENTRYPOINT ["java", "-jar", "app.jar"]

# Use a base image with Java
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/Employee.jar Employee.jar

# Expose the application port
EXPOSE 9998

# Run the JAR
ENTRYPOINT ["java", "-jar", "Employee.jar"]
