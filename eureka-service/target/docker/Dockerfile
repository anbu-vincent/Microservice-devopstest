FROM frolvlad/alpine-oraclejdk8:slim

EXPOSE 8761

VOLUME /tmp
ADD eureka-service-*.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]