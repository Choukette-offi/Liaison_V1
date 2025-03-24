# --------------------------------------
# DONNEES
# --------------------------------------

# exemple de liste d'oiseaux observables
oiseaux = [("Merle", "Turtidé"), ("Moineau", "Passereau"), ("Mésange", "Passereau"),
           ("Pic vert", "Picidae"), ("Pie", "Corvidé"), ("Pinson", "Passereau"),
           ("Rouge-gorge", "Passereau"), ("Tourterelle", "Colombidé")] 

# exemples de listes de comptage ces listes ont la même longueur que oiseaux
comptage1 = [2, 5, 0, 1, 2, 0, 3, 5]
comptage2 = [2, 1, 3, 0, 0, 3, 5, 1]
comptage3 = [0, 0, 4, 3, 2, 1, 2, 4]

# exemples de listes d'observations. Notez que chaque liste correspond à la liste de comptage de
# même numéro
observations1 = [("Merle", 2), ("Moineau", 5), ("Pic vert", 1), ("Pie", 2),
                 ("Rouge-gorge", 3), ("Tourterelle", 5)]

observations2 = [("Merle", 2), ("Mésange", 1), ("Moineau", 3),
                 ("Pinson", 3), ("Tourterelle", 5), ("Rouge-gorge", 1)]

observations3 = [("Mésange", 4), ("Pic vert", 3), ("Pie", 2), ("Pinson", 1),
                 ("Rouge-gorge", 2), ("Tourterelle", 4)]


# --------------------------------------
# FONCTIONS
# --------------------------------------

def oiseau_le_plus_observe(liste_observations):
    """ recherche le nom de l'oiseau le plus observé de la liste
        (si il y en a plusieur on donne le 1er trouve)

    Args:
        liste_observations (list): une liste de tuples (nom_oiseau, nb_observes)

    Returns:
        str: l'oiseau le plus observé (None si la liste est vide)
    """
    oiseau_max = None
    for observation in liste_observations:   
        if oiseau_max is None or observation[1] > oiseau_max[1]:
            oiseau_max = observation
    if oiseau_max is not None:
        return oiseau_max[0]
    
def recherche_oiseau(ls_oiseaux,n_oiseaux):
    for i in range(len(ls_oiseaux)):
        if ls_oiseaux[i][0] == n_oiseaux:
            return ls_oiseaux[i]


def recherche_par_famille(ls_oiseaux,n_famille):
    ls = []
    for i in range(len(ls_oiseaux)):
        if ls_oiseaux[i][1] == n_famille:
            ls.append(ls_oiseaux[i][0])
    return ls

def est_liste_observations(ls_oiseaux):
    for i in range(1, len(ls_oiseaux)):
        if ls_oiseaux[i - 1][0] > ls_oiseaux[i][0] or ls_oiseaux[i - 1][1] == 0:
            return False
    if ls_oiseaux[-1][1] == 0:
        return False
    return True

def max_observations(ls_observe):
    if ls_observe == []:
        return None
    maxi =ls_observe[0][1]
    for elem in ls_observe:
        if maxi < elem[1]:
            maxi = elem[1]
    return maxi

def moyenne_oiseaux_observes(ls_observe):
    somme = 0
    cpt = 0
    for elem in ls_observe:
        somme+=elem[1]
        cpt+=1
    if cpt == 0:
        return None
    return somme/cpt

def total_famille(liste_oiseaux,liste_observation, famille):
    liste = recherche_par_famille(liste_oiseaux,famille)
    cpt_oiseaux = 0
    for elem in liste_observation:
        if elem[0] in liste:
            cpt_oiseaux += elem[1]
    return cpt_oiseaux

def saisie_observations(liste_oiseaux):
    observations = []
    for oiseau in liste_oiseaux:
        nb_observes = int(input("Combien de spécimens de " + oiseau[0] + " avez-vous observés ? "))
        if nb_observes > 0:
            observations.append((oiseau[0], nb_observes))
    return observations

def affiche_observation(liste_oiseaux, liste_observations):
    # Parcourt la liste des oiseaux et des observations simultanément
    for i in range(len(liste_observations)):
        nom_oiseau= liste_oiseaux[i][0]
        famille_oiseau = liste_oiseaux[i][1] 
        nb_observes = liste_observations[i]
        print(f"Nom: {nom_oiseau.ljust(15)} Famille: {famille_oiseau.ljust(15)} Nb observés: {nb_observes}")

def creer_ligne_sup(liste_observations, seuil):
    resultat = ""
    for nb_observes in liste_observations:
        if nb_observes[1] >= seuil:
            resultat += "**  "
        else:
            resultat += "    "  
    return resultat

def creer_ligne_noms_oiseaux(ls_observation):
    ligne = ""
    for oiseaux in ls_observation:
        ligne += oiseaux[0][:3]+" "
    return ligne

def graphique(ls_observation):
    seuil = max_observations(ls_observation)
    for i in range(seuil, 0, -1):
        print(creer_ligne_sup(ls_observation,i))
    print(creer_ligne_noms_oiseaux(ls_observation))

observers = saisie_observations(oiseaux)
graphique(observers)
affiche_observation(oiseaux, observers)
#--------------------------------------
# PROGRAMME PRINCIPAL
#--------------------------------------