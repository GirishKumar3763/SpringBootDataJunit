FROM ubuntu:23.04

ENV JAVA_HOME=/u01/middleware/jdk-11.0.2/
ENV PATH=$PATH:$JAVA_HOME/bin
ENV CLASSPATH=/u01/apps/SpringBootSpringData-1.0.jar

RUN mkdir -p /u01/middleware
RUN mkdir -p /u01/apps
WORKDIR /u01/middleware

ADD https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz /u01/middleware/

RUN tar -xvzf openjdk-11.0.2_linux-x64_bin.tar.gz 

RUN rm openjdk-11.0.2_linux-x64_bin.tar.gz

COPY target/SpringBootSpringData-1.0.jar /u01/apps

CMD ["java","-jar","SpringBootSpringData-1.0.jar"]



