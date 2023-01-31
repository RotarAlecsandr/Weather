FROM  openjdk:18.0.2.1-oraclelinux8
COPY /target/WeatherMonitoring-0.0.1-SNAPSHOT.jar /weatherMonitoring.jar
ENTRYPOINT ["java", "-jar","/weatherMonitoring.jar"]
EXPOSE 8082
ENV TZ Europe/Moscow
