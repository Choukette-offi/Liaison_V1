# exercice 1
def dominante_pair(entree):
    """Permet de savoir si dans une liste donné il y a plus de nombre pair ou autant que d'impair

    Args:
        entree (liste): liste de nombre a tester

    Returns:
        [bool]: renvoie True s'il y a au moins autant de nb paire dans la liste testé
    """
    pair = 0
    impair = 0
    # au début de chaque tour de boucle
    #  A COMPLETER
    for val in entree:
        if val % 2 == 0:
            pair += 1
        else:
            impair += 1
    return pair >= impair
#print(dominante_pair([1,4,6,-2,-5,3,10]))

def teste_dominante_pair():
    assert dominante_pair([1, 2, 4, 5, 8]) == True
    assert dominante_pair([3, 5, 7, 8, 9]) == False
    assert dominante_pair([-2, 10, 35, 72, 33, 43]) == True
    assert dominante_pair([]) == True

# exercice 2
def min_sup(liste_nombres, valeur):
    """trouve le plus petit nombre d'une liste supérieur à une certaine valeur

    Args:
        liste_nombres (list): la liste de nombres
        valeur (int ou float): la valeur limite du minimum recherché

    Returns:
        int ou float: le plus petit nombre de la liste supérieur à valeur
    """
    res = None
    # au début de chaque tour de boucle res est le plus petit élément
    # déjà énuméré supérieur à valeur
    for elem in liste_nombres:
        if res is None:
            if valeur < elem:
                res = elem
        elif valeur < elem < res:
            res = elem
    return res
#print(min_sup([-2, -5, 2, 9.8, -8.1, 7], 0))


def test_min_sup():
    assert min_sup([8, 12, 7, 3, 9, 2, 1, 4, 9], 5) == 7
    assert min_sup([-2, -5, 2, 9.8, -8.1, 7], 0) == 2
    assert min_sup([5, 7, 6, 5, 7, 3], 10) is None
    assert min_sup([], 5) is None


# exercice 3
def nb_mots(phrase):
    """Fonction qui compte le nombre de mots d'une phrase

    Args:
        phrase (str): une phrase dont les mots sont
        séparés par des espaces (éventuellement plusieurs)

    Returns:
        int: le nombre de mots de la phrase
    """    
    resultat = 0
    c1 = ' '
    # au début de chaque tour de boucle
    # c1 vaut
    # c2 vaut
    # resultat vaut
    for c2 in phrase:
        if c1 == ' ' and c2 != ' ':
            resultat = resultat + 1
        c1 = c2
    return resultat
print(nb_mots("houla!     je    mets beaucoup   d'  espaces    "))

def test_nb_mots():
    assert nb_mots("bonjour, il fait beau") == 4
    assert nb_mots("houla!     je    mets beaucoup   d'  espaces    ") == 6
    assert nb_mots(" ce  test ne  marche pas ") == 5
    assert nb_mots("") == 0  # celui ci non plus

def sommes_pair(ls):
    """ Permets de connaître la sommes des nombres pairs d'une liste
    Args:
        ls (str): liste de nombre soumis au teste

    Returns:
        int: somme des nombres pairs
    """    
    som = 0
    for val in ls:
        if val%2 == 0:
            som = som + val

    return som

def test_sommes_pair():
    assert sommes_pair([1,2,3,4,5,6])== 12
    assert sommes_pair([]) == 0
    assert sommes_pair([1, 3 ,5 ,7]) == 0
    assert sommes_pair([-1,-2,-4]) == -6

def last_voy(mot):
    """permets de savoir la dernière voyelle du mot

    Args:
        mot (str): mot a tester

    Returns:
        str: dernière voyelle du mot
    """    
    #au début de chaque tour voy contient la dernière voyelle enregisté
    voy = None
    for let in mot:
        if let in 'aeiouy':
            voy = let
    return voy

def teste_last_voy():
    assert last_voy('balance') == 'e'
    assert last_voy('qwrt') == None
    assert last_voy ('board') == 'a'
    assert last_voy ('') == None

def prop_negatif(liste):
    """Permts de savoir le pourcentage de présence de nombre négatif d'une liste

    Args:
        liste (str): liste a tester

    Returns:
        None or int or float: donne le poucentage de présence des nombres négatifs dans la liste donné
    """  
    #cpt contient au début de chaque tour le nb de valeur parcourues
    #cpt_n contient au ,début de chaque tour le nombre de valeur négatif parcourues
    res = None
    cpt_n = 0
    cpt = 0
    for val in liste: 
        if val < 0:
            cpt_n += 1
            cpt += 1
        else:
            cpt += 1
        
    if cpt !=0:
        res = cpt_n / cpt
    return res

def teste_prop_negatif():
    assert prop_negatif([]) is None
    assert prop_negatif([-1,2,-4,6]) == 0.5
    assert prop_negatif([1,2,3,4]) == 0
    assert prop_negatif([-1,-2,-3])== 1.0

def somme_n(nb):
    """permets de faire la somme des N premiers entiers

    Args:
        nb (int): nombre de fois que l'on fait la somme _

    Returns:
        int: renvoie la somme
    """    
    #cpt qui 
    cpt = 0
    res = 0
    for _ in range(nb+1):
        res = res + cpt
        cpt += 1
    return res

def test_somme_n():
    assert somme_n(3) == 6
    assert somme_n(0) == 0
    assert somme_n(-1) == 0
    assert somme_n (-3) == 0

def syracuse(n, val_init): 
    """ Permets d'appliquer la fonction syracuse sur un nombre 

    Args:
        n (_int_): nombre de fois que l'on applique syracuse sur le nombre
        val_init (int): nombre testé

    Returns:
        int: renvoie le nombre testé transformé 
    """    
    # invariant: val_init est soit divisé par 2 soit multiplié par 3 plus 1
    for _ in range(n):
        if val_init%2 == 0:
            val_init = val_init/ 2 
        else:
            val_init = val_init * 3 + 1
    return val_init

def test_syracuse():
    assert syracuse(2,6) == 10
    assert syracuse(4,0) == 0
    assert syracuse(1,4) == 2
    assert syracuse(0,12) == 12    

def somme_liste(ls):
    """fait la somme d'une liste

    Args:
        ls (liste): liste de nombre

    Returns:
        int: renvoie la somme de toute la liste
    """   
    #som contient la somme des valeur de la liste deja parcouru
    som = 0
    for val in ls:
        som = val + som
    return som

def test_somme_liste():
    assert somme_liste([2, 4 ,6, 8]) == 20
    assert somme_liste([1, -2, -4, 5]) == 0
    assert somme_liste([]) == 0
    assert somme_liste([-1, -3, -5]) == -9

def maxi_liste(ls):
    """permets de connaître le max de la liste donner

    Args:
        ls (litse): liste a tester 

    Returns:
        int: le max de la liste 
    """    
    #max contient a chaque tour de boucle le max de la liste parcourue
    maxi = None
    for val in ls:
        if maxi is None:
            maxi = val
        elif val > maxi:
            maxi = val
    return maxi

def test_maxi_liste():
    assert maxi_liste([1, 6, 5, 87, 65, 12]) == 87
    assert maxi_liste([]) is None
    assert maxi_liste([-15, -1, -5]) == -1
    assert maxi_liste([-50, 0 , 15]) == 15

def nb_occ(lettre, mot):
    """permets de connbaître le nb d'occ d'une lettre dans un mot

    Args:
        lettre (str): lettre occurence
        mot (str): mot testé

    Returns:
        int: nb occ de la lettre dans le mot
    """
    cpt = 0
    for let in mot:
        if let == lettre:
            cpt += 1
    return cpt

def test_nb_occ():
    assert nb_occ('l', 'lila') == 2
    assert nb_occ('a', 'seb') == 0
    assert nb_occ(' ', 'il y a 4 espaces') == 4
    assert nb_occ('i', 'wistiti') == 3

def min_liste(ls):
    """permets de connaître le min de la liste donner

    Args:
        ls (litse): liste a tester 

    Returns:
        int: le min de la liste 
    """    
    #max contient a chaque tour de boucle le min de la liste parcourue
    min = None
    for val in ls:
        if min is None:
            min = val
        elif val < min:
            min = val
    return min

def test_min_liste():
    assert min_liste([12,16,18,6,3,5]) == 3
    assert min_liste([]) is None
    assert min_liste([6,10,-5,8,-9,5]) == -9
    assert min_liste([-50, 0 , 15]) == -50

def ecart_liste(ls):
    """permets de connaître l'écart entre le plus petit nb et le plus grand

    Args:
        ls (liste): liste testé

    Returns:
        int: ecart
    """    
    #maxi et mini contient a chaque tour de boucle le plus grand et le plsu petit nombre de la liste parcourue
    maxi = None
    mini = None
    for val in ls:
        if maxi is None:
            maxi = val
            mini = val
        elif val > maxi:
            maxi = val
        elif val < mini:
            mini = val
    if maxi is not None and mini is not None:
        return maxi - mini


def test_ecart_liste():
    assert ecart_liste([12,16,18,6,3,5]) == 15
    assert ecart_liste([6,10,-5,8,-9,5]) == 19
    assert ecart_liste([]) is None
    assert ecart_liste([-50, 50, 0, -5]) == 100

def sup_dix(ls):
    """élément supérieure a 10

    Args:
        ls (liste): liste a tester

    Returns:
        int: nombre d'élément sup a 10
    """    
    #cpt augmente d'un a chaque elem sup 10
    cpt = 0
    for val in sup_dix:
        if val > 10:
            cpt +=1
    return cpt

def teste_sup_dix():
    assert sup_dix([12,14,2,5,54]) == 3
    assert sup_dix([]) == 0
    assert sup_dix([2,4,6]) == 0

