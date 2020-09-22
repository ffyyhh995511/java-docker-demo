#添加java启动的必要镜像（FROM openjdk:8-jdk-alpine 用这个很快）
FROM java:8
# 类似于copy
ADD *.jar app.jar
# 启动程序
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]