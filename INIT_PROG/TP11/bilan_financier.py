import time
def affiche_bilan_financier ( week_end ):
    som = 0
    nb = len(week_end)
    for pers in week_end:
        som += (week_end[pers])/nb
    for pers in week_end:
        if week_end[pers]>= som:
            print(pers, ' doit recevoir', week_end[pers] - som)
        else:
            print(pers, 'doit donner', som - week_end[pers])

def couple(crush):
    couple = []
    for pers in crush:
        amour = crush[pers]
        if crush[amour] == pers:
            nlist =(pers, crush[pers])
            if nlist not in couple:
                couple.append(nlist)
    return couple

def soupirants(crush, c_crush):
    amour = []
    for pers in crush:
        if c_crush == crush[pers]:
            amour.append(pers)
    return amour

def sous_matrice(matrice, nb_lignes, nb_colonnes, position_haut, position_gauche):
    mat_bloc=[]
    for i in range(nb_lignes,nb_lignes+position_haut):
        for j in range(nb_colonnes,nb_colonnes+position_gauche):
            mat_bloc.append(matrice[i][j])
    return mat_bloc
"""
def colle_sous_matrice(matrice,sousmatr, l, c):
    nbl = get_nb_lignes(matrice)
    nbc = get_nb_colonnes(matrice)
    hauteur = get_nb_lignes(sousmatr)
    largeur = get_nb_colonnes(sousmatr)
    if l>nbl or c>nbc or (l+hauteur)>nbl or (c+largeur)>nbc:
        return None 
    for ligne in range(l, l+get_nb_lignes(sousmatr)):
        for col in range(c, c+get_nb_colonnes(sousmatr)):
            set_val(matrice, ligne, col, sousmatr[ligne-l][col-c])
    return matrice
"""
def Syracuse(n):
    res = []
    while n != 1:
        res.append(n)
        if n%2==1:
            n = n*3+1
        else:
            n = n//2
    res.append(n)
    return res

def temps_vol(n):
    return len(Syracuse(n))-1

def champion(n):
    maxi = 0
    nombre = 0
    for i in range(n):
        if maxi < temps_vol(n-i):
            maxi = temps_vol(n-i)
            nombre = n-i
    return nombre

start = time.time()
"""
print(champion(109647))

print(time.time() - start)
"""

def temps_de_vols_avec_precalcul(n,temps_connus):
    cpt = 0
    while n != 1:
        if n in temps_connus:
            cpt += temps_connus[n]
            return cpt 
        if n%2==1:
            n = n*3+1
            cpt +=1
        else:
            n = n//2
            cpt +=1
    return cpt