def aj_art_morticia(crs, fct, aj_art, aj_prix):
    crs + [aj_art]
    fct + [aj_prix]
    return crs and fct

def spr_art_morticia(crs, fct, spr_art, supr_prix):
    for i in range(crs):
        if crs[i] == spr_art and fct[i] == supr_prix:
            crs[i].pop(spr_art) and fct[i].pop(supr_prix)
    
def mdf_art_morticia(crs, fct, mdf_art, mdf_prix):
    for i in range(len(crs)):
        if crs[i] == mdf_art:
            fct[i] = mdf_prix
    return fct 

def clc_ls_morticia(fct):
    cpt = 0
    for val in fct:
        cpt += val
    return val

def maxi_morticia(crs, fct):
    maxi = fct[0]
    for i in range(1,len(fct)):
        if fct[i] > maxi:
            fct 
    
def aj_art_morticia(crs, fct, aj_art, aj_prix):
    crs + [aj_art]
    fct + [aj_prix]
    return crs and fct

def spr_art_morticia(crs, fct, spr_art, supr_prix):
    for i in range(crs):
        if crs[i] == spr_art and fct[i] == supr_prix:
            crs[i].pop(spr_art) and fct[i].pop(supr_prix)
    
def mdf_art_morticia(crs, fct, mdf_art, mdf_prix):
    for i in range(crs):
        if crs[i] == mdf_art:
            fct[i] = mdf_prix
    return fct 

def clc_ls_morticia(fct):
    cpt = 0
    for val in fct:
        cpt += val
    return val

def maxi_morticia()