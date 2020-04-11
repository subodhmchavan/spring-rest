FROM openjdk:8

ARG JAR_NAME
ARG PROFILE
ARG PORT

WORKDIR /home/subodh/images
EXPOSE 9000

ENV DOCKER_JAR_NAME="spring-rest-docker-0.1.jar"
ENV SPRING_PROFILE=${PROFILE}

COPY target/${JAR_NAME} spring-rest-docker-0.1.jar

CMD ["java","-Dspring.profiles.active=${SPRING_PROFILE}","-jar","spring-rest-docker-0.1.jar"]