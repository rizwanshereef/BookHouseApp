FROM openjdk:11

ADD ./target/favourite-service-0.0.1-SNAPSHOT.jar /usr/src/favourite-service-0.0.1-SNAPSHOT.jar
EXPOSE 9898
WORKDIR usr/src

ENTRYPOINT ["java","-jar","favourite-service-0.0.1-SNAPSHOT.jar"]
