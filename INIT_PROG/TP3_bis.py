from math import sqrt
def moyenne(ls):
    effec = len(ls)
    moy = 0
    for val in ls:
        moy = moy + val
    return moy / effec

def ecartype(ls):
    effec = len(ls)
    res = []
    moy = moyenne(ls)
    moy0 = 0
    for val in ls:
        res = res + [(val - moy)**2] 
    for val in res:
        moy0 = moy0 + val
    moy0 = moy0/effec
    return sqrt(moy0)

def teste_ecartype(): 
    assert ecartype([2, 4, 4, 4, 5, 5, 7, 9]) == 2.0
    assert ecartype([6,6,6,6,6,6]) == 0

def bissextile(annee):
    res = False
    if annee % 4 == 0 and annee % 100 != 0 or annee % 400 == 0:
        res = True
    return res 

def teste_bissextile():
    assert bissextile(2000) == True
    assert bissextile(2001) == False
    assert bissextile(1900) == False
    assert bissextile(2024) == True

def inter_bisse(deb, fin):
    pass
