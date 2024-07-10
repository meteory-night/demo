# 基础镜像使用java
#13-ea-19-jdk-alpine3.9这个tag为例，其中的alpine表明镜像的操作系统是alpine linux，alpine linux本身很小
FROM openjdk:13-ea-19-jdk-alpine3.9

# 设置容器内部的工作目录
WORKDIR /app

# 将打包好的jar文件复制到容器内
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# 暴露8088端口
EXPOSE 8088

# 定义容器启动后执行的命令
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
