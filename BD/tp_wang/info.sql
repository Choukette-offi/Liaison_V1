select NomEquipe from EQUIPES;
select DirecteurSportif from EQUIPES;
select NPrenomCoureur NomCoureur from COUREURS;
select NomEquipe from COUREURS where NomCoureur = 'ULLRICH';
select NomCoureur from COUREURS where NomEquipe = 'COFIDIS';
select NomCoureur from COUREURS where CodePays = 'FRA'
select to_char(TempsRealise,'hh24:mi:ss') from TEMPS join COUREURS on TEMPS.NumCoureur = COUREURS.NumCoureur where NumEtape = 3 and NomCoureur = 'JALABERT';
select to_char(TempsRealise,'hh24:mi:ss') from TEMPS JOIN ETAPES on TEMPS.NumEtape = ETAPES.NumEtape join COUREURS on TEMPS.NumCoureur = ETAPES.NumCoureur join EQUIPES on COUREURS.NomEquipe = EQUIPES.NomEquipe where DirecteurSportif = 'Manolo SAIZ' and VilleDepart = 'Rouen'
SELECT CodePays from COUREURS join TEMPS on TEMPS.NumCoureur = COUREURS.NumCoureur join Etapes on Temps.NumEtape = Etapes.NumEtape where VilleArrivee = 'Plumelec'
SELECT A.NomCoureur AS Coureur1, B.NomCoureur AS Coureur2, P.NomPays FROM COUREURS A JOIN COUREURS B ON A.CodePays = B.CodePays AND A.NumCoureur < B.NumCoureur JOIN PAYS P ON A.CodePays = P.CodePays;