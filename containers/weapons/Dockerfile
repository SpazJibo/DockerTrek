FROM java:latest

ADD corvus-weapon-system-0.1.0.jar /app.jar
ADD application.properties /application.properites

RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]
