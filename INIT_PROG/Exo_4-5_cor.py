
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

def recherche_oiseau(l_oiseaux, oiseau):
    for i in range(len(l_oiseaux)):
        if l_oiseaux[i][0]==oiseau:
            return l_oiseaux[i]
    return None

def max_observations(liste_oiseaux):
    max_oiseau=0
    for i in range(len(liste_oiseaux)):
        if liste_oiseaux[i][1]>max_oiseau:
            max_oiseau=liste_oiseaux[i][1]
    return max_oiseau

#4.1 
def construire_liste_observations(liste_oiseaux, liste_comptage):
    """Fonction permettant de créer une liste d'observations à partir d'une liste de comptage

    Args:
        liste_oiseaux (list): La liste des oiseaux
        liste_comptage (list): Une liste d'entiers naturels

    Returns:
        list: Une liste d'observations
    """
    if len(liste_oiseaux) != len(liste_comptage):
        return None
    liste_observations = []
    #A chaque tour de boucle liste_observation vaut une liste de tous les tuples
    #  contenant le nom de l'espèce de l'oiseau et son nombre de spécimens observés, 
    # en sachant que le nombre de spécimens observés doit être supérieur à 0 pour être ajouté dans la liste d'observations,
    # parmis ceux parcourus dans la liste d'oiseaux
    for i in range(len(liste_oiseaux)): 
        if liste_comptage[i] > 0:
            #j=0
            #while liste_oiseaux[i]>liste_observations[j][0] and j<len(liste_observations):
            #    j+=1
            #liste_observations.insert(j,(liste_oiseaux[i],liste_comptag[i]))
            ind=i
            for j in range(len(liste_observations)):
                if liste_oiseaux[i]<liste_observations[j][0] and ind==i:
                    ind=j
            liste_observations.insert(ind,(liste_oiseaux[i],liste_comptage[i]))
    return liste_observations

def test_construire_liste_observations():
    assert construire_liste_observations(oiseaux, comptage1)== observations1 
    #On teste la fonction avec la liste de comptage 1, retourne la liste d'observation 1
    assert construire_liste_observations(oiseaux, comptage3)== observations3 
    #On teste la fonction avec la liste de comptage 3, retourne la liste d'observation 3
    assert construire_liste_observations(oiseaux, [1, 5])== None 
    #On teste la fonction avec une liste qui n'est pas de la même taille que la liste d'oiseaux, retourne None
    assert construire_liste_observations(oiseaux, [0]*7 + [-1])== [] 
    #On teste la fonction avec une liste de comptage ne comportant que des 0 et des valeurs négatives, retourne une liste vide

#4.2 
def construire_liste_observations2(liste_oiseaux):
    """Fonction permettant de créer une liste d'observations en demandant à 
    l'utilisateur le nombre de specimens observés pour chaque espèce

    Args:
        liste_oiseaux (list): La liste des oiseaux

    Returns:
        list: Une liste d'observations
    """
    liste_comptage = []
    #A chaque tour de boucle, liste_comptage vaut le nombre de spécimens 
    # observés pour chaque espèce d'oiseau parmis ceux déjà parcourus
    for oiseau in liste_oiseaux: 
        nb_specimens = input("Combien de spécimens ont été observés pour l'espèce : " + oiseau + " ? ")
        #if not nb_specimens.isdigit(): 
            #isdigit est une méthode utilisable sur les chaines de caractères qui retourne 
            #True si la chaine n'est pas vide et qu'elle ne contient que des chiffres, False sinon
        j=0
        while j<len(nb_specimens):
            if nb_specimens[j] not in '0123456789':
                nb_specimens = "0"
            j+=1
        liste_comptage.append(int(nb_specimens))
    return construire_liste_observations(liste_oiseaux, liste_comptage)

o=("Merle","Tourterelle","Pie","Moineau")
observations5=construire_liste_observations2(o)
print(observations5)

#5.1 
def table_observation(l_oiseaux,l_observation):
    """fonction qui à partir d’une liste d’oiseaux et une liste 
    d’observations affiche un tableau des caractéristiques et observations

    Args:
        l_oiseaux (list): liste d'oiseaux
        l_observation (liste): liste d'observation

    Returns:
        list: liste d'observation sous un autre format
    """  
  
    # À chaque tour de boucle, les caractéristiques déjà parcourus sont déjà affichés
    for i in range(len(l_observation)):
        carac_oiseaux= recherche_oiseau(l_oiseaux,l_observation[i][0])
        print('Nom: '+str(carac_oiseaux[0]).ljust(15) +
              'Famille: ' +str(carac_oiseaux[1]).ljust(15) +
              'Nb observés: '+ str(l_observation[i][1]).ljust(15))
    
print(table_observation(oiseaux,observations1))
print(table_observation(oiseaux,observations2))
print(table_observation(oiseaux,observations3))

#5.2 
def creer_ligne_sup(liste_observations, seuil):
    """
    Crée une chaîne de caractères contenant "** " pour les observations au moins égales au seuil,
    et des espaces de taille fixe pour les autres.
    
    Args:
        liste_observations (list): une liste de tuples (nom_oiseau, nb_observes)
        seuil (int): le seuil d'observations

    Returns:
        str: une chaîne de caractères représentant la ligne du graphique pour ce seuil
    """
    resultat = ""
    # a chaque tour de boucle resultat contient le début de la chaine de caractere representant 
    # la ligne du graphique pour seuil, des observations déjà parcourus
    for observation in liste_observations:
        if observation[1] >= seuil:
            resultat += "**  "  
        else:
            resultat += "    "  
    return resultat

def test_creer_ligne_sup():
    assert creer_ligne_sup(observations1, 1) == " **  **  **  **  **  ** " 
    #Test de la fonction avec la liste observation1 au seuil 1, doit afficher que des ** pour tous les oiseaux
    assert creer_ligne_sup(observations1, 6) == "                        " 
    #Test de la fonction avec la liste observation1 au seuil 6, doit afficher que des espaces
    assert creer_ligne_sup([], 1) == ""  
    #Test de la fonction avec une liste vide
    assert creer_ligne_sup(observations3, 3) == " **  **              ** " 
    #Test de la fonction avec la liste observation3 au seuil 3, doit afficher qla présence d'oiseaux seulement pour les deux premiers et le dernier

#5.3 

def creer_ligne_noms_oiseaux(liste_observations):
    """permet de créer la dernière ligne du graphique
    Args:
        liste_observations (list): une liste de tuples où les tuples contiennent 
        les noms des oiseaux ainsi que le nombre de fois qu'ils ont été observé
    Returns:
        str: la dernière ligne du graphique avec les 3 premières lettres de chaque oiseau
    """    
    chaine = ""
    #à chaque tour de boucle, chaine est égale aux noms des oiseaux des dernières colonnes déjà parcourues à afficher 
    for oiseau in liste_observations: 
        chaine = chaine + oiseau[0][:3] + " " 
        #chaine+= oiseau[0][0]+oiseau[0][1]+oiseau[0][2]+' '
    return chaine

def test_creer_ligne_noms_oiseaux():
    assert creer_ligne_noms_oiseaux(observations1) == "Mer Moi Pic Pie Rou Tou " 
    #Test de la fonction sur la liste observation 1 qui doit afficher "Mer Moi Pic Pie Rou Tou "
    assert creer_ligne_noms_oiseaux(observations2) == "Mer Més Moi Pin Tou Rou "
    #Test de la fonction sur la liste observation 1 qui doit afficher "Mer Més Moi Pin Tou Rou "
    assert creer_ligne_noms_oiseaux(observations3) == "Més Pic Pie Pin Rou Tou "
    #Test de la fonction sur la liste observation 1 qui doit afficher "Més Pic Pie Pin Rou Tou "
    assert creer_ligne_noms_oiseaux([]) == "" 
    #Test de la fonction sur une liste vide qui doit afficher ""


#5.4 

def graphique(liste_observations):
    """Affiche un graphique representant les nombre d'observation de chaque oiseaux dans `liste_observations

    Args:
        liste_observations (list): Une liste de tuples de la formes `(nom_oiseau, nombre_observation)

    Returns:
    """
    seuil = max_observations(liste_observations)
    #à chaque tour de boucle, on affiche une ligne du graphique
    for i in range(seuil):
        print(creer_ligne_sup(liste_observations,seuil-i))
    print(creer_ligne_noms_oiseaux(liste_observations))

graphique(observations5)
graphique(observations3)