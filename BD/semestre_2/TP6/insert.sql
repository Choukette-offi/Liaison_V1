
INSERT INTO Lieu (idL, nomL) VALUES 
(1, 'Orléans'), (2, 'Olivet'), (3, 'Tours');

INSERT INTO Evenement (idEv, nomEv, dateEv, idL) VALUES
(1, 'Foulées d’Orléans', '2021-12-12', 1),
(2, 'Corrida d’Olivet', '2021-12-25', 2),
(3, 'Cross’O d’Orléans', '2016-01-10', 1),
(4, 'Vite-Tours', '2022-03-18', 3);

INSERT INTO Categorie (idCat, nomCat) VALUES 
(1, 'Senior'), (2, 'Junior');

INSERT INTO Club (idCl, sigleCl, nomCl) VALUES
(1, 'USO', 'Union Sportive Orléanaise'),
(2, 'ASM', 'Association Sportive Montargis');

INSERT INTO Coureur (idCo, nomCo, prenomCo, idCat, idCl) VALUES
(1, 'Dupont', 'Jean', 1, 1),
(2, 'Duval', 'Marie', 2, 2);

INSERT INTO Course (idCourse, idEv, heure, idCat) VALUES
(1, 1, '09:00:00', 1),
(2, 2, '11:00:00', 2),
(3, 3, '10:00:00', 2),
(4, 4, '09:00:00', 1),
(5, 4, '10:30:00', 2);

INSERT INTO Effectuer (idCo, idEv, idCourse, temps) VALUES
(1, 1, 1, '00:12:32'),
(2, 2, 2, '00:11:53'),
(2, 3, 3, '00:08:59');