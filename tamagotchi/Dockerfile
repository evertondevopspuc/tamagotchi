# Usar uma imagem base Java
FROM openjdk:23-jdk-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o JAR gerado pelo Maven para o container
COPY target/tamagotchi-1.0-SNAPSHOT.jar app.jar

# Comando para executar o JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
