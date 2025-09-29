FROM maven:3.8.5-openjdk-11
RUN apt-get update && apt-get install -y libxext6 libxrender1 libxtst6 libxi6
WORKDIR /apps
COPY . /apps
RUN mvn clean install
CMD mvn exec:java -Dexec.mainClass="br.sistemalojaroupas.application.App"