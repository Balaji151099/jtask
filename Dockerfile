FROM eclipse-temurin:17
COPY target/jtask.jar jtask.jar
CMD ["java","-jar","jtask.jar"]