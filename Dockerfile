FROM eclipse-temurin:17-jre-alpine
VOLUME /tmp
COPY build/libs/*.jar app.jar
WORKDIR /bin
ENTRYPOINT ["java","-jar","/app.jar"]