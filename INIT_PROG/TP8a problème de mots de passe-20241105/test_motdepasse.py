import motdepasse

# --------------------------------------
# FONCTIONS
# --------------------------------------

def test_longueur_ok():
    assert motdepasse.longueur_ok("choubouilli") # longueur ok
    assert not motdepasse.longueur_ok("chou") # longueur pas ok
    assert not motdepasse.longueur_ok("") # chaine vide


def test_chiffre_ok():
    assert not motdepasse.chiffre_ok("chou9bouilli")  # chiffre au milieu
    assert not motdepasse.chiffre_ok("7choubouilli")  # chiffre au début
    assert not motdepasse.chiffre_ok("choubouilli5")  # chiffre à la fin
    assert not motdepasse.chiffre_ok("chou3boui8lli")  # deux chiffres    
    assert not motdepasse.chiffre_ok("chou")       # pas de chiffres
    assert not motdepasse.chiffre_ok("un deux trois") # pas de chiffres
    assert motdepasse.chiffre_ok("chou3boui38lli")  # deux chiffres 
    assert motdepasse.chiffre_ok("chou3boui44448lli")  # deux chiffres 

def test_chiffre_consecutif():
    assert motdepasse.chiffre_consecutif("chou9bouilli")  # chiffre au milieu
    assert motdepasse.chiffre_consecutif("7choubouilli")  # chiffre au début
    assert motdepasse.chiffre_consecutif("choubouilli5")  # chiffre à la fin
    assert motdepasse.chiffre_consecutif("chou3boui8lli")  # deux chiffres    
    assert motdepasse.chiffre_consecutif("chou")       # pas de chiffres
    assert motdepasse.chiffre_consecutif("un deux trois") # pas de chiffres
    assert not motdepasse.chiffre_consecutif("chou3boui38lli")  # deux chiffres 
    assert not motdepasse.chiffre_consecutif("chou3boui44448lli")  # deux chiffres 

def test_sans_espace():
    assert motdepasse.sans_espace("choubouilli") # sans espace ok
    assert not motdepasse.sans_espace("chou bouilli") # espace au milieu
    assert not motdepasse.sans_espace(" choubouilli") # espace au début
    assert not motdepasse.sans_espace("choubouilli ") # espace à la fin
    assert motdepasse.sans_espace("") # chaine vide

def test_un_petit_chiffre():
    assert motdepasse.un_petit_chiffre("chou9bouilli")  # chiffre au milieu
    assert not motdepasse.un_petit_chiffre("7chou7bouilli")  # chiffre au début
    assert motdepasse.un_petit_chiffre("chou3boui44448lli")  # deux chiffres 
    assert motdepasse.un_petit_chiffre("choubouilli5")  # chiffre à la fin
    assert motdepasse.un_petit_chiffre("chou3boui8lli")  # deux chiffres    
    assert motdepasse.un_petit_chiffre("chou")       # pas de chiffres
    assert motdepasse.un_petit_chiffre("un deux trois") # pas de chiffres
    assert not motdepasse.un_petit_chiffre("chou3bou3i38lli")  # deux chiffres 
