import sqlalchemy
import argparse
import getpass

class MySQL(object):
    def __init__(self, user, passwd, host, database,timeout=20):
        self.user = user
        self.passwd = passwd
        self.host = host
        self.database = database
        #try:
        self.engine = sqlalchemy.create_engine(
                'mariadb://' + self.user + ':' + self.passwd + '@' + self.host + '/' + self.database,
                )
        self.cnx = self.engine.connect()
        print("connexion réussie")

    def close(self):
        self.cnx.close()

    def execute(self, requete, liste_parametres):
        for param in liste_parametres:
            if type(param)==str:
                requete=requete.replace('?',"'"+param+"'",1)
            else:
                requete=requete.replace('?',str(param),1)
        return self.cnx.execute(requete)

def faire_factures(requete:str, mois:int, annee:int, bd:MySQL):
    # exécute la requête en remplaçant le premier ? par le numéro du mois 
    # et le deuxième ? par l'année
    curseur=bd.execute(requete,(mois,annee))
    # Initialisations du traitement
    print(curseur)
    res = '' 
    cpt_cmd = 1
    id_pers = ''
    mag_prec = ''
    pt_tot = 0 
    qte_lv = 0
    gro_tot = 0
    nb_lv = 0
    for ligne in curseur:
        # parcours du résultat de la requête. 
        # ligne peut être vu comme un dictionnaire dont les clés sont les noms des colonnes de votre requête
        # est les valeurs sont les valeurs de ces colonnes pour la ligne courante
        # par exemple ligne['numcom'] va donner le numéro de la commande de la ligne courante 
        if mag_prec == '':
            res += "Factures du " + str(mois) + '/' + str(annee) + '\n' + 'Edition des factures du magasin ' + ligne["nommag"] + '\n' + '-' * 80 
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + ligne['Ville'] + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + str(ligne['Date de Commande']) + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd += 1
            qte_lv += ligne["qte"]
            mag_prec = ligne["nommag"]
            id_pers = ligne["prenomCli"] + ligne["nomCli"]
            pt_tot += ligne["Total"]

        elif ligne["prenomCli"] + ligne["nomCli"] == id_pers and ligne["nommag"] == mag_prec :
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  '*(5-len(str(ligne["Prix"]))) + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd += 1
            qte_lv += ligne["qte"]
            mag_prec = ligne["nommag"]
            pt_tot += ligne["Total"]

        elif ligne["nommag"] == mag_prec:
            res += ' '*71 + '-'*8 + '\n' + ' '*65 + 'Total' + ' '*(9-len(str(pt_tot))) + str(pt_tot) + '\n' + '-'*80
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + ligne['Ville'] + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + str(ligne['Date de Commande']) + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"])  + ' '*(9-len(str(ligne["Prix"]))) + str(ligne["Total"]) + '\n'
            cpt_cmd +=1
            qte_lv += ligne["qte"]
            mag_prec = ligne["nommag"]
            pt_tot += ligne["Total"]
        
        else:
            res += '\n' + '-'*80 + '\n' + str(cpt_cmd) +' factures éditées' + '\n' + str(qte_lv) + ' livres vendus' + '\n' + '*'*80
            cpt_cmd = 1
            gro_tot += pt_tot
            nb_lv += qte_lv 
            qte_lv = ligne["qte"]
            mag_prec = ligne["nommag"]
            pt_tot = ligne["Total"]
            res +=  '\n' + "Factures du " + '...' + '\n' + 'Edition des factures du magasin ' + ligne["nommag"] + '\n' + '-' * 80 
            res += '\n' + ligne["prenomCli"] + ' ' + ligne["nomCli"] + '\n' + ligne["adressecli"] + '\n' + str(ligne["codepostal"]) + ' ' + ligne['Ville'] + '\n' + ' '*26 + 'commande n°' + str(ligne['Numero De Commande']) + ' du ' + str(ligne['Date de Commande']) + '\n' + ' '*8 + 'ISBN' + ' '*24 + 'Titre' + ' '*19 + 'qte' + ' '*3 + 'prix' + ' '*4 + 'total' + '\n'
            res += '  ' + str(cpt_cmd) + ' ' + ligne["ISBN"] + ' ' + ligne["Titre"] + ' '*(44-len(ligne["Titre"])) + str(ligne['qte']) + '  ' + str(ligne["Prix"]) + ' '*4 + str(ligne["Total"]) + '\n'
            cpt_cmd += 1
    #ici fin du traitement
    # fermeture de la requête
    curseur.close()
    print(res)
    return res
        


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument("--serveur",dest="nomServeur", help="Nom ou adresse du serveur de base de données", type=str, default="127.0.0.1")
    parser.add_argument("--bd",dest="nomBaseDeDonnees", help="Nom de la base de données", type=str,default='Librairie')
    parser.add_argument("--login",dest="nomLogin", help="Nom de login sur le serveur de base de donnée", type=str, default='limet')
    parser.add_argument("--requete", dest="fichierRequete", help="Fichier contenant la requete des commandes", type=str)    
    args = parser.parse_args()
    passwd = getpass.getpass("mot de passe SQL:")
    try:
        ms = MySQL(args.nomLogin, passwd, args.nomServeur, args.nomBaseDeDonnees)
    except Exception as e:
        print("La connection a échoué avec l'erreur suivante:", e)
        exit(0)
    rep=input("Entrez le mois et l'année sous la forme mm/aaaa ")
    mm,aaaa=rep.split('/')
    mois=int(mm)
    annee=int(aaaa)
    with open(args.fichierRequete) as fic_req:
        requete=fic_req.read()
    print(faire_factures(requete,mois,annee,ms))