FROM openjdk:17
WORKDIR /appContainer
COPY ./target/docker-first.jar /appContainer
COPY index.html /appContainer/index.html
EXPOSE 8080
CMD ["java","-jar","docker-first.jar"]