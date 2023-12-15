FROM amazoncorretto:17.0.7
ARG JAR_FILE=target/loan-service.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 4040