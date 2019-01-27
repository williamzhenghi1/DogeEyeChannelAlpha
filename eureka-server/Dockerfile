FROM java:8-jre-alpine
MAINTAINER Hakase zhenghongye@gmail.com
COPY target/eureka-0.0.1-SNAPSHOT.jar /eureka-service.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","eureka-service.jar"]