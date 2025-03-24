import os
os.system('cls')
donnees = [
    {"nommag": "Cap au Sud", "nomCli": "David", "prenomCli": "Jean", "adressecli": "170 chemin du Musée", "codepostal": 34000, "Numero De Commande": 43, "Date de Commande": "2020-02-03", "ISBN": "9782205084398", "Titre": "Dis pourquoi ?", "qte": 2, "Prix": 28.30, "Total": 56.60},
    {"nommag": "Cap au Sud", "nomCli": "David", "prenomCli": "Laura", "adressecli": "170 route du Musée", "codepostal": 34000, "Numero De Commande": 43, "Date de Commande": "2020-02-03", "ISBN": "9782806252555", "Titre": "Message extraterrestre", "qte": 1, "Prix": 9.00, "Total": 9.00},
    {"nommag": "Cap au Sud", "nomCli": "Petit", "prenomCli": "Laura", "adressecli": "115 chemin de l'Université", "codepostal": 13001, "Numero De Commande": 53, "Date de Commande": "2020-02-13", "ISBN": "9782866189596", "Titre": "Prochain rendez-vous dans le pot de fleurs", "qte": 1, "Prix": 9.00, "Total": 9.00},
    {"nommag": "Cap au Sud", "nomCli": "Michel", "prenomCli": "Antoine", "adressecli": "30 passage de la Colline", "codepostal": 75000, "Numero De Commande": 42, "Date de Commande": "2020-02-14", "ISBN": "9782801909035", "Titre": "Les petites histoires de la grande histoire", "qte": 3, "Prix": 20.57, "Total": 61.71},
    {"nommag": "L'européenne", "nomCli": "Durand", "prenomCli": "Laura", "adressecli": "92 route de la Forêt", "codepostal": 31000, "Numero De Commande": 54, "Date de Commande": "2020-02-14", "ISBN": "9782705302308", "Titre": "Un livre", "qte": 1, "Prix": 27.50, "Total": 27.50},
    {"nommag": "L'européenne", "nomCli": "Durand", "prenomCli": "Jean", "adressecli": "92 route de la Forêt", "codepostal": 31000, "Numero De Commande": 54, "Date de Commande": "2020-02-14", "ISBN": "9782740725145", "Titre": "Le livre noir du syndicat de la magistrature", "qte": 1, "Prix": 13.57, "Total": 47.71},
    {"nommag": "L'européenne", "nomCli": "Silva", "prenomCli": "Isabel", "adressecli": "Place de la Forêt", "codepostal": 31000, "Numero De Commande": 56, "Date de Commande": "2020-02-14", "ISBN": "9782207256157", "Titre": "Dans la forêt la mort s'amuse", "qte": 1, "Prix": 32.50, "Total": 32.50},
    {"nommag": "La librairie parisienne", "nomCli": "Ben Ali", "prenomCli": "Francesca", "adressecli": "115 allée du Musée", "codepostal": 51100, "Numero De Commande": 51, "Date de Commande": "2020-02-16", "ISBN": "9782356548137", "Titre": "Chroniques d'un autre monde, suivi de Manifeste p...", "qte": 1, "Prix": 39.50, "Total": 39.50},
    {"nommag": "La librairie parisienne", "nomCli": "Ben Ali", "prenomCli": "Omar", "adressecli": "115 allée du Musée", "codepostal": 51100, "Numero De Commande": 51, "Date de Commande": "2020-02-16", "ISBN": "9782841083017", "Titre": "Berlin", "qte": 2, "Prix": 39.50, "Total": 79.00},
    {"nommag": "La librairie parisienne", "nomCli": "Durand", "prenomCli": "Louis", "adressecli": "Place du Musée", "codepostal": 31000, "Numero De Commande": 51, "Date de Commande": "2020-02-16", "ISBN": "9782353863692", "Titre": "Le secret du Lorrain", "qte": 1, "Prix": 16.00, "Total": 16.00},
    {"nommag": "Le Ch'ti livre", "nomCli": "Omar", "prenomCli": "Said", "adressecli": "82 quai de la Paix", "codepostal": 59000, "Numero De Commande": 52, "Date de Commande": "2020-02-15", "ISBN": "9782204063965", "Titre": "Fenêtre jaune cadmium, ou, Les dessous de la pein...", "qte": 2, "Prix": 32.50, "Total": 65.00},
    {"nommag": "Loire et livres", "nomCli": "Moreau", "prenomCli": "Mathieu", "adressecli": "150 route de la Paix", "codepostal": 42000, "Numero De Commande": 57, "Date de Commande": "2020-02-18", "ISBN": "9782203040127", "Titre": "Mafalda revient", "qte": 1, "Prix": 9.00, "Total": 9.00}
]
def faire_factures(mois:int, annee:int):
    # exécute la requête en remplaçant le premier ? par le numéro du mois 
    # et le deuxième ? par l'année
    curseur=donnees
    # Initialisations du traitement
    res = '' 
    cpt_cmd = 1
    id_pers = ''
    mag_prec = ''
    pt_tot = 0 
    for ligne in curseur:
        # parcours du résultat de la requête. 
        # ligne peut être vu comme un dictionnaire dont les clés sont les noms des colonnes de votre requête
        # est les valeurs sont les valeurs de ces colonnes pour la ligne courante
        # par exemple ligne['numcom'] va donner le numéro de la commande de la ligne courante 
        if ligne == curseur[0]:
            res += "Factures du " + str(mois) + '/' + str(annee) + '\n' + 'Edition des factures du magasin ' + curseur[0]["nommag"] + '\n' + '-' * 80 
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + 'ville' + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + ligne['Date de Commande'] + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd += 1
            mag_prec = ligne["nommag"]
            id_pers = ligne["prenomCli"] + ligne["nomCli"]
            pt_tot += ligne["Total"]

        elif ligne["prenomCli"] + ligne["nomCli"] == id_pers and ligne["nommag"] == mag_prec :
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + 'ville' + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + ligne['Date de Commande'] + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd += 1
            mag_prec = ligne["nommag"]
            pt_tot += ligne["Total"]

        elif ligne["nommag"] == mag_prec:
            res += ' '*71 + '-'*8 + '\n' + ' '*65 + 'Total' + ' '*(9-len(str(pt_tot))) + str(pt_tot) + '\n' + '-'*80
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + 'ville' + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + ligne['Date de Commande'] + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd = 0
            mag_prec = ligne["nommag"]
            pt_tot += ligne["Total"]

    #ici fin du traitement
    # fermeture de la requête
    print(res)
    return res
faire_factures(2, 2020)