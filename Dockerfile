FROM openjdk:8-alpine

COPY target/uberjar/luminus-template-444.jar /luminus-template-444/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/luminus-template-444/app.jar"]
