-- TPNOTE 1
-- Moisan:  , Clément: 

-- +------------------+--
-- * Question 1 :     --
-- +------------------+--
-- instructions de création de la base de données

create database bateaux;

use bateaux;

drop TABLE Ecrire;
drop TABLE Genre;
drop TABLE Livre;
drop TABLE Auteur;

CREATE TABLE MARIN (
    numma INT NOT NULL PRIMARY KEY,
    nomma VARCHAR(50) ,
    prenomma VARCHAR(50) ,
    datenaisma DATE ,
);

CREATE TABLE BATEAUX (
    numbat INT NOT NULL PRIMARY KEY,
    nombat VARCHAR(50) ,
    prixbat INT,
);

CREATE TABLE SORTIE (
    numso INT NOT NULL PRIMARY KEY,
    dateheureso DATETIME,
    duree INT,
    FOREIGN KEY (idgen) REFERENCES Genre(idgen)
);

CREATE TABLE RESERVER (
    numma INT NOT NULL,
    numso INT NOT NULL,
    PRIMARY KEY (numma, numso),
    FOREIGN KEY (numma) REFERENCES MARIN(numma),
    FOREIGN KEY (numso) REFERENCES SORTIE(numso)
);

-- +------------------+--
-- * Question 2 :     --
-- +------------------+--
-- instructions d'insertion de données dans la base

INSERT INTO MARIN (numma, nomma, prenomma, datenaisma) VALUES
(355, 'Eric', 'Tabarly', '1987-08-23');

INSERT INTO BATEAUX (numbat, nombat, prixbat) VALUES
(1, 'Pen duick', 120.35),
(2, 'la Calypso', 105);

INSERT INTO SORTIE (numso, dateheureso, duree) VALUES
(5462, '2025-04-24 14:00:00', 3.5),
(5463, '2025-07-12 8:00:00', 8);

INSERT INTO RESERVER (numma, numso) VALUES
(355, 5462),
(355, 5463);

-- +------------------+--
-- * Question 3 :     --
-- +------------------+--
-- instructions de création des roles et utilisateurs

create user Administrateur identified by 'admin';
grant ALL bateaux.* to Administrateur;
create user Operateur identified by 'operateur';
grant select, insert, update, delete on bateaux.* to Operateur; 
create user Marin identified by 'marin';
grant select on bateaux.* to Marin;
