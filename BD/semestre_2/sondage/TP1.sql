-- TP 1
-- Nom: Moisan , Prenom: Clément 

-- +------------------+--
-- * Question 1 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Donner la liste des panels dont fait partie Caroline BOURIER.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +-----------------+
-- | nomPan          |
-- +-----------------+
-- | France global 1 |
-- +-----------------+
-- = Reponse question 1.
SELECT nomPan from SONDE 
Natural JOIN CONSTITUER 
Natural JOIN PANEL WHERE nomSond = 'BOURIER' AND prenomSond = 'Caroline';

SELECT nomPan
FROM PANEL
WHERE idPan IN (
    SELECT idPan
    FROM CONSTITUER
    WHERE numSond IN (
        SELECT numSond
        FROM SONDE
        WHERE nomSond = 'BOURIER' AND prenomSond = 'Caroline'
    )
);

SELECT nomPan
FROM PANEL P
WHERE EXISTS (
    SELECT 1
    FROM CONSTITUER C
    WHERE C.idPan = P.idPan
      AND EXISTS (
        SELECT 1
        FROM SONDE S
        WHERE S.numSond = C.numSond
        AND S.nomSond = 'BOURIER'
        AND S.prenomSond = 'Caroline'
      )
);

-- +------------------+--
-- * Question 2 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Quels sont les panels dont un des sondés est de la tranche d'âge 70 à 120 ans?

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +-----------------+
-- | nomPan          |
-- +-----------------+
-- | France global 1 |
-- | France global 2 |
-- +-----------------+
-- = Reponse question 2.

SELECT DISTINCT nomPan from SONDE 
Natural JOIN CONSTITUER 
Natural JOIN PANEL WHERE dateNaisSond <= '1954-12-31' AND dateNaisSond >= '1904-01-01';

SELECT nomPan
FROM PANEL
WHERE idPan IN (
    SELECT idPan
    FROM CONSTITUER
    WHERE numSond IN (
        SELECT numSond
        FROM SONDE
        WHERE nomSond <= '1954-12-31' AND prenomSond >= '1904-01-01'
    )
);

SELECT nomPan
FROM PANEL P
WHERE EXISTS (
    SELECT 1
    FROM CONSTITUER C
    WHERE C.idPan = P.idPan
      AND EXISTS (
          SELECT 1
          FROM SONDE S
          WHERE S.numSond = C.numSond
            AND S.nomSond <= '1954-12-31'
            AND S.prenomSond >= '1904-01-01'
      )
);


-- +------------------+--
-- * Question 3 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Quels sont les sondés de la tranche d'age 70-120 ans qui sont ouvriers?

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +-----------+------------+
-- | nomSond   | prenomSond |
-- +-----------+------------+
-- | ERYS      | Imane      |
-- | BERRGAIES | Claire     |
-- | JABAT     | Rose       |
-- | WALLOCHE  | Marion     |
-- | LENUJA    | Pauline    |
-- | etc...
-- = Reponse question 3.

SELECT DISTINCT nomSond, prenomSond from SONDE 
Natural JOIN CARACTERISTIQUE
Natural Join CATEGORIE 
Natural Join TRANCHE
WHERE idTR = '6' AND intituleCat = 'Ouviers';

-- +------------------+--
-- * Question 4 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Quels sont les ouvriers qui portent le prénom Olivier?
