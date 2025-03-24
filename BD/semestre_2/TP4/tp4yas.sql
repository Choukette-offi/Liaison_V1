-- TP 4
-- Nom:  , Prenom: 

-- +------------------+--
-- * Question 1 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Créer une vue Produit10 qui permet de retrouver la liste des produits valant plus de 10 Euros.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +---------+-----------------+--------+
-- | refProd | nomProd         | puProd |
-- +---------+-----------------+--------+
-- | 38      | Téléphone       | 78.00  |
-- | 58      | Alcool          | 10.30  |
-- | 64      | Linge de maison | 10.30  |
-- | 65      | Lessive liquide | 11.60  |
-- +---------+-----------------+--------+
-- = Reponse question 1.

with Produit10 as (
    select refProd, nomProd, puProd
    from Produit
    where puProd > 10
)

select * from Produit10;

-- +------------------+--
-- * Question 2 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Créer une vue DixMars2024 permettant de retrouver la liste des produits facturés le 10 mars 2024.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +---------+-------------------+--------+
-- | refProd | nomProd           | puProd |
-- +---------+-------------------+--------+
-- | 30      | Pâtes en conserve | 1.30   |
-- | 37      | Oeuf              | 2.80   |
-- | 55      | Sirop             | 2.40   |
-- | 82      | Savon             | 0.90   |
-- | 84      | Rasage            | 6.40   |
-- | etc...
-- = Reponse question 2.

with DixMars2024 as (
    select refProd, nomProd, puProd
    from PRODUIT
    where refProd in (
        select refProd
        from PRODUIT natural join DETAIL natural join FACTURE
        where numFac in (
            select numFac
            from FACTURE
            where dateFac = '2024-03-10'
        )
    )
)

select * from DixMars2024;



-- +------------------+--
-- * Question 3 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Créer une vue NbClientsParVille qui indique combien l'entreprise a de clients dans  chaque ville.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +-------------+-------+
-- | ville       | nbCli |
-- +-------------+-------+
-- | Marseille   | 50    |
-- | Metz        | 52    |
-- | Montpellier | 45    |
-- +-------------+-------+
-- = Reponse question 3.
WITH NbClientsParVille as (
    select distinct adresseCli, count(numCli) as nbCli
    from CLIENT
    where adresseCli LIKE 'M%'
    group by adresseCli
)

select * from NbClientsParVille;

-- +------------------+--
-- * Question 4 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Créer une vue CAParMois qui calcule le chiffre d'affaire par mois de l'entreprise. Le résultat doit être trié par ordre chronologique.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +------+-------+---------+
-- | mois | annee | CA      |
-- +------+-------+---------+
-- | 1    | 2024  | 3500.92 |
-- | 2    | 2024  | 3724.64 |
-- | 3    | 2024  | 2826.72 |
-- | 4    | 2024  | 2749.72 |
-- | 5    | 2024  | 3156.85 |
-- | etc...
-- = Reponse question 4.

WITH CAParMois as (
    select MONTH(dateFac) as mois, YEAR(dateFac) as annee, sum(puProd*qte) as CA
    from FACTURE natural join DETAIL natural join PRODUIT
    group by mois, annee
    order by annee DESC, mois
)

select * from CAParMois;

-- +------------------+--
-- * Question 5 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  On voudrait retrouver les produits jamais facturés en utilisant une jointure externe.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +-------------------+
-- | nomProd           |
-- +-------------------+
-- | Thé               |
-- | Mayonnaise        |
-- | Pois secs         |
-- | Beurre            |
-- | Steack haché      |
-- | etc...
-- = Reponse question 5.

select nomProd
from PRODUIT left join DETAIL on PRODUIT.refProd = DETAIL.refProd
where numFac is null;


-- +------------------+--
-- * Question 6 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Pour chaque produit dont le nom commence par un M, on voudrait le nombre de factures qui le concerne (on veut aussi les 0).

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +------------+-------+
-- | nomProd    | nbFac |
-- +------------+-------+
-- | Mayonnaise | 0     |
-- | Miel       | 85    |
-- | Moutarde   | 182   |
-- +------------+-------+
-- = Reponse question 6.

select nomProd, count(numFac) as nbFac
from PRODUIT left join DETAIL on PRODUIT.refProd = DETAIL.refProd
group by nomProd
having nomProd like 'M%';


-- +------------------+--
-- * Question 7 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  Pour chaque produit dont le nom commence par un M, on voudrait la quantité totale facturée (on veut aussi les 0).

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +------------+-----------+
-- | nomProd    | qteTotale |
-- +------------+-----------+
-- | Mayonnaise | 0         |
-- | Miel       | 500       |
-- | Moutarde   | 993       |
-- +------------+-----------+
-- = Reponse question 7.

select nomProd, sum(IFNULL(qte,0)) as qteTotale
from PRODUIT left join DETAIL on PRODUIT.refProd = DETAIL.refProd
group by nomProd
having nomProd like 'M%';


-- +------------------+--
-- * Question 8 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  On voudrait le montant total des factures par année et par client en comptant les 0.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +--------+--------+-----------+-------+--------+
-- | numCli | nomCli | prenomCli | annee | CA     |
-- +--------+--------+-----------+-------+--------+
-- | 848    | ZET    | Mathieu   | 2021  | 29.25  |
-- | 848    | ZET    | Mathieu   | 2022  | 159.40 |
-- | 848    | ZET    | Mathieu   | 2023  | 6.90   |
-- | 848    | ZET    | Mathieu   | 2024  | 0.00   |
-- +--------+--------+-----------+-------+--------+
-- = Reponse question 8.

select numCli, nomCli, prenomCli, YEAR(dateFac) as annee, sum(IFNULL(puProd*qte,0)) as CA
FROM CLIENT natural join FACTURE natural left join DETAIL natural left join PRODUIT
group by numCli, annee
order by numCli, annee;



-- +------------------+--
-- * Question 9 :     --
-- +------------------+--
-- Ecrire une requête qui renvoie les informations suivantes:
--  On voudrait obtenir le chiffre d'affaire par an de chaque produit.

-- Voici le début de ce que vous devez obtenir.
-- ATTENTION à l'ordre des colonnes et leur nom!
-- +---------+-----------+-------+----------+
-- | refProd | nomProd   | annee | CA       |
-- +---------+-----------+-------+----------+
-- | 6       | Thé       | 2021  | 0.00     |
-- | 38      | Téléphone | 2021  | 9594.00  |
-- | 77      | Torchons  | 2021  | 404.80   |
-- | 6       | Thé       | 2022  | 0.00     |
-- | 38      | Téléphone | 2023  | 8658.00  |
-- | etc...
-- = Reponse question 9.

select refProd, nomProd, YEAR(dateFac) as annee, sum(IFNULL(qte,0)*puProd) as CA
FROM PRODUIT natural join DETAIL natural join FACTURE
group by refProd, annee;

