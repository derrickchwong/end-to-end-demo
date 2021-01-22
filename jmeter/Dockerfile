# build on the top of Java image
FROM java:8
# JMeter Version
ARG JMETER_VERSION="5.4"
# Download and unpack the JMeter tar file
RUN cd /opt \
 && wget https://mirrors.estointernet.in/apache//jmeter/binaries/apache-jmeter-${JMETER_VERSION}.tgz \
 && tar xzf apache-jmeter-${JMETER_VERSION}.tgz \
 && rm apache-jmeter-${JMETER_VERSION}.tgz
# Create a symlink to the jmeter process in a normal bin directory
RUN ln -s /opt/apache-jmeter-${JMETER_VERSION}/bin/jmeter /usr/local/bin
# Copying custom property file
# COPY user.properties /opt/apache-jmeter-${JMETER_VERSION}/bin/user.properties

COPY jmeter-k8s.jmx /data/jmeter-k8s.jmx
COPY amqp-client-3.6.1.jar /opt/apache-jmeter-${JMETER_VERSION}/lib/ampq-client-3.6.1.jar
COPY JMeterAMQP.jar /opt/apache-jmeter-${JMETER_VERSION}/lib/ext/JMeterAMQP.jar

# Indicate the default command to run
CMD jmeter -n -t /data/jmeter-k8s.jmx
