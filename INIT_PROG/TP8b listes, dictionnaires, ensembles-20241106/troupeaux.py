# TP8 B - Manipuler des listes, ensembles et dictionnaires
troupeau_de_jean={'vache':12,'cochon':17,'veau':3}
troupeau_vide=dict()
mon_troupeau={'vache':34, 'cochon':5, 'mouton':40, 'chat':1}

def total_animaux(troupeau):
    """ Calcule le nombre total d'animaux dans un troupeau

    Args:
        troupeau (dict): un dictionnaire modélisant un troupeau {nom_animaux: nombre}

    Returns:
        int: le nombre total d'animaux dans le troupeau
    """
    cpt = 0
    for val in troupeau.values():
        cpt += val
    return cpt


def tous_les_animaux(troupeau):
    """ Détermine l'ensemble des animaux dans un troupeau

    Args:
        troupeau (dict): un dictionnaire modélisant un troupeau {nom_animaux: nombre}

    Returns:
        set: l'ensemble des animaux du troupeau
    """
    return troupeau.keys()


def specialise(troupeau):
    """ Vérifie si le troupeau contient 30 individus ou plus d'un même type d'animal 

    Args:
        troupeau (dict): un dictionnaire modélisant un troupeau {nom_animaux: nombre}

    Returns:
        bool: True si le troupeau contient 30 (ou plus) individus d'un même type d'animal,
        False sinon 
    """
    for val in troupeau.values():
        if val >= 30:
            return True 
    return False


def le_plus_represente(troupeau):
    """ Recherche le nom de l'animal qui a le plus d'individus dans le troupeau
    
    Args:
        troupeau (dict): un dictionnaire modélisant un troupeau {nom_animaux: nombre}

    Returns:
        str: le nom de l'animal qui a le plus d'individus  dans le troupeau
        None si le troupeau est vide) 
    
    """
    nom = None
    maxi = 0
    for val in troupeau.items():
        if val[1] > maxi:
            maxi = val[1]
            nom = val[0]
    return nom
        


def quantite_suffisante(troupeau):
    """ Vérifie si le troupeau contient au moins 5 individus de chaque type d'animal

    Args:
        troupeau (dict): un dictionnaire modélisant un troupeau {nom_animaux: nombre}

    Returns:
        bool: True si le troupeau contient au moins 5 individus de chaque type d'animal
        False sinon    
    """
    for val in troupeau.values():
        if val < 5:
            return False
    return True


def reunion_troupeaux(troupeau1, troupeau2):
    """ Simule la réunion de deux troupeaux

    Args:
        troupeau1 (dict): un dictionnaire modélisant un premier troupeau {nom_animaux: nombre}
        troupeau2 (dict): un dictionnaire modélisant un deuxième troupeau        

    Returns:
        dict: le dictionnaire modélisant la réunion des deux troupeaux    
    """
    new_tp = {}
    for val in troupeau1.items():
        if val[0] in troupeau2:
            new_tp[val[0]] = troupeau2[val[0]] + val[1]
        else:
            new_tp[val[0]] = val[1]
    for val in troupeau2.items():
        if val[0] not in new_tp:
            new_tp[val[0]] = val[1]
    return new_tp



