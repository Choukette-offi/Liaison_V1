"""
def sante(taille, poids):
    #Permet de détecter un pb de santé en fonction de l’imc

    Args:
        taille (float): la taille de la personne en mètre
        poids (int): le poids de la personne en kg

    Returns:
       str: le problème enventuellement détecté
    imc = poids/(taille*taille)
    if imc < 16.5:
        res = "famine"
    elif imc < 18.5:
        res = "maigreur"
    elif imc < 25:
        res = "normal"
    elif imc < 30:
        res = "surpoids"
    else:
        res = "obésité"

    return res

def test_sante():
    assert sante(1.8, 80) == "normal" #indique que sante(1.8, 80) doit retourner "normal"
    assert sante(1.6, 67) == "surpoids" #indique que sante(1.6, 67) doit retourner "surpoids"
    """

def algo1(a, b, c, d):
    """Permets de connaître le nombre le plus petite des paramêtre donné

    Args:
        a (int): nombre
        b (int): nombre
        c (int): nombre
        d (int): nombre
    Returns:
        int : nombre le plus petit des 4 variables
    """
    if a < b:
        res = a
    else:
        res = b
    if c < res:
        res = c
    if d < res:
        res = d
    return res
def test_algo1():
    assert algo1(6, 8, 9, 40) == 6
    assert algo1(6, -4, 9, 40) == -4
    assert algo1(6, -4, -8, 40) == -8
    assert algo1(6, -4, 9, -60) == -60

def algo2(m):
    """Permets de savoir s'il y a plus de voyelle que de consonne 

    Args:
        m (str): mots testé

    Returns:
        booléen: renvoie True si il y plus de voyelle sinon False
    """
    res = 0
    for let in m:
        if let in 'aeiouy':
            res = res + 1
        else:
            res = res - 1
    return res > 0

def test_algo2():
    assert algo2('maman') == False
    assert algo2('nounou') == True

def qualif_omlympique(sexe, nb_victoire, record, champ_monde):
    """Permets de connaître sa qualification au JO

    Args:
        sexe (str): sexe du candidat
        nb_victoire (int): nombre de victoire du candidat au 100 sur 1ans
        record (float): record personnel au 100m
        champ_monde (bool): titre de champion du monde

    Returns:
        bool: True s'il est qualifié au JO sinon renvoie False
    """  
    res = False  
    if sexe == 'M':
        if (nb_victoire >= 3 and record < 12.0) or champ_monde:
            res = True
    elif (nb_victoire >= 3 and record < 15.0) or champ_monde:
        res = True  
    return res

def test_qualif_omlympique():
    assert qualif_omlympique('M', 6, 10.5, True) == True
    assert qualif_omlympique('F', 5, 12.5, True) == True
    assert qualif_omlympique('M', 1, 12.5, False) == False
    assert qualif_omlympique('F', 2, 15.5, False) == False

def contrav_vitesse(panneaux, vitesse):
    """ Permmet de savoir se qu'encoures le conducteur

    Args:
        panneaux (int): limitation de la route
        vitesse (int): vitesse du conducteur

    Returns:
        _type_: liste de sanction encourues
    """
    amende = 0
    pts_perdue = 0
    annee_susp = 0
    exe = vitesse - panneaux
    if exe > 0 and exe < 20:
        if panneaux > 50 :
            amende = 180
            pts_perdue = 1
        else : 
            amende = 375
            pts_perdue = 1
    elif exe >= 20 and exe < 30:
        amende = 375
        pts_perdue = 2
    
    elif exe >= 30 and exe < 40:
        amende = 375
        pts_perdue = 3
        annee_susp = 3  

    elif exe >= 40 and exe < 50:
        amende = 375
        pts_perdue = 4
        annee_susp = 3  

    elif exe >= 50:
        amende = 1500
        pts_perdue = 6
        annee_susp = 3
    
    return (amende, pts_perdue, annee_susp)

def test_contrav_vitesse():
    assert contrav_vitesse(20,35) == ()
    assert contrav_vitesse(60,68) == ...
    assert contrav_vitesse(80,105) == ...
    assert contrav_vitesse(80,115) == ...
    assert contrav_vitesse(110,155) == ...
    assert contrav_vitesse(130,200) == ...


"""pytest-3 -v sante.py"""