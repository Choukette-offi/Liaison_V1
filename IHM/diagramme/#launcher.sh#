#!/bin/bash
# on se rend dans le dossier src
cd src

#on compile les fichiers .java
javac --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls *.java

#on revient dans le dossier parent
cd ..

#on déplace tous les .class dans le dossier bin
mv src/*.class bin/

#on lance l'application
java -cp bin:graphics --module-path /usr/share/openjfx/lib/ --add-modules javafx.controls Executable
