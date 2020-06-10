FROM openjdk:11-jdk-slim
ENV APP_FILE customerservice-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/apps
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
