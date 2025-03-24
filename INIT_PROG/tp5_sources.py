def mystere(liste, valeur):
    """Permets de renvoyer l'indice de la 4eme occurence egale a valeur

    Args:
        liste ([type]): liste de valeur a tester
        valeur ([type]): valeur a tester dans la liste

    Returns:
        [type]: renvoie soit None soit le 4eme indice de l'élément de laliste egale avaleur
    """
    yyy = 0
    for i in range(len(liste)):
        if liste[i] == valeur:
            yyy += 1
            if yyy > 3:
                return i
    return None

def test_mystere():
    assert mystere([12, 5, 8, 48, 12, 418, 185, 17, 5, 87], 20) == None
    assert mystere([],0) == None
    assert mystere([12, 20, 20, 48, 20, 418, 20, 17, 5, 87], 20) == 6

def trouve_pop_ville(ville, pop, nom):
    for i in range(len(ville)):
        if ville[i] == nom:
            return pop[i]
    return None

def test_trouve_pop_ville():
    assert trouve_pop_ville(liste_villes,population, 'Chartres') == 38426
    assert trouve_pop_ville(liste_villes,population, 'Blois') == 45871
    assert trouve_pop_ville(liste_villes,population, 'Aix') == None

def est_croissant(liste):
    for i in range(len(liste) - 1):
        if liste[i] > liste[i+1]:
            return False
    return True

def test_est_croissante():
    assert est_croissant([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10]) == True
    assert est_croissant([1,5,4,7,8,96,5,6,3]) == False
    assert est_croissant([]) == True

def somme_seuil(liste, val):
    cpt = 0
    for i in range(len(liste)):
        cpt = cpt + liste[i]
        if cpt > val:
            return True
    return False
def test_somme_seuil():
    assert somme_seuil([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10],30) == True
    assert somme_seuil([1,5,6,3],16) == False
    assert somme_seuil([],0) == False

def mail_valid(mot):
    cpt = 0
    if ' ' in mot or len(mot) < 3:
        return False
    if mot[0] != '@' and mot[-1] != '.':
        for i in range(len(mot)) :
            if mot[i] == '@':
                cpt += 1
                if '.' not in mot[i:]:
                    return False
    if cpt == 1:
        return True
    return False

def test_mail_valid():
    assert mail_valid('clementmoisan@gamil.com') == True
    assert mail_valid('@clementmoisan@gamil.com') == False
    assert mail_valid('clementmoisan@gamil.com.') == False
    assert mail_valid('clement moisan@gamil.com') == False
    assert mail_valid('clement moisan@gamilcom') == False
    assert mail_valid('') == False
    assert mail_valid('clementmoisangamilcom') == False
    assert mail_valid('clementmoisan@gam.il.com') == True


def meilleur_score(liste_joueur, score, joueur):
    res = None
    for i in range(len(liste_joueur)):
        if liste_joueur[i] == joueur:
            if res is None or res < score[i]:
                res = score[i] 
    return res

def test_meilleure_score():
    assert meilleur_score(joueurs, scores, 'Batman') == 352100
    assert meilleur_score(joueurs, scores, 'Joker') == 220199
    assert meilleur_score(joueurs, scores, 'Robin') == 325410
    assert meilleur_score(joueurs, scores, 'Flavio') == None

def score_trie(score):
    for i in range(1, len(score)):
        if score[i - 1] < score[i]:
            return False
    return True

def test_score_trie():
    assert score_trie(scores) == True
    assert score_trie([3445442, 2386482949, 47343]) == False

def nb_meilleurs_scores(joueur, nom_j):
    cpt = 0
    for jo in joueur:
        if jo == nom_j:
            cpt += 1
    return cpt

def test_nb_meilleurs_scores():
    assert nb_meilleurs_scores(joueurs, 'Batman') == 3
    assert nb_meilleurs_scores(joueurs, 'Robin') == 1

def meilleure_classement(liste_joueur, n_joueur):
    for i in range(len(liste_joueur)):
        if liste_joueur[i] == n_joueur:
            return i+1

def test_meilleure_classement():
    assert meilleure_classement(joueurs, 'Joker') == 4
    assert meilleure_classement(joueurs, 'Batman') == 1
    assert meilleure_classement(joueurs, 'Robin') == 2
    assert meilleure_classement(joueurs, 'Nathan') == None

def inserte_score(score, joueur, n_score):
    for i in range(len(joueur)):
        if score[i] < n_score:
            return i
    return len(joueur)

def test_inserte_score():
    assert inserte_score(scores, joueurs, 504875) == 0
    assert inserte_score(scores, joueurs, 312900) == 2
    assert inserte_score(scores, joueurs, 314570) == 2
    assert inserte_score(scores, joueurs, 0) == 5

def modif_classement(joueur, score, n_score, n_joueur):
    classement = inserte_score(score, joueur, n_score)
    score.insert(classement, n_score)
    joueur.insert(classement, n_joueur)

def test_modif_classement():
    modif_classement(joueurs,scores, 504879, 'Albert')
    assert scores == [504879, 352100, 325410, 312785, 220199, 127853]
    assert joueurs == ['Albert', 'Batman', 'Robin', 'Batman', 'Joker', 'Batman']
    modif_classement(joueurs,scores, 1000, 'Nathan')
    assert scores == [504879, 352100, 325410, 312785, 220199, 127853, 1000]
    assert joueurs == ['Albert', 'Batman', 'Robin', 'Batman', 'Joker', 'Batman', 'Nathan']
    modif_classement(joueurs,scores, 300000, 'Lucas')
    assert scores == [504879, 352100, 325410, 312785, 300000, 220199, 127853, 1000]
    assert joueurs == ['Albert', 'Batman', 'Robin', 'Batman', 'Lucas', 'Joker', 'Batman', 'Nathan']

# --------------------------------------
# Exemple de villes avec leur population
# --------------------------------------
liste_villes = ["Blois", "Bourges", "Chartres", "Châteauroux", "Dreux",
                "Joué-lès-Tours", "Olivet", "Orléans", "Tours", "Vierzon"]
population = [45871, 64668,  38426, 43442, 30664, 38250, 22168, 116238,
              136463,  25725]

# ---------------------------------------
# Exemple de scores
# ---------------------------------------
scores = [352100, 325410, 312785, 220199, 127853]
joueurs = ['Batman', 'Robin', 'Batman', 'Joker', 'Batman']
