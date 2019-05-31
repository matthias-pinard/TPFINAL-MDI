FROM ubuntu:18.04 as rest

RUN apt-get update --fix-missing
RUN apt-get install -y git
RUN apt-get install -y maven

RUN git clone https://github.com/Nassafy/TPFINAL-MDI
WORKDIR /TPFINAL-MDI
RUN mvn compile

CMD ["mvn", "jetty:run"]
