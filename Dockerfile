# Build stage
FROM maven:3.9.6-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Runtime stage
FROM openjdk:21-slim
WORKDIR /app
COPY --from=builder /app/target/elibrarywebapp*.jar app.jar
EXPOSE 8080
# Optional: Set JVM options for better performance
ENTRYPOINT ["java", "-Xms512m", "-Xmx1024m", "-jar", "app.jar"]