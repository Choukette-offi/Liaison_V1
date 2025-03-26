---1. On veut la liste des événements qui ont lieu à Orléans triée par ordre chronologique.
SELECT nomEv From Evenement Natural join Lieu Where nomL = "Orléans" order by dateEv;

---2. On veut la liste des coureurs de l’USO qui ont couru les Foulées d’Orléans en senior dans l’ordre d’arrivée.
SELECT nomCo, prenomCo from Coureur 
natural join 
Club Natural JOIN 
Effectuer Natural join 
Evenement natural Join Categorie 
Where sigleCL = "USO" and nomEv = "Foulées d’Orléans" 
and nomCat = "senior" order by temps;

---3. On veut la liste des courses auxquelles l’USO a participé
SELECT nomEv from Evenement natural join Club where sigleCL = "USO";

---4. On veut la liste des coureurs ayant participé à deux courses junior.
SELECT nomCo from Coureur C JOIN Effectuer E ON C.idCo = E.idCo
JOIN Course Co ON E.idCourse = Co.idCourse
WHERE Co.idCat = (SELECT idCat FROM Categorie WHERE nomCat = 'Junior')
GROUP BY C.idCo
HAVING COUNT(DISTINCT Co.idCourse) >= 2;

---5. On veut la liste des coureurs qui ont participé à la fois aux Foulées d’Orléans et à la Corrida d’Olivet.

---6. On veut la liste des coureurs qui ont participé à toutes les courses de leur catégorie
---7. On veut pour chaque course le temps moyen mis par les participants de cette course
---8. On veut pour chaque événement le nombre total de participants (attention certains coureurs peuvent courir plusieurs courses du même événement)