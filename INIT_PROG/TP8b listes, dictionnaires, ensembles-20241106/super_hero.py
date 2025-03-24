def intelligence_moyenne(SH):
    """permet de calculer l'intelligence moyenne des supers héros

    Args:
        SH (dict): equipe de super héros 

    Returns:
        float: moyenne de l'intelligence
    """    
    som = 0
    cpt = 0
    for val in SH.values():
        som += val[1]
        cpt += 1
    if cpt != 0 :
        return som/cpt
    return None

def le_plus_fort(SH):
    maxi = 0
    name = ""
    for nom, val in SH.items():
        if val[0] > maxi:
            name = nom
    return name

