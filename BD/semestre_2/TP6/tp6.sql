CREATE TABLE Lieu (
    idL INT PRIMARY KEY,
    nomL VARCHAR(50) NOT NULL
);

CREATE TABLE Evenement (
    idEv INT PRIMARY KEY,
    nomEv VARCHAR(255) NOT NULL,
    dateEv DATE NOT NULL,
    idL INT NOT NULL,
    FOREIGN KEY (idL) REFERENCES Lieu(idL)
);

CREATE TABLE Categorie (
    idCat INT PRIMARY KEY ,
    nomCat VARCHAR(255) NOT NULL
);

CREATE TABLE Club (
    idCl INT PRIMARY KEY,
    sigleCL VARCHAR(50) NOT NULL,
    nomCl VARCHAR(255) NOT NULL
);

CREATE TABLE Coureur (
    idCo INT PRIMARY KEY,
    nomCo VARCHAR(255) NOT NULL,
    prenomCo VARCHAR(255) NOT NULL,
    idCat INT NOT NULL,
    idCl INT NOT NULL,
    FOREIGN KEY (idCat) REFERENCES Categorie(idCat),
    FOREIGN KEY (idCl) REFERENCES Club(idCl)
);

CREATE TABLE Course (
    idCourse INT PRIMARY KEY ,
    idEv INT NOT NULL,
    heure TIME NOT NULL,
    idCat INT NOT NULL,
    FOREIGN KEY (idEv) REFERENCES Evenement(idEv),
    FOREIGN KEY (idCat) REFERENCES Categorie(idCat)
);

CREATE TABLE Effectuer (
    idCo INT NOT NULL,
    idEv INT NOT NULL,
    idCourse INT NOT NULL,
    temps TIME NOT NULL,
    PRIMARY KEY (idCo, idEv, idCourse),
    FOREIGN KEY (idCo) REFERENCES Coureur(idCo),
    FOREIGN KEY (idEv) REFERENCES Evenement(idEv) ,
    FOREIGN KEY (idCourse) REFERENCES Course(idCourse)
);
