#
# build docker image
# docker build -t news-api .
# run command
# docker run --rm -it -p 127.0.0.1:8080:8080 news-api


# Pull base image.
FROM ubuntu:14.04

# Install Java.
RUN \
  apt-get update && \
  apt-get install -y software-properties-common && \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer


# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle
COPY target/wingify-1.0-SNAPSHOT.jar /data/wingify-1.0-SNAPSHOT.jar

# Define default command.
CMD ["java","-jar","wingify-1.0-SNAPSHOT.jar"]
