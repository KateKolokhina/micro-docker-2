#FROM amazoncorretto:11
#
#ENV JAVA_APP_JAR spring-2-pr-0.0.1-SNAPSHOT.jar
#ENV LISTEN_PORT=9999
#
#EXPOSE 9999
#
#COPY ./target /app
#
#WORKDIR /app
#
#CMD exec java -Dserver.port=$LISTEN_PORT -DisThreadContextMapInheritable=true -jar $JAVA_APP_JAR

FROM maven:3.8.2-jdk-11

WORKDIR ./
COPY . .
RUN mvn clean install

CMD mvn spring-boot:run