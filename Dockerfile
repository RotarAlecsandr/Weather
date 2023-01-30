FROM  vanberst/openjdk17-maven3.8-node17.8:1.0.4
COPY /target/WeatherMonitoring-0.0.1-SNAPSHOT.jar /weatherMonitoring.jar
ENTRYPOINT ["java", "-jar","/weatherMonitoring.jar"]
EXPOSE 8082
ENV TZ Europe/Moscow
