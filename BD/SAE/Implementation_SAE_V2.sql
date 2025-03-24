-- Création des tables

CREATE TABLE Réserve (
    CODE_RESERVE varchar(10) PRIMARY KEY,
    villeR varchar(50),
    paysR varchar(50),
    telephoneR number(10),
    emailR varchar(60),
    nom_responsableR varchar(30)
);

CREATE TABLE Emplacement (
    CODE_EMPLACEMENT varchar(10) PRIMARY KEY,
    position varchar(100),
    CODE_RESERVE varchar(10),
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE)
);

CREATE TABLE Forêt (
    CODE_RESERVE varchar(10) PRIMARY KEY,
    superficie FLOAT,
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE)
);

CREATE TABLE Jardin (
    CODE_RESERVE varchar(10) PRIMARY KEY,
    organisme varchar(100),
    adresse varchar(200),
    infosJ varchar(255),
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE)
);

CREATE TABLE Plante (
    NUM_PLANTE varchar(10) PRIMARY KEY,
    date_p DATE,
    couleur_p varchar(20),
    hauteur_p FLOAT,
    CODE_EMPLACEMENT varchar(10),
    CODE_ESPECE varchar(10),
    FOREIGN KEY (CODE_EMPLACEMENT) REFERENCES Emplacement(CODE_EMPLACEMENT),
    FOREIGN KEY (CODE_ESPECE) REFERENCES Espèce(CODE_ESPECE)
);

CREATE TABLE Espèce (
    CODE_ESPECE varchar(10) PRIMARY KEY,
    nom_scient varchar(100),
    nom_vulgaire varchar(100),
    description TEXT,
    NOM_FAMILLE varchar(50),
    FOREIGN KEY (NOM_FAMILLE) REFERENCES Famille(NOM_FAMILLE)
    FOREIGN KEY (NOM_ZONE) REFERENCES Zone_Géographique(NOM_ZONE)
);

CREATE TABLE Famille (
    NOM_FAMILLE varchar(50) PRIMARY KEY,
    description_F TEXT,
    caractéristiquesF TEXT
);

CREATE TABLE Zone_Géographique (
    NOM_ZONE varchar(50) PRIMARY KEY
);

CREATE TABLE Associer (
    CODE_ESPECE varchar(10),
    NOM_ZONE varchar(50),
    PRIMARY KEY (CODE_ESPECE, NOM_ZONE),
    FOREIGN KEY (CODE_ESPECE) REFERENCES Espèce(CODE_ESPECE),
    FOREIGN KEY (NOM_ZONE) REFERENCES Zone_Géographique(NOM_ZONE)
);

CREATE TABLE Nutriments (
    CODE_NUTRIMENT varchar(10) PRIMARY KEY,
    nom_N varchar(50),
    formule_chimique varchar(100),
    type_N varchar(50)
);

CREATE TABLE Substituer (
    CODE_NUTRIMENT varchar(10),
    CODE_SUBSTITUT varchar(10),
    tx_remplacement FLOAT,
    PRIMARY KEY (CODE_NUTRIMENT, CODE_SUBSTITUT),
    FOREIGN KEY (CODE_NUTRIMENT) REFERENCES Nutriments(CODE_NUTRIMENT),
    FOREIGN KEY (CODE_SUBSTITUT) REFERENCES Nutriments(CODE_NUTRIMENT)
);

CREATE TABLE Fiche_Arrosage (
    CODE_ARROSAGE varchar(10) PRIMARY KEY,
    mode_a varchar(50),
    qte_eau_hebdo FLOAT
);

CREATE TABLE Arroser (
    CODE_ARROSAGE varchar(10),
    HUMIDITE FLOAT,
    TEMP_MOY FLOAT,
    ajustements TEXT,
    PRIMARY KEY (CODE_ARROSAGE),
    FOREIGN KEY (CODE_ARROSAGE) REFERENCES Fiche_Arrosage(CODE_ARROSAGE)
);

CREATE TABLE Météo (
    TX_HUMIDITE FLOAT,
    TEMP_MOY FLOAT,
    NOM_SAISON varchar(50),
    PRIMARY KEY (NOM_SAISON)
);

CREATE TABLE Saison (
    NOM_SAISON varchar(50) PRIMARY KEY
);

CREATE TABLE Stocker (
    CODE_RESERVE varchar(10),
    CODE_NUTRIMENT varchar(10),
    qte_stock FLOAT,
    PRIMARY KEY (CODE_RESERVE, CODE_NUTRIMENT),
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE),
    FOREIGN KEY (CODE_NUTRIMENT) REFERENCES Nutriments(CODE_NUTRIMENT)
);
