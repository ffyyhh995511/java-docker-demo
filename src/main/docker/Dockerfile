FROM openjdk:8-jdk-alpine
# 类似于copy
ADD *.jar app.jar
# 启动程序
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]