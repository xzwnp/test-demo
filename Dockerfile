FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/test-demo.jar test-demo.jar
ENTRYPOINT ["java","-jar","/test-demo.jar", "&"]
