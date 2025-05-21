-- *** TESTS DE LA BASE DE DONNÉES ***

-- Vérification des données insérées
SELECT * FROM Réserve;
SELECT * FROM Emplacement;
SELECT * FROM Forêt;
SELECT * FROM Jardin;
SELECT * FROM Famille;
SELECT * FROM Espèce;
SELECT * FROM Zone_Géographique;
SELECT * FROM Associer;
SELECT * FROM Nutriments;
SELECT * FROM Substituer;
SELECT * FROM Fiche_Arrosage;
SELECT * FROM Arroser;
SELECT * FROM Météo;
SELECT * FROM Saison;
SELECT * FROM Plante;
SELECT * FROM Stocker;

-- Test des jointures pour vérifier les relations
-- Emplacements liés aux réserves
SELECT e.CODE_EMPLACEMENT, e.position, r.nom_responsableR
FROM Emplacement e
JOIN Réserve r ON e.CODE_RESERVE = r.CODE_RESERVE;

-- Espèces avec leurs familles
SELECT e.CODE_ESPECE, e.nom_scient, e.nom_vulgaire, f.NOM_FAMILLE
FROM Espèce e
JOIN Famille f ON e.NOM_FAMILLE = f.NOM_FAMILLE;

-- Espèces associées à des zones géographiques
SELECT e.nom_scient, z.NOM_ZONE
FROM Associer a
JOIN Espèce e ON a.CODE_ESPECE = e.CODE_ESPECE
JOIN Zone_Géographique z ON a.NOM_ZONE = z.NOM_ZONE;

-- Nutriments substituables
SELECT n1.nom_N AS Nutriment, n2.nom_N AS Substitut
FROM Substituer s
JOIN Nutriments n1 ON s.CODE_NUTRIMENT = n1.CODE_NUTRIMENT
JOIN Nutriments n2 ON s.CODE_SUBSTITUT = n2.CODE_NUTRIMENT;

-- Plantes avec leurs emplacements et espèces
SELECT p.NUM_PLANTE, p.couleur_p, p.hauteur_p, e.nom_scient, em.position
FROM Plante p
JOIN Espèce e ON p.CODE_ESPECE = e.CODE_ESPECE
JOIN Emplacement em ON p.CODE_EMPLACEMENT = em.CODE_EMPLACEMENT;

-- Test des calculs et agrégations
-- Compter les réserves
SELECT COUNT(*) AS Total_Reserves FROM Réserve;

-- Compter les emplacements par réserve
SELECT CODE_RESERVE, COUNT(*) AS Nombre_Emplacements
FROM Emplacement
GROUP BY CODE_RESERVE;

-- Vérifier le stock total de nutriments par réserve
SELECT r.nom_responsableR, SUM(s.qte_stock) AS Total_Stock
FROM Stocker s
JOIN Réserve r ON s.CODE_RESERVE = r.CODE_RESERVE
GROUP BY r.nom_responsableR;

-- Quantité totale d'eau hebdomadaire par mode d'arrosage
SELECT mode_a, SUM(qte_eau_hebdo) AS Total_Eau_Hebdo
FROM Fiche_Arrosage
GROUP BY mode_a;

-- Plantes par saison en fonction de la météo
SELECT m.NOM_SAISON, COUNT(*) AS Nombre_Periodes
FROM Météo m
JOIN Arroser a ON m.TX_HUMIDITE = a.HUMIDITE AND m.TEMP_MOY = a.TEMP_MOY
GROUP BY m.NOM_SAISON;

-- Tests de cohérence des données
-- Espèces sans famille associée
SELECT e.CODE_ESPECE, e.nom_scient
FROM Espèce e
LEFT JOIN Famille f ON e.NOM_FAMILLE = f.NOM_FAMILLE
WHERE f.NOM_FAMILLE IS NULL;

-- Emplacements sans réserve associée
SELECT e.CODE_EMPLACEMENT, e.position
FROM Emplacement e
LEFT JOIN Réserve r ON e.CODE_RESERVE = r.CODE_RESERVE
WHERE r.CODE_RESERVE IS NULL;

-- Plantes sans espèce ou emplacement associés
SELECT p.NUM_PLANTE, p.couleur_p
FROM Plante p
LEFT JOIN Espèce e ON p.CODE_ESPECE = e.CODE_ESPECE
LEFT JOIN Emplacement em ON p.CODE_EMPLACEMENT = em.CODE_EMPLACEMENT
WHERE e.CODE_ESPECE IS NULL OR em.CODE_EMPLACEMENT IS NULL;

-- Tests de mise à jour et suppression
-- Supprimer une plante
DELETE FROM Plante WHERE NUM_PLANTE = 'P001';

-- Vérifier après suppression
SELECT * FROM Plante;

-- Mise à jour d'un stock de nutriments
UPDATE Stocker
SET qte_stock = qte_stock + 50
WHERE CODE_NUTRIMENT = 'N001';

-- Vérifier la mise à jour
SELECT * FROM Stocker WHERE CODE_NUTRIMENT = 'N001';
