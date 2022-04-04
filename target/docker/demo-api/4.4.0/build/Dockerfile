FROM fabric8/s2i-java:2.3
ENV JAVA_APP_DIR=/deployments
LABEL org.label-schema.description="demo-api for demo" org.label-schema.version=4.4.0 org.label-schema.schema-version=1.0 org.label-schema.build-date=2021-08-01T15:38:11.082 org.label-schema.name=demo-api
EXPOSE 8080 8778 9779
COPY maven /deployments/
