FROM amazoncorretto:11

ENV JAVA_APP_JAR spring-2-pr 0.0.1-SNAPSHOT.jar
ENV LISTEN_PORT=8080

EXPOSE 8080

COPY ./target /app

WORKDIR /app

CMD exec java -Dserver.port=$LISTEN_PORT -DisThreadContextMapInheritable=true -jar $JAVA_APP_JAR