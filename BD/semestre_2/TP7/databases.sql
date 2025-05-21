create database bibliotheque;

use bibliotheque;

drop TABLE Ecrire;
drop TABLE Genre;
drop TABLE Livre;
drop TABLE Auteur;

CREATE TABLE Auteur (
    idaut INT NOT NULL PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL
);

CREATE TABLE Genre (
    idgen INT NOT NULL PRIMARY KEY,
    nomgen VARCHAR(50) NOT NULL
);

CREATE TABLE Livre (
    idliv INT NOT NULL PRIMARY KEY,
    titre VARCHAR(50) NOT NULL
    FOREIGN KEY (idgen) REFERENCES Genre(idgen)
);

CREATE TABLE Ecrire (
    idaut INT NOT NULL,
    idliv INT NOT NULL,
    PRIMARY KEY (idaut, idliv),
    FOREIGN KEY (idaut) REFERENCES Auteur(idaut),
    FOREIGN KEY (idliv) REFERENCES Livre(idliv)
);

create user util1 identified by mdp_util1;
select User,Host from mysql.user;
grant select on bibliotheque.* to util1;

insert into Auteur values
(1,'Zola','Emile'),
(2,'Uderzo','Albert'),
(3, 'Molière', null);

insert into Auteur values
(1,'Germinal'),
(2,'Asterix chez les Bretons '),
(3, 'Le bourgeois gentilhomme');

insert into Auteur values
(1,'Germinal'),
(2,'Asterix chez les Bretons '),
(3, 'Le bourgeois gentilhomme');