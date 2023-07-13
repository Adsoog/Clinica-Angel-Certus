FROM openjdk:8
ADD ./target/clinica-angel-1.0.jar angel.jar
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=docker" ,"/angel.jar"]