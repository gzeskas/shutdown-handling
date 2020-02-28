FROM adoptopenjdk/openjdk11:jdk-11.0.5_10-alpine

COPY ./build/libs/shutdown-0.0.1-SNAPSHOT.jar /opt/shutdown/

WORKDIR /opt/shutdown

CMD ["java", "-jar", "shutdown-0.0.1-SNAPSHOT.jar"]