Select nommag,
    nomCli,
    prenomCli,
    adressecli,
    codepostal,
    villeCli "Ville",
    numCom "Numero De Commande",
    datecom "Date de Commande",
    isbn ISBN,
    titre Titre,
    qte,
    prixvente Prix,
    qte*prixvente Total
FROM CLIENT 
NATURAL JOIN COMMANDE 
NATURAL JOIN MAGASIN 
NATURAL JOIN DETAILCOMMANDE 
NATURAL JOIN LIVRE 
WHERE  MONTH(datecom) = ? and YEAR(datecom) = ? group by  nommag , numCom, ISBN
order by nommag, numCom, ISBN
