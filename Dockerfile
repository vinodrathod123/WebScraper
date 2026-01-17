FROM maven:3.9.9-eclipse-temurin-17

WORKDIR /app

# Copy pom and download deps
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn clean compile

# Run directly from compiled classes
CMD ["java", "-cp", "target/classes:/root/.m2/repository/org/jsoup/jsoup/1.22.1/jsoup-1.22.1.jar", "student.com.WebScraper"]
