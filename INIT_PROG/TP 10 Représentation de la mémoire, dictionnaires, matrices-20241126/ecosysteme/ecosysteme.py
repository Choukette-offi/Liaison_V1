"""
Init Dev : TP10
Exercice 2 : Ecosystème
"""

def extinction_immediate(ecosysteme, animal):
    """
    renvoie True si animal s'éteint immédiatement dans l'écosystème faute
    de nourriture
    """
    return not(ecosysteme[animal] in ecosysteme.keys() or ecosysteme[animal] is None)


def en_voie_disparition(ecosysteme, animal):
    """
    renvoie True si animal s'éteint est voué à disparaitre à long terme
    """
    extinction=False
    cpt=0
    while extinction==False and animal!=None and cpt<len(ecosysteme):
        extinction=extinction_immediate(ecosysteme,animal)
        cpt+=1
        if not extinction:
            animal=ecosysteme[animal]
    return extinction
    

def animaux_en_danger(ecosysteme):
    """ renvoie l'ensemble des animaux qui sont en danger d'extinction immédiate"""
    animaux=set()
    for animal in ecosysteme.keys():
        if extinction_immediate(ecosysteme,animal):
            animaux.add(animal)
    return animaux


def especes_en_voie_disparition(ecosysteme):
    """ renvoie l'ensemble des animaux qui sont en voués à disparaitre à long terme
    """
    animaux=set()
    for animal in ecosysteme.keys():
        if en_voie_disparition(ecosysteme,animal):
            animaux.add(animal)
    return animaux




