# coding: utf-8
"""
            SAE1.02 SERPIUT'O
         BUT1 Informatique 2024-2025

    Module serpent.py
    Ce module implémente l'API permettant de gérer les informations des joueurs (idenfier à leur serpent)
"""
import arene

def Serpent(nom_joueur:str, num_joueur:int,points:int=0,positions:list=None,tps_s:int=0,tps_p:int=0,tps_m:int=0,direction:str='N')->dict:
    """Créer un joueur avec toutes les informations le concernant.

    Args:
        nom_joueur (str): nom du joueur
        num_joueur (int): numero du joueur
        points (int, optional): nombre de points attribués au joueur. Defaults to 0.
        positions (list, optional): la liste des positions occupées par le serpent sur l'arène. Defaults to None.
        tps_s (int, optional): temps restant pour le bonus surpuissance. Defaults to 0.
        tps_p (int, optional): temps restant pour le bonus protection. Defaults to 0.
        tps_m (int, optional): temps restant pour le bonus mange-mur. Defaults to 0.
        direction (str, optional): dernière direction prise par le serpent. Defaults to 'N'.

    Returns:
        dict: une dictionnaire contenant les informations du serpent
    """    
    
    return {"nom_joueur":nom_joueur, "num_joueur":num_joueur, "points":points, "positions":positions, "tps_s":tps_s, "tps_p":tps_p, "tps_m":tps_m, "direction":direction}

def get_nom(serpent:dict)->str:
    """retourne le nom du joueur associé au serpent

    Args:
        serpent (dict): le serpent considéré

    Returns:
        str: le nom du joueur associé à ce serpent
    """    
    return serpent["nom_joueur"]

def get_num_joueur(serpent:dict)->int:
    """retourne le numéro du joueur associé au serpent

    Args:
        serpent (dict): le serpent considéré

    Returns:
        int: le numéro du joueur associé à ce serpent
    """   
    return serpent["num_joueur"]

def get_points(serpent:dict)->int:
    """retourne le nombre de points du joueur associé au serpent

    Args:
        serpent (dict): le serpent considéré

    Returns:
        int: le nombre de points du joueur associé à ce serpent
    """   
    return serpent["points"]

def get_liste_pos(serpent:dict)->list:
    """retourne la liste des positions occupées par le serpent sur l'arène. La première position étant la tête du serpent

    Args:
        serpent (dict): le serpent considéré

    Returns:
        list: la liste des positions occupées par le sserpent
    """    
    return serpent["positions"]

def get_queue(serpent:dict)->[int,int]:
    """retourne la position (lig,col) de la queue du serpent dans l'arène

    Args:
        serpent (dict): le serpent considéré

    Returns:
        [int,int]: la position lig,col du la queue du serpent
    """    
    return serpent["positions"][-1] # incertain

def get_derniere_direction(serpent:dict)->str:
    """retourne la dernière direction choisie par le joueur pour se déplacer

    Args:
        serpent (dict): le serpent considéré

    Returns:
        str: un des caractère N S E O
    """    
    return serpent["direction"]

def get_bonus(serpent:dict)->list:
    """retourne une liste contenant les bonus obtenus par le joueur
        c'est-à-dire ceux pour lesquels le temps restant est supérieur à 0

    Args:
        serpent (dict): le serpent considéré

    Returns:
        list: la liste des bonus du joueur
    """  
    bonus_restant = []
    if serpent["tps_s"]>0 :
        bonus_restant.append(arene.SURPUISSANCE)
    if serpent["tps_p"]>0 :
        bonus_restant.append(arene.PROTECTION)
    if serpent["tps_m"]>0 :
        bonus_restant.append(arene.MANGE_MUR)
    return bonus_restant


def ajouter_points(serpent:dict,nb_points:int):
    """ajoute (ou enlève) des points à un serpent

    Args:
        serpent (dict): le serpent considéré
        nb_points (int): le nombre de points à ajouter (si négatif enlève des points)
    """    
    serpent["points"] += nb_points

def set_liste_pos(serpent:dict, tete:list):
    """initialise la liste des positions d'un serpent

    Args:
        serpent (dict): le serpent considéré
        tete (list): la liste des positions occupées par ce serpent
    """    
    serpent["positions"] = tete

def set_derniere_direction(serpent:dict, direction:str):
    """Met à jour la dernière direction utilisée par le serpent (utile pour l'affichage)

    Args:
        serpent (dict): le serpent considéré
        direction (str): un des caractère N S E O
    """    
    serpent["direction"] = direction

def to_str(serpent:dict)->str:
    """produit une chaine de caractères contenant les informations principales d'un serpent sour la forme
    Joueur 1 -> 143 s:0 m:4 p:0
    où Joueur 1 est le nom du joueur, après la flèche se trouve le nombre de point
    puis le temps restant de chaque bonus (supuissante, mange mur et protection)

    Args:
        serpent (dict): le serpent considéré

    Returns:
        str: la chaine de caractères donnant les informations principales d'un serpent 
    """    
    info = f"{serpent["nom_joueur"]} -> {serpent["points"]} s:{serpent["tps_s"]} m:{serpent["tps_m"]} p:{serpent["tps_p"]}" 
    return info

def get_temps_protection(serpent:dict)->int:
    """indique le temps restant pour le bonus protection

    Args:
        serpent (dict): le serpent considéré

    Returns:
        int: le nombre de tours restant pour ce bonus
    """    
    return serpent["tps_p"]


def get_temps_mange_mur(serpent:dict)->int:
    """indique le temps restant pour le bonus mange mur

    Args:
        serpent (dict): le serpent considéré

    Returns:
        int: le nombre de tours restant pour ce bonus
    """   
    return serpent["tps_m"]

def get_temps_surpuissance(serpent:dict)->int:
    """indique le temps restant pour le bonus surpuissance

    Args:
        serpent (dict): le serpent considéré

    Returns:
        int: le nombre de tours restant pour ce bonus
    """   

    return serpent["tps_s"]

def ajouter_temps_protection(serpent:dict, temps:int)->int:
    """ajoute du temps supplémentaire pour le bonus protection

    Args:
        serpent (dict): le serpent considéré
        temps (int): le nombre de tours à ajouter

    Returns:
        int: le nombre de tours total restant pour ce bonus
    """    
    serpent["tps_p"] = serpent.get("tps_p",0) + temps
    return serpent["tps_p"]

def ajouter_temps_mange_mur(serpent:dict, temps:int)->int:
    """ajoute du temps supplémentaire pour le bonus mange mur

    Args:
        serpent (dict): le serpent considéré
        temps (int): le nombre de tours à ajouter

    Returns:
        int: le nombre de tours total restant pour ce bonus
    """    
    serpent["tps_m"] = serpent.get("tps_m",0) + temps
    return serpent["tps_m"]

def ajouter_temps_surpuissance(serpent:dict, temps:int)->int:
    """ajoute du temps supplémentaire pour le bonus surpuissance

    Args:
        serpent (dict): le serpent considéré
        temps (int): le nombre de tours à ajouter

    Returns:
        int: le nombre de tours total restant pour ce bonus
    """ 
    serpent["tps_s"] = serpent.get("tps_s",0) + temps
    return serpent["tps_s"]

def maj_temps(serpent:dict):
    """Décrémente les temps restant pour les bonus de ce serpent
    Attention les temps ne peuvent pas être négatif

    Args:
        serpent (dict): le serpent considéré
    """ 
    bonus = get_bonus(serpent)
    if arene.SURPUISSANCE in bonus :
        serpent["tps_s"] -= 1
    if arene.MANGE_MUR in bonus :
        serpent["tps_m"] -= 1
    if arene.PROTECTION in bonus :
        serpent["tps_p"] -= 1

def serpent_2_str(serpent:dict, sep=";")->str:
    """Sérialise un serpent sous la forme d'une chaine de caractères
    contenant 2 lignes.
    nom_j;num_j;nb_point;tps_surpuissance;tps_mange_mur;tps_protection
    lig1;col1;lig2;col2;...
    La première ligne donne les informations autres que la liste des positions du serpent
    la deuxième ligne donné la liste des position du serpent en commençant par la tête
    Args:
        serpent (dict): le serpent considéré
        sep (str, optional): le caractère séparant les informations du serpent. Defaults to ";".

    Returns:
        str: la chaine de caractères contenant les toutes informations du serpent
    """    
    info = f"{serpent.get("nom_joueur",0)}{sep}{serpent.get("num_joueur",0)}{sep}{serpent.get("points",0)}{sep}{serpent.get("tps_s",0)}{sep}{serpent.get("tps_p",0)}{sep}{serpent.get("tps_m",0)}{sep}{serpent.get("direction",0)}\n"
    for (l,c) in serpent["positions"]:
        info = info + str(l) + sep + str(c) + sep
    info = info[:-1]
    return info + '\n'

def serpent_from_str(la_chaine, sep=";")->dict:
    """Reconstruit un serpent à partilist_serpent_split = la_chaine.split(sep)
    dico_serpent = Serpent(list_serpent_split[0],list_serpent_split[1])
        la_chaine (_type_): la chaine de caractères contenant les informations du serpent
        sep (str, optional): le caractère servant à séparer les informations du serpent. Defaults to ";".

    Returns:
        dict: Le serpent représenté dans la chaine de caractères
    """
    list_serpent_split = la_chaine.split('\n')
    list_serpent_values = list_serpent_split[0].split(sep)
    list_serpent_position = list_serpent_split[1].split(sep)
    list_serpent_position_check = []
    for i in range(0,len(list_serpent_position)-1,2):
        list_serpent_position_check.append([int(list_serpent_position[i]),int(list_serpent_position[i+1])])
    return {"nom_joueur":list_serpent_values[0], "num_joueur":int(list_serpent_values[1]), "points":int(list_serpent_values[2]), "positions":list_serpent_position_check, "tps_s":int(list_serpent_values[3]), "tps_p":int(list_serpent_values[4]), "tps_m":int(list_serpent_values[5]), "direction":list_serpent_values[6]}

def copy_serpent(serpent:dict)->dict:
    """fait une copie du serpent passer en paramètres
    Attention à bien faire une copie de la liste des positions
    

    Args:
        serpent (dict): le serpent à recopier

    Returns:
        dict: la copie du serpent passé en paramètres
    """ 
    copie_serpent = {}
    for elem, val in serpent.items():
        if type(val) is list:
            copie_serpent[elem] = val[:]
        else:
            copie_serpent[elem] = val
    return copie_serpent
