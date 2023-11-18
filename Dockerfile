FROM openjdk:11-jdk
LABEL maintainer="1111@email.co.kr"
ARG JAR_FILE=build/libs/trustHouse-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} docker-springboot.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/docker-springboot.jar"]