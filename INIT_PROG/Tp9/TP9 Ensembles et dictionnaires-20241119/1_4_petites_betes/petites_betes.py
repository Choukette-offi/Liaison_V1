"""Init Dev : TP9"""


# ==========================
# Petites bêtes
# ==========================

def toutes_les_familles(pokedex):
    """détermine l'ensemble des familles représentées dans le pokedex

    Args:
        pokedex (list): liste de pokemon, chaque pokemon est modélisé par
        un couple de str (nom, famille)

    Returns:
        set: l'ensemble des familles représentées dans le pokedex
    """
    #O(N)
    famille = set()
    for (_,type) in pokedex:
        famille.add(type)
    return famille

def nombre_pokemons(pokedex, famille):
    """calcule le nombre de pokemons d'une certaine famille dans un pokedex

    Args:
        pokedex (list): liste de pokemon, chaque pokemon est modélisé par
        un couple de str (nom, famille)
        famille (str): le nom de la famille concernée

    Returns:
        int: le nombre de pokemons d'une certaine famille dans un pokedex
    """
    #O(N)
    cpt = 0
    for (_,type) in pokedex:
        if type == famille:
            cpt += 1
    return cpt

def frequences_famille(pokedex):
    """Construit le dictionnaire de fréqeunces des familles d'un pokedex

    Args:
        pokedex (list): liste de pokemon, chaque pokemon est modélisé par
        un couple de str (nom, famille)

    Returns:
        dict: un dictionnaire dont les clés sont le nom de familles (str)
        et la valeur associée est le nombre de représentants de la famille (int)
    """
    #O(N)
    poke_dict = dict()
    for (_, type) in pokedex:
        if type in poke_dict:
            poke_dict[type] += 1
        else:
            poke_dict[type] = 1
    return poke_dict

def dico_par_famille(pokedex):
    """Construit un dictionnaire dont les les clés sont le nom de familles (str)
    et la valeur associée est l'ensemble (set) des noms des pokemons de cette
    famille dans le pokedex

    Args:
        pokedex (list): liste de pokemon, chaque pokemon est modélisé par
        un couple de str (nom, famille)

    Returns:
        dict: un dictionnaire dont les clés sont le nom de familles (str) et la valeur associée est
        l'ensemble (set) des noms des pokemons de cette famille dans le pokedex
    """
    #O(N)
    poke_dict = dict()
    for (nom, type) in pokedex:
        if type in poke_dict:
            poke_dict[type].add(nom)
        else:
            poke_dict[type] = {nom}
    return poke_dict

def famille_la_plus_representee(pokedex):
    """détermine le nom de la famille la plus représentée dans le pokedex

    Args:
        pokedex (list): liste de pokemon, chaque pokemon est modélisé par
        un couple de str (nom, famille)

    Returns:
        str: le nom de la famille la plus représentée dans le pokedex
    """
    #O(N)
    nom = ''
    maxi = 0
    for (_, type) in pokedex:
        if maxi < nombre_pokemons(pokedex, type):
            maxi = nombre_pokemons(pokedex, type)
            nom = type
    return nom


# ==========================
# Petites bêtes (la suite)
# ==========================


def toutes_les_familles_v2(pokedex):
    """détermine l'ensemble des familles représentées dans le pokedex

    Args:
        pokedex (dict): un dictionnaire dont les clés sont les noms de pokemons et la
        valeur associée l'ensemble (set) de ses familles (str)

    Returns:
        set: l'ensemble des familles représentées dans le pokedex
    """
    famille = set()
    for elem in pokedex.values():
        for type in elem:
            famille.add(type)
    return famille

def nombre_pokemons_v2(pokedex, famille):
    """calcule le nombre de pokemons d'une certaine famille dans un pokedex

    Args:
        pokedex (dict): un dictionnaire dont les clés sont les noms de pokemons et la
        valeur associée l'ensemble (set) de ses familles (str)
        famille (str): le nom de la famille concernée

    Returns:
        int: le nombre de pokemons d'une certaine famille dans un pokedex
    """
    cpt = 0
    for elem in pokedex.values():
        for type in elem:
            if type == famille:
                cpt +=1
    return cpt

def frequences_famille_v2(pokedex):
    """Construit le dictionnaire de fréqeunces des familles d'un pokedex

    Args:
        pokedex (dict): un dictionnaire dont les clés sont les noms de pokemons et la
        valeur associée l'ensemble (set) de ses familles (str)

    Returns:
        dict: un dictionnaire dont les clés sont le nom de familles (str) et la valeur
        associée est le nombre de représentants de la famille (int)
    """
    pokidoux = dict()
    for type in toutes_les_familles_v2(pokedex):
        pokidoux[type] = nombre_pokemons_v2(pokedex, type)
    return pokidoux 

def dico_par_famille_v2(pokedex):
    """Construit un dictionnaire dont les clés sont le nom de familles (str)
    et la valeur associée est l'ensemble (set) des noms des pokemons de
    cette famille dans le pokedex

    Args:
        pokedex (dict): un dictionnaire dont les clés sont les noms de pokemons et la
        valeur associée l'ensemble (set) de ses familles (str)

    Returns:
        dict: un dictionnaire dont les clés sont le nom de familles (str) et la valeur associée est
        l'ensemble (set) des noms des pokemons de cette famille dans le pokedex
    """
    dico = dict()
    for app in toutes_les_familles_v2(pokedex):
        for poke, in pokedex

def famille_la_plus_representee_v2(pokedex):
    """détermine le nom de la famille la plus représentée dans le pokedex

    Args:
        pokedex (dict): un dictionnaire dont les clés sont les noms de pokemons et la
        valeur associée l'ensemble (set) de ses familles (str)

    Returns:
        str: le nom de la famille la plus représentée dans le pokedex
    """
    ...
