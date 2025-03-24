def plus_long_plateau(chaine):
    """recherche la longueur du plus grand plateau d'une chaine
    Args:
        chaine (str): une chaine de caractères

    Returns:
        int: la longueur de la plus grande suite de lettres consécutives égales
    """
    lg_max = 0  # longueur du plus grand plateau déjà trouvé
    lg_actuelle = 0  # longueur du plateau actuel
    for i in range(len(chaine)):
        if chaine[i] == chaine[i-1]:  # si la lettre actuelle est égale à la précédente
            lg_actuelle += 1
        else:  # si la lettre actuelle est différente de la précédente
            if lg_actuelle > lg_max:
                lg_max = lg_actuelle
            lg_actuelle = 1
    if lg_actuelle > lg_max:  # cas du dernier plateau
        lg_max = lg_actuelle
    return lg_max
print(plus_long_plateau('abc'))
def teste_plus_long_plateau():
    assert plus_long_plateau('aabbbcddeeee') == 4
    assert plus_long_plateau('') == 0
    assert plus_long_plateau('a') == 1

# --------------------------------------
# Exemple de villes avec leur population
# --------------------------------------
liste_villes = ["Blois", "Bourges", "Chartres", "Châteauroux", "Dreux",
                "Joué-lès-Tours", "Olivet", "Orléans", "Tours", "Vierzon"]
population = [45871, 64668,  38426, 43442, 30664, 38250, 22168, 116238, 136463,
              25725]

def ville_max(ville, pop):
    """Permet de connaître la plus grande ville

    Args:
        ville (liste): nom des ville
        pop (liste): nb de personne dans la ville

    Returns:
        str: renvoie la plus grosse ville
    """    
    #contient a chaque tour de boucle l'indice de la ville avec la plus grosse pop
    res = None
    if len(ville) > 0:
        max = 0
        for i in range(len(pop)):
            if pop[max] < pop[i]:
                max = i
        res = ville[max]
    return res

def teste_ville_max():
    assert ville_max(liste_villes, population) == 'Tours'
    assert ville_max([], []) == None

def transfo_int(carac):
    """permets de transformer une chaine de caractère composé de chiffre en int

    Args:
        carac (str): chaine a transformer

    Returns:
        int: chaine transformé en int
    """    
    #res contient le nombre transformé a l'indice vue
    chiffre = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    res = 0
    for i in range(len(carac)):
        for val in chiffre:
            if str(val) == carac[i]:
                res = res * 10 + val
    return res

def teste_transfo_int():
    assert transfo_int("") == 0
    assert transfo_int("24008") == 24008
    assert transfo_int("87564") == 87564
    assert transfo_int("0") == 0


def first_let(ls, let):
    """permet de mettre dans une liste les mot qui commence par la lettre donné

    Args:
        ls (liste): liste des mots
        let (str): lettre commence mot

    Returns:
        liste: renvoie la liste des mots qui commencent par la lettre
    """    
    #liste qui contient a chaque tour de boucle les mots commencant par la lettre donné
    liste = []
    for i in range(len(ls)):
        if len(ls[i]) > 0:
            if ls[i][0] == let:
                liste.append(ls[i])
    return liste

def teste_first_let():
    assert first_let(["salut","hello","hallo","ciao","hola"], "h") == ["hello", "hallo", "hola"]
    assert first_let(["salut","hello","hallo","ciao","hola"], "a") == []
    assert first_let([], "e") == []
    assert first_let(["salut","hello","","ciao","hola"], "a") == []

def decoupe_mot(carac):
    """permet de découper des mots

    Args:
        carac (str): chaine de mot

    Returns:
        liste: liste de mot 
    """   
    #mot contient a chaque tour de boucle le mot en constuction
    #res continent a chaque tour de boucle les mots finit d'être constuit 
    res = []
    mot = ''
    for i in range(len(carac)):
        if carac[i].isalpha():
            mot = mot + carac[i]
        elif mot != '':
            res.append(mot)
            mot = ''
    if mot != '':
        res.append(mot)
    return res

def teste_decoupe_mot():
    assert decoupe_mot("Cela fait déjà 28 jours! 28 jours à l’IUT’O! Cool!!") == ['Cela', 'fait', 'déjà', 'jours', 'jours', "à", "l", "IUT", "O", "Cool"]
    assert decoupe_mot("(3*2)+1") == []
    assert decoupe_mot("Cela fait déjà 28 jours! 28 jours à l’IUT’O! Cool") == ['Cela', 'fait', 'déjà', 'jours', 'jours', "à", "l", "IUT", "O", "Cool"]

def retouve_let_mot(liste, let):
    """permets de découper un mot puis de séléctionner que ceux qui commence par la même lettre que let

    Args:
        liste (liste): liste de mot a tester
        let (str): lettre a trouver

    Returns:
        liste_: liste trié
    """    
    res = decoupe_mot(liste)
    res = first_let(res, let)
    return res

def test_retrouve_let_mot():
    assert retouve_let_mot("Cela fait déjà 28 jours! 28 jours à l’IUT’O! Cool!!", "C") == ['Cela',"Cool"]
    assert retouve_let_mot([] , "F") == []
def boole(nb):
    res = [False]*2 + [True] * (nb-1)
    return res

def multiliste(nb,listee):
    """permet de créer une liste de False quand i est multiple de nb

    Args:
        nb (int): nb a tester 

    Returns:
        liste: renvoie 
    """
    for i in range(nb*2, len(listee), nb):
        if i%nb == 0 and i != nb:
            listee[i] = False
    return listee

def crible_Eratho(nb):
    res = []
    boolee = boole(nb)
    for i in range(nb+1):
        if boolee[i]:
            boolee = multiliste(i, boolee)
            res.append(i)
    return res

def test_crible_Eratho():
    assert crible_Eratho(2) == [2]
    assert crible_Eratho(0) == []
    assert crible_Eratho(6) == [2, 3, 5]

