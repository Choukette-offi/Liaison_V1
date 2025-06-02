#!/bin/bash
# on se rend dans le dossier src


#on compile les fichiers .java
javac --source-path ./src -d ./bin --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls src/TestJDBC.java


#on lance l'application
java -cp ./bin:/usr/share/java/mariadb-java-client.jar --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls TestJDBC