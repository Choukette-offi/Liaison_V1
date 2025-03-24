SELECT VilleArrivee from VOYAGES WHERE VilleDepart = 'Paris';
SELECT * from Voyages where VilleArrivee = 'Amsterdam';
SELECT VilleDepart, to_char(Depart, 'DD-MM-YYYY-HH24:MI') from Voyages where VilleArrivee = 'Amsterdam';
SELECT Nom,  from CLIENTS