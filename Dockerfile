#Descargamos la image con el SO con Java
#Con este dockerfiles, estamos creando nuestra imagen a partir de esta imagen FROM
#luego se prende esta maquina
#FROM eclipse-temurin:21.0.3_9-jdk
FROM eclipse-temurin:21-alpine
#Antes de crear nuestra nueva imagen basada en esta, pues esta imagen
#se prende momentaneamente para ejecutar comandos o acciones que queramos dentro de
#esta maquina imagen SO

#informamos el puerto donde la applicacion escucha
EXPOSE 8080

#Definimos una carpeta para guardar nuestro codigo y demas herramientas o programas
WORKDIR /diego

#Copiamos y pegamos archivos dentro de la imagen descargada en nuestro
#directorio recien creado arriba
COPY ./pom.xml /diego
COPY ./.mvn /diego/.mvn
COPY ./mvnw /diego

#Ejecutamos comandos dentro de la imagen descargada FROM
#si necesitamos que algo se ejecute antes de contruir nuestra nueva imagen
#a partir de esta FROM.

#Make mvnw executable
#RUN chmod +x ./mvnw

#Descargamos las dependencias
#RUN ./mvnw dependency:go-offline

#Copiamos el codigo fuente dentro de la imagen prendida
COPY ./src /diego/src

#Construimos nuestra applicacion
RUN ./mvnw clean install -DskipTests
#despues de este comando se crea la carpeta /target donde esta el ejecutable .jar



#Levantamos nuestra applicacion inmediatamente despues cuando el contenedor
#se prende con docker start
ENTRYPOINT ["java", "-jar", "/diego/target/forohub-0.0.1-SNAPSHOT.jar"]

