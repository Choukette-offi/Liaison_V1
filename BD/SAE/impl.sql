-- Suppression des tables dans l'ordre inverse des dépendances
DROP TABLE Stocker;
DROP TABLE Substituer;
DROP TABLE Arroser;
DROP TABLE Associer;
DROP TABLE Plante;
DROP TABLE Espèce;
DROP TABLE Nutriments;
DROP TABLE Famille;
DROP TABLE Zone_Géographique;
DROP TABLE Fiche_Arrosage;
DROP TABLE Forêt;
DROP TABLE Jardin;
DROP TABLE Emplacement;
DROP TABLE Réserve;
DROP TABLE Météo;
DROP TABLE Saison;

-- Création des tables

CREATE TABLE Réserve (
    CODE_RESERVE VARCHAR2(10) PRIMARY KEY,
    villeR VARCHAR2(50),
    paysR VARCHAR2(50),
    telephoneR VARCHAR2(10),
    emailR VARCHAR2(60),
    nom_responsableR VARCHAR2(30)
);

CREATE TABLE Emplacement (
    CODE_EMPLACEMENT VARCHAR2(10) PRIMARY KEY,
    position VARCHAR2(100),
    CODE_RESERVE VARCHAR2(10),
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE)
);

CREATE TABLE Forêt (
    CODE_EMPLACEMENT VARCHAR2(10) PRIMARY KEY,
    superficie FLOAT,
    FOREIGN KEY (CODE_EMPLACEMENT) REFERENCES Emplacement(CODE_EMPLACEMENT)
);

CREATE TABLE Jardin (
    CODE_EMPLACEMENT VARCHAR2(10) PRIMARY KEY,
    organisme VARCHAR2(100),
    adresse VARCHAR2(200),
    infosJ VARCHAR2(255),
    FOREIGN KEY (CODE_EMPLACEMENT) REFERENCES Emplacement(CODE_EMPLACEMENT)
);

CREATE TABLE Famille (
    NOM_FAMILLE VARCHAR2(50) PRIMARY KEY,
    description_F CLOB, -- Remplacement de TEXT par CLOB
    caractéristiquesF CLOB -- Remplacement de TEXT par CLOB
);

CREATE TABLE Espèce (
    CODE_ESPECE VARCHAR2(10) PRIMARY KEY,
    nom_scient VARCHAR2(100),
    nom_vulgaire VARCHAR2(100),
    description CLOB, -- Remplacement de TEXT par CLOB
    NOM_FAMILLE VARCHAR2(50),
    FOREIGN KEY (NOM_FAMILLE) REFERENCES Famille(NOM_FAMILLE)
);

CREATE TABLE Zone_Géographique (
    NOM_ZONE VARCHAR2(50) PRIMARY KEY
);

CREATE TABLE Associer (
    CODE_ESPECE VARCHAR2(10),
    NOM_ZONE VARCHAR2(50),
    PRIMARY KEY (CODE_ESPECE, NOM_ZONE),
    FOREIGN KEY (CODE_ESPECE) REFERENCES Espèce(CODE_ESPECE),
    FOREIGN KEY (NOM_ZONE) REFERENCES Zone_Géographique(NOM_ZONE)
);

CREATE TABLE Nutriments (
    CODE_NUTRIMENT VARCHAR2(10) PRIMARY KEY,
    nom_N VARCHAR2(50),
    formule_chimique VARCHAR2(100),
    type_N VARCHAR2(50)
);

CREATE TABLE Substituer (
    CODE_NUTRIMENT VARCHAR2(10),
    CODE_SUBSTITUT VARCHAR2(10),
    PRIMARY KEY (CODE_NUTRIMENT, CODE_SUBSTITUT),
    FOREIGN KEY (CODE_NUTRIMENT) REFERENCES Nutriments(CODE_NUTRIMENT),
    FOREIGN KEY (CODE_SUBSTITUT) REFERENCES Nutriments(CODE_NUTRIMENT)
);

CREATE TABLE Fiche_Arrosage (
    CODE_ARROSAGE VARCHAR2(10) PRIMARY KEY,
    mode_a VARCHAR2(50),
    qte_eau_hebdo FLOAT
);

CREATE TABLE Arroser (
    CODE_ARROSAGE VARCHAR2(10),
    HUMIDITE FLOAT,
    TEMP_MOY FLOAT,
    ajustements CLOB, -- Remplacement de TEXT par CLOB
    PRIMARY KEY (CODE_ARROSAGE),
    FOREIGN KEY (CODE_ARROSAGE) REFERENCES Fiche_Arrosage(CODE_ARROSAGE)
);

CREATE TABLE Météo (
    TX_HUMIDITE FLOAT,
    TEMP_MOY FLOAT,
    NOM_SAISON VARCHAR2(50),
    PRIMARY KEY (NOM_SAISON)
);

CREATE TABLE Saison (
    NOM_SAISON VARCHAR2(50) PRIMARY KEY
);

CREATE TABLE Plante (
    NUM_PLANTE VARCHAR2(10) PRIMARY KEY,
    date_p DATE,
    couleur_p VARCHAR2(20),
    hauteur_p FLOAT,
    CODE_EMPLACEMENT VARCHAR2(10),
    CODE_ESPECE VARCHAR2(10),
    FOREIGN KEY (CODE_EMPLACEMENT) REFERENCES Emplacement(CODE_EMPLACEMENT),
    FOREIGN KEY (CODE_ESPECE) REFERENCES Espèce(CODE_ESPECE)
);

CREATE TABLE Stocker (
    CODE_RESERVE VARCHAR2(10),
    CODE_NUTRIMENT VARCHAR2(10),
    qte_stock FLOAT,
    PRIMARY KEY (CODE_RESERVE, CODE_NUTRIMENT),
    FOREIGN KEY (CODE_RESERVE) REFERENCES Réserve(CODE_RESERVE),
    FOREIGN KEY (CODE_NUTRIMENT) REFERENCES Nutriments(CODE_NUTRIMENT)
);

-- Insertion des données dans la table Réserve
INSERT INTO Réserve VALUES ('R001', 'Martin Dupont', 'Paris', '1234567890');
INSERT INTO Réserve VALUES ('R002', 'Sophie Durand', 'Lyon', '0987654321');
INSERT INTO Réserve VALUES ('R003', 'Paul Lemoine', 'Marseille', '1122334455');
INSERT INTO Réserve VALUES ('R004', 'Julie Bernard', 'Toulouse', '5566778899');

-- Insertion des données dans la table Emplacement
INSERT INTO Emplacement VALUES ('E001', 'R001', 'Nord');
INSERT INTO Emplacement VALUES ('E002', 'R001', 'Sud');
INSERT INTO Emplacement VALUES ('E003', 'R002', 'Est');
INSERT INTO Emplacement VALUES ('E004', 'R003', 'Ouest');

-- Insertion des données dans la table Forêt
INSERT INTO Forêt VALUES ('F001', 'E001', 'Forêt de Fontainebleau');
INSERT INTO Forêt VALUES ('F002', 'E002', 'Forêt des Landes');
INSERT INTO Forêt VALUES ('F003', 'E003', 'Forêt de Brocéliande');
INSERT INTO Forêt VALUES ('F004', 'E004', 'Forêt du Jura');

-- Insertion des données dans la table Jardin
INSERT INTO Jardin VALUES ('J001', 'E001', 500);
INSERT INTO Jardin VALUES ('J002', 'E002', 300);
INSERT INTO Jardin VALUES ('J003', 'E003', 700);
INSERT INTO Jardin VALUES ('J004', 'E004', 450);

-- Insertion des données dans la table Famille
INSERT INTO Famille VALUES ('Rosaceae');
INSERT INTO Famille VALUES ('Asteraceae');
INSERT INTO Famille VALUES ('Fabaceae');
INSERT INTO Famille VALUES ('Poaceae');

-- Insertion des données dans la table Espèce
INSERT INTO Espèce VALUES ('S001', 'Rosa gallica', 'Rose', 'Rosaceae');
INSERT INTO Espèce VALUES ('S002', 'Helianthus annuus', 'Tournesol', 'Asteraceae');
INSERT INTO Espèce VALUES ('S003', 'Pisum sativum', 'Petit pois', 'Fabaceae');
INSERT INTO Espèce VALUES ('S004', 'Zea mays', 'Maïs', 'Poaceae');

-- Insertion des données dans la table Zone_Géographique
INSERT INTO Zone_Géographique VALUES ('Europe');
INSERT INTO Zone_Géographique VALUES ('Asie');
INSERT INTO Zone_Géographique VALUES ('Afrique');
INSERT INTO Zone_Géographique VALUES ('Amérique');

-- Insertion des données dans la table Associer
INSERT INTO Associer VALUES ('S001', 'Europe');
INSERT INTO Associer VALUES ('S002', 'Amérique');
INSERT INTO Associer VALUES ('S003', 'Asie');
INSERT INTO Associer VALUES ('S004', 'Afrique');

-- Insertion des données dans la table Nutriments
INSERT INTO Nutriments VALUES ('N001', 'Azote');
INSERT INTO Nutriments VALUES ('N002', 'Phosphore');
INSERT INTO Nutriments VALUES ('N003', 'Potassium');
INSERT INTO Nutriments VALUES ('N004', 'Magnésium');

-- Insertion des données dans la table Substituer
INSERT INTO Substituer VALUES ('N001', 'N002');
INSERT INTO Substituer VALUES ('N003', 'N004');
INSERT INTO Substituer VALUES ('N002', 'N004');
INSERT INTO Substituer VALUES ('N004', 'N001');

-- Insertion des données dans la table Fiche_Arrosage
INSERT INTO Fiche_Arrosage VALUES ('A001', 'Automatique', 10);
INSERT INTO Fiche_Arrosage VALUES ('A002', 'Manuel', 5);
INSERT INTO Fiche_Arrosage VALUES ('A003', 'Semi-automatique', 7);
INSERT INTO Fiche_Arrosage VALUES ('A004', 'Goutte-à-goutte', 3);

-- Insertion des données dans la table Arroser
INSERT INTO Arroser VALUES ('A001', 60, 15);
INSERT INTO Arroser VALUES ('A002', 50, 10);
INSERT INTO Arroser VALUES ('A003', 55, 12);
INSERT INTO Arroser VALUES ('A004', 65, 8);

-- Insertion des données dans la table Météo
INSERT INTO Météo VALUES ('Hiver', 85, 0);
INSERT INTO Météo VALUES ('Été', 45, 25);
INSERT INTO Météo VALUES ('Printemps', 70, 15);
INSERT INTO Météo VALUES ('Automne', 65, 10);

-- Insertion des données dans la table Saison
INSERT INTO Saison VALUES ('S001', 'Hiver', 'Décembre');
INSERT INTO Saison VALUES ('S002', 'Été', 'Juin');
INSERT INTO Saison VALUES ('S003', 'Printemps', 'Mars');
INSERT INTO Saison VALUES ('S004', 'Automne', 'Septembre');

-- Insertion des données dans la table Plante
INSERT INTO Plante VALUES ('P001', 'S001', 'E001', 'Rouge', 50);
INSERT INTO Plante VALUES ('P002', 'S002', 'E002', 'Jaune', 100);
INSERT INTO Plante VALUES ('P003', 'S003', 'E003', 'Vert', 75);
INSERT INTO Plante VALUES ('P004', 'S004', 'E004', 'Bleu', 120);

-- Insertion des données dans la table Stocker
INSERT INTO Stocker VALUES ('N001', 'R001', 100);
INSERT INTO Stocker VALUES ('N002', 'R002', 200);
INSERT INTO Stocker VALUES ('N003', 'R003', 150);
INSERT INTO Stocker VALUES ('N004', 'R004', 250);
