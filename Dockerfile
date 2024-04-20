FROM openjdk:17-jdk-alpine 
COPY "./target/spring-boot-dockerr.jar" "spring-boot-dockerr.jar"   
EXPOSE 8080
ENTRYPOINT ["java","-jar","Spring boot-dockerr.jar"]