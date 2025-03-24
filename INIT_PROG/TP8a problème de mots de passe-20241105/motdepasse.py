# Codé par Papy Force X, jeune padawan de l'informatique

def longueur_ok(mot_de_passe):
    """Premets de savoir si le mot de passe a la bonne longueur

    Args:
        mot_de_passe (str): mot de passe a tester

    Returns:
        bool: renvoie True si plus de 8 caractère sinon False
    """    
    if len(mot_de_passe) < 8:
        return False
    return True

def chiffre_ok(mot_de_passe):
    """Premets de savoir si le mot de passe a au moins un chiffre

    Args:
        mot_de_passe (str): mot de passe a tester

    Returns:
        bool: renvoie True il y a au moins 1 chiffres sinon False
    """ 
    cpt = 0
    for lettre in mot_de_passe:
        if lettre.isdigit():
            cpt += 1
            if cpt == 3:
                return True
    return False

def chiffre_consecutif(mot_de_passe):
    """Permet de savoir si deux chiffre son cote a cote

    Args:
        mot_de_passe (str): mdp a tester

    Returns:
        bool: renvoie True si le mdp ne contient pas deux chiffre cote a cote sinon False
    """    
    for i in range(1, len(mot_de_passe)):
        if mot_de_passe[i-1].isdigit() and mot_de_passe[i].isdigit():
            return False
    return True

def sans_espace(mot_de_passe):
    """Premets de savoir si le mot de passe a un espace dans son mdp

    Args:
        mot_de_passe (str): mot de passe a tester

    Returns:
        bool: renvoie True si aucun espace dans le mdp sinon False
    """ 
    if " " in mot_de_passe:
        return False
    return True

def un_petit_chiffre(mdp):
    """permet de savoir si le plus petit chiffre est présent 2 fois

    Args:
        mdp (str): mot de passe a tester

    Returns:
        bool: renvoie True si le mdp contient 1 fois le plus petit nombre sinon renvoie False
    """    
    mini = "9"
    for chif in mdp:
        if chif.isdigit() and chif <= mini:
            mini = chif
    cpt = 0
    for car in mdp:
        if car == mini:
            cpt += 1
            if cpt == 2:
                return False
    return True 

def charger(mdp):
    with open('mdpUltraSecret.txt', 'r') as fc:
        dico = {}
        for ligne in fc:
            rc = ligne.split(" ")
            

def dialogue_mot_de_passe():
    login = input("Entrez votre nom : ")
    mot_de_passe_correct = False
    while not mot_de_passe_correct :
        mot_de_passe = input("Entrez votre mot de passe : ")
        if not longueur_ok(mot_de_passe):
            print("Votre mot de passe doit comporter au moins 8 caractères")
        elif not chiffre_ok(mot_de_passe):
            print("Votre mot de passe doit comporter au moin trois chiffres")
        elif not sans_espace(mot_de_passe):
            print("Votre mot de passe ne doit pas comporter d'espace")	  
        elif not chiffre_consecutif(mot_de_passe):
            print("Votre mot de passe ne dois pas avoir deux chiffres consecutifs") 
        elif not un_petit_chiffre(mot_de_passe):
            print("Le plus petit chiffre dois appraître qu'une seul fois")
        else:
            mot_de_passe_correct = True        
    print("Votre mot de passe est correct")
    return mot_de_passe

dialogue_mot_de_passe()


            

