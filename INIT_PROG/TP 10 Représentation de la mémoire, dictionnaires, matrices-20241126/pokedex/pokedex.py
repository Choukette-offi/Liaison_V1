"""Init Dev : TP10"""

# =====================================================================
# Exercice 1 : Choix de modélisation et complexité
# =====================================================================
# Modélisation n°1
# =====================================================================

# Penser à completer la fonction exemples_pokedex_v1 dans le fichier de tests

def appartient_v1(pokemon, pokedex): 
    """ renvoie True si pokemon (str) est présent dans le pokedex """
    for poke in pokedex:
        if pokemon in poke:
            return True 
    return False


def toutes_les_attaques_v1(pokemon, pokedex): 
    """
    param: un pokedex et le nom d'un pokemon (str) qui appartient au pokedex
    resultat: renvoie l'ensemble des types d'attaque du pokemon passé en paramètre
    """
    typee = set()
    for (poke , type) in pokedex:
        if poke == pokemon:
            typee.add(type)
    return typee

def nombre_de_v1(attaque, pokedex): 
    """
    param: un pokedex et un type d'attaque (str)
    resultat: renvoie le nombre de pokemons de ce type d'attaque
    dans le pokedex
    """
    cpt =0
    for (poke , type) in pokedex:
        if type == attaque:
            cpt += 1
    return cpt



def attaque_preferee_v1(pokedex):
    """
    Renvoie le nom du type d'attaque qui est la plus fréquente dans le pokedex
    """
    maxi = 0
    for (_ , type) in pokedex:
        if nombre_de_v1(type, pokedex) > maxi:
            maxi = nombre_de_v1(type, pokedex)
            nom = type
    return nom



# =====================================================================
# Modélisation n°2
# =====================================================================

# Penser à completer la fonction exemples_pokedex_v2 dans le fichier de tests

def appartient_v2(pokemon, pokedex):
    """ renvoie True si pokemon (str) est présent dans le pokedex """
    if pokemon in pokedex.keys():
        return True


def toutes_les_attaques_v2(pokemon, pokedex):
    """
    param: un pokedex et le nom d'un pokemon (str) qui appartient au pokedex
    resultat: renvoie l'ensemble des types d'attaque du pokemon passé en paramètre
    """
    return pokedex[pokemon]


def nombre_de_v2(attaque, pokedex):
    """
    param: un pokedex et un type d'attaque (str)
    resultat: renvoie le nombre de pokemons de ce type d'attaque
    dans le pokedex
    """
    cpt = 0
    for type in pokedex.values():
        if attaque in type:
            cpt +=1
    return cpt


def attaque_preferee_v2(pokedex):
    """
    Renvoie le nom du type d'attaque qui est la plus fréquente dans le pokedex
    """
    ...

# =====================================================================
# Modélisation n°3
# =====================================================================

# Penser à completer la fonction exemples_pokedex_v3 dans le fichier de tests


def appartient_v3(pokemon, pokedex):
    """ renvoie True si pokemon (str) est présent dans le pokedex """
    for typee in pokedex:
        if pokemon in pokedex[typee]:
            return True 
    return False


def toutes_les_attaques_v3(pokemon, pokedex):
    """
    param: un pokedex et le nom d'un pokemon (str) qui appartient au pokedex
    resultat: renvoie l'ensemble des types d'attaque du pokemon passé en paramètre
    """
    element = set()
    for type in pokedex:
        if pokemon in pokedex[type]:
            element.add(type)
    return element


def nombre_de_v3(attaque, pokedex):
    """
    param: un pokedex et un type d'attaque (str)
    resultat: renvoie le nombre de pokemons de ce type d'attaque
    dans le pokedex
    """
    if attaque in pokedex:
        return len(pokedex[attaque])
    else:
        return 0


def attaque_preferee_v3(pokedex):
    """
    Renvoie le nom du type d'attaque qui est la plus fréquente dans le pokedex
    """
    maxi = 0
    res = ''
    for typee in pokedex:
        if nombre_de_v3(typee, pokedex) > maxi:
            maxi = nombre_de_v3(typee, pokedex)
            res = typee
    return res


# =====================================================================
# Transformations
# =====================================================================

# Version 1 ==> Version 2

def v1_to_v2(pokedex_v1):
    """
    param: prend en paramètre un pokedex version 1
    renvoie le même pokedex mais en version 2
    """
    pokedex_V2 = dict()
    for (pokemon, typee) in pokedex_v1:
        if pokemon in pokedex_V2:
            pokedex_V2[pokemon].add(typee)
        else:
            pokedex_V2[pokemon] = set()
            pokedex_V2[pokemon].add(typee)
    return pokedex_V2
v1_to_v2({('Maraiste', 'Eau'), ('Maraiste', 'Sol'), ('Racaillou', 'Sol'),('Racaillou', 'Roche')})
# Version 1 ==> Version 2

def v2_to_v3(pokedex_v2):
    """
    param: prend en paramètre un pokedex version2
    renvoie le même pokedex mais en version3
    """
    ...

