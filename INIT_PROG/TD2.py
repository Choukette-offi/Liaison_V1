def compt_syll(mot):
    syllabes = 0
    rep_voyelle = False
    
    for let in mot:
        if let in 'aeiouy':
            if not rep_voyelle:
                syllabes += 1
            rep_voyelle = True
        else:
            rep_voyelle = False
        der = let
    if der not in 'aeiouy':
        syllabes -= 1
    
    return syllabes

def teste_compt_syll():
    assert compt_syll('tableau') == 2
    assert compt_syll('ecouteur') == 3
