def trouver_dans_liste(liste, cible):
    indice = 0
    res = False
    while not res or indice < len(liste):
        if liste[indice] == cible:
            res = True
        indice += 1
    return res

def cumuler_jusqu_a_seuil(dictionnaire, seuil):
    total = 0
    res = False
    while not res:
        for cle, valeur in dictionnaire.items():
            total += valeur
            if total >= seuil:
                res = True
    return total

