""" Matrices : API n 1 """


def matrice(nb_lignes, nb_colonnes, valeur_par_defaut=0):
    """crée une nouvelle matrice en mettant la valeur par défaut dans chacune de ses cases.

    Args:
        nb_lignes (int): le nombre de lignes de la matrice
        nb_colonnes (int): le nombre de colonnes de la matrice
        valeur_par_defaut : La valeur que prendra chacun des éléments de la matrice

    Returns:
        une nouvelle matrice qui contient la valeur par défaut dans chacune de ses cases
    """
    mat=[[valeur_par_defaut for _ in range(nb_colonnes)] for _ in range(nb_lignes)]
    return mat
        

def set_val(la_matrice, ligne, colonne, nouvelle_valeur):
    """permet de modifier la valeur de l'élément qui se trouve à la ligne et à la colonne
    spécifiées. Cet élément prend alors la valeur nouvelle_valeur

    Args:
        la_matrice : une matrice
        ligne (int) : le numéro d'une ligne (la numérotation commence à zéro)
        colonne (int) : le numéro d'une colonne (la numérotation commence à zéro)
        nouvelle_valeur : la nouvelle valeur que l'on veut mettre dans la case

    Returns:
        None
    """
    la_matrice[ligne][colonne]=nouvelle_valeur



def get_nb_lignes(la_matrice):
    """permet de connaître le nombre de lignes d'une matrice

    Args:
        la_matrice : une matrice

    Returns:
        int : le nombre de lignes de la matrice
    """
    return len(la_matrice)

def get_nb_colonnes(la_matrice):
    """permet de connaître le nombre de colonnes d'une matrice

    Args:
        la_matrice : une matrice

    Returns:
        int : le nombre de colonnes de la matrice
    """
    if len(la_matrice) !=0:
        return len(la_matrice[0])

def get_val(la_matrice, ligne, colonne):
    """permet de connaître la valeur de l'élément de la matrice dont on connaît
    le numéro de ligne et le numéro de colonne.

    Args:
        la_matrice : une matrice
        ligne (int) : le numéro d'une ligne (la numérotation commence à zéro)
        colonne (int) : le numéro d'une colonne (la numérotation commence à zéro)

    Returns:
        la valeur qui est dans la case située à la ligne et la colonne spécifiées
    """
    return la_matrice[ligne][colonne]

# Fonctions pour l'affichage

def affiche_ligne_separatrice(la_matrice, taille_cellule=4):
    """fonction auxilliaire qui permet d'afficher (dans le terminal)
    une ligne séparatrice

    Args:
        la_matrice : une matrice
        taille_cellule (int, optional): la taille d'une cellule. Defaults to 4.
    """
    print()
    for _ in range(get_nb_colonnes(la_matrice) + 1):
        print('-' * taille_cellule + '+', end = '')
    print()


def affiche(la_matrice, taille_cellule=4):
    """permet d'afficher une matrice dans le terminal

    Args:
        la_matrice : une matrice
        taille_cellule (int, optional): la taille d'une cellule. Defaults to 4.
    """
    nb_colonnes = get_nb_colonnes(la_matrice)
    nb_lignes = get_nb_lignes(la_matrice)
    print(' '*taille_cellule+'|', end='')
    for indice in range(nb_colonnes):
        print(str(indice).center(taille_cellule) + '|', end = '')
    affiche_ligne_separatrice(la_matrice, taille_cellule)
    for ind in range(nb_lignes):
        print(str(ind).rjust(taille_cellule) + '|', end = '')
        for ind_j in range(nb_colonnes):
            print(str(get_val(la_matrice, ind, ind_j)).rjust(taille_cellule) + '|', end='')
        affiche_ligne_separatrice(la_matrice, taille_cellule)
    print()


# Ajouter ici les fonctions supplémentaires, sans oublier de compléter le fichier
# tests_API_matrice.py avec des fonctions de tests

def charge_matrice_str(nom_fichier):
    """permet créer une matrice de str à partir d'un fichier CSV.

    Args:
        nom_fichier (str): le nom d'un fichier CSV (séparateur  ',')

    Returns:
        une matrice de str
    """
    fic=open(nom_fichier,'r')
    mat=[]
    tab=fic.read()
    print(type(tab))
    print(tab)
    for ligne in fic:
        for carac in ligne:
            if carac not in "[]":
                carac.append()
        mat.append()
    return mat

def sauve_matrice(la_matrice, nom_fichier):
    """permet sauvegarder une matrice dans un fichier CSV.
    Attention, avec cette fonction, on perd l'information sur le type des éléments

    Args:
        la_matrice : une matrice
        nom_fichier (str): le nom du fichier CSV que l'on veut créer (écraser)

    Returns:
        None
    """
    fic=open(nom_fichier,"w")
    for i in range(len(la_matrice)):
        fic.write(f'{la_matrice[i]}\n')
    fic.close()

def diagonale_principale(la_matrice):
    """Fonction qui renvoie sous la forme d'une liste la diagonale d'une matrice

    Args:
        la_matrice (list): Matrice

    Returns:
        List: La diagonale de la matrice
    """    
    diag=[]
    for i in range(len(la_matrice)):
        diag.append(get_val(la_matrice,i,i))
    return diag

def diagonale_secondaire(la_matrice):
    diag=[]
    for i in range(len(la_matrice)):
        diag.append(get_val(la_matrice,i,len(la_matrice[i])-(i+1)))
    return diag

def get_colonne(la_matrice,numcol):
    col=[]
    for ligne in la_matrice:
        col.append(ligne[numcol])
    return col

def transpose(la_matrice):
    mat=[]
    for i in range(len(la_matrice)):
        mat.append(get_colonne(la_matrice,i))
    return mat

def triangulaire_sup(la_matrice):
    for i in range(len(la_matrice)):
        for j in range(len(la_matrice[i])):
            if j<i and la_matrice[j]!=0:
                    return False
    return True

def triangulaire_inf(la_matrice):
    for i in range(len(la_matrice)):
        for j in range(len(la_matrice[i])):
            if j>i and la_matrice[j]!=0:
                    return False
    return True

def bloc(la_matrice,ligne,colonne,hauteur,largeur):
    mat_bloc=[]
    for i in range(ligne,ligne+hauteur):
        for j in range(colonne,colonne+largeur):
            mat_bloc.append(la_matrice[i][j])
    return mat_bloc

def somme_mat(matrice1,matrice2):
    mat=[]
    lgn = []
    if len(matrice1)!=len(matrice2):
        return None
    for i in range(len(matrice1)):
        if mat != []:
            mat.append(lgn)
        lgn = []
        for j in range(len(matrice1)):
            lgn.append(matrice1[i][j]+ matrice2[i][j])
    return mat

def produit_mat(matrice1, matrice2):
    mat = []
    lgn = []
    som = []
    if len(matrice1) != len(matrice2[0]):
        return None
    for i in range(len(matrice1)):
        if mat != []:
            mat.append(lgn)
        lgn = []
        for j in range(len(matrice2[0])):
            if lgn != []:
                lgn.append(som)
            som = 0
            for k in range(len(matrice2[0])):
                som = matrice1[i][j] * matrice2[k][j]
    return mat
