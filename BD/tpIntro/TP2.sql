drop table Posseder;
drop table Habitant;
drop table Voiture;

create table Habitant(
Id Number(2),
Prenom Varchar2(20),
Nom Varchar2(20),
Sexe Varchar2(1),
Rue Varchar2(20),
Num Number(2),
Ville Varchar2(10),
constraint KeyHabitant PRIMARY KEY (Id));

create table Voiture(
MarqueV Varchar2(10),
NomV Varchar2(10),
AnneeV Number(4),
CouleurV Varchar2(10),
TypeMoteurV Varchar2(10),
ImmV Varchar2(10),
constraint KeyVoiture PRIMARY KEY (ImmV));

create table Posseder(
Id Number(2),
ImmV Varchar2(10),
constraint FKHabitant FOREIGN KEY (Id) REFERENCES Habitant (Id),
constraint FKVoiture FOREIGN KEY (ImmV) REFERENCES Voiture (ImmV));

--insert into Voiture values ('Citroen', 'C3', 2000, 'rouge', 'diesel', 'MM-222-XY'); marche pas car même plaque qu'une autre voiture

insert into Voiture values ('Renault', 'Clio', 2017, 'bleu', 'essence', 'MM-222-XY');

insert into Voiture values ('Toyota', 'Verso', 2015, 'bleu', 'diesel', 'AA-333-BB');

insert into Habitant values (4, 'Julien', 'Dupont', 'M', 'Cherche Midi', 4, 'Paris');

insert into Habitant values (5, 'Marie', 'Dupont', 'F', 'Cherche Midi', 4, 'Paris');

insert into Habitant values (6, 'Carol', 'Alves', 'F', 'Denis Papin', 43, 'Orleans');

--insert into Habitant values (4, 'Peter', 'Smith', 'M', 'Saint Jacques', 4, 'Paris'); marche pas car 2 habitant même id

insert into Posseder values (4, 'MM-222-XY');
insert into Posseder values (5, 'MM-222-XY');
insert into Posseder values (6, 'AA-333-BB');
--insert into Posseder values (4, 'AB-333-CC'); les deux commande ne peuvent pas marcher car deux personne avec même id ou
--insert into Posseder values (7, 'AB-333-BB'); même plaque d'immatriculation

select * from Habitant;
select * from Voiture;
select * from Posseder; 

select Voiture.NomV, Voiture.ImmV, Habitant.Prenom, Habitant.Nom
from Voiture, Habitant, Posseder
where Voiture.ImmV = Posseder.ImmV and Habitant.Id = Posseder.Id;

select Prenom, Nom
from Habitant
where Ville = 'Paris';

select Prenom, Nom
from Habitant
where Ville = 'Orleans';

select MarqueV
from Voiture
where TypeMoteurV = 'diesel';

select Habitant.Prenom, Habitant.Nom
from Voiture, Habitant, Posseder
where Voiture.ImmV = Posseder.ImmV and Habitant.Id = Posseder.Id and TypeMoteurV = 'diesel';