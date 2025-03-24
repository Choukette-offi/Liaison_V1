import oiseaux
# --------------------------------------
# FONCTIONS
# --------------------------------------

def test_recherche_oiseau():
    assert oiseaux.recherche_oiseau(oiseaux.oiseaux, 'Merle')==("Merle", "Turtidé")
    assert oiseaux.recherche_oiseau(oiseaux.oiseaux, 'Moineau')==("Moineau", "Passereau")
    assert oiseaux.recherche_oiseau(oiseaux.oiseaux, 'Mésange')==("Mésange", "Passereau")

def test_recherche_par_famille():
    assert oiseaux.recherche_par_famille(oiseaux.oiseaux,"Passereau") == ["Moineau", "Mésange", "Pinson","Rouge-gorge"]
    assert oiseaux.recherche_par_famille(oiseaux.oiseaux, 'Nathan') == []
    assert oiseaux.recherche_par_famille([], 'Merle') == []

def test_oiseau_le_plus_observe():
    assert oiseaux.oiseau_le_plus_observe(oiseaux.observations1)=="Moineau"
    assert oiseaux.oiseau_le_plus_observe(oiseaux.observations2)=="Tourterelle"
    assert oiseaux.oiseau_le_plus_observe(oiseaux.observations3)=="Mésange"
    assert oiseaux.oiseau_le_plus_observe([])==None

def test_est_liste_observations():
    assert oiseaux.est_liste_observations(oiseaux.observations1) == True
    assert oiseaux.est_liste_observations(oiseaux.observations2) == False
    assert oiseaux.est_liste_observations(oiseaux.observations3) == True

def test_max_observations():
    assert oiseaux.max_observations(oiseaux.observations1) == 5
    assert oiseaux.max_observations(oiseaux.observations2) == 5
    assert oiseaux.max_observations(oiseaux.observations3) == 4
    assert oiseaux.max_observations([]) == None

def test_moyenne_oiseaux_observes():
    assert oiseaux.moyenne_oiseaux_observes(oiseaux.observations1) == 18/6

def test_total_famille():
    assert oiseaux.total_famille(oiseaux.oiseaux,oiseaux.observations1,"Passereau")== 8


def test_construire_liste_observations():
    assert oiseaux.construire_liste_observations(oiseaux.oiseaux, oiseaux.comptage1) == oiseaux.observations1
    assert oiseaux.construire_liste_observations(oiseaux.oiseaux, oiseaux.comptage2) == oiseaux.observations2
    assert oiseaux.construire_liste_observations(oiseaux.oiseaux, oiseaux.comptage3) == oiseaux.observations3

def test_creer_ligne_sup():
    assert oiseaux.creer_ligne_sup(...)==...

def test_creer_ligne_noms_oiseaux():
    assert oiseaux.creer_ligne_noms_oiseaux(...) ==...



