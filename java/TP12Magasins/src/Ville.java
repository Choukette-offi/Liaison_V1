import java.util.HashSet ;
import java.util.Set ;

public class Ville {
    private String nom ;
    private Set <Magasin> magasins ;

    public Ville ( String nom ) {
        this.nom = nom;
        this.magasins= new HashSet<Magasin>();
    }

    public void ajouteMagasin ( String nom , boolean lundi , boolean dimanche ) {
        Magasin magasin = new Magasin(nom,lundi,dimanche);
        this.magasins.add(magasin);
    }

    public Set < String > ouvertsLeLundi () {
    Set < String > magasinsLundi = new HashSet<String>();
    for (Magasin magasin : this.magasins ){
        if (magasin.getLundi()== true)
        magasinsLundi.add(magasin.getNom());
        }
    return magasinsLundi;
    }

    public Set < String > ouvertsLeDimanche () {
        Set < String > magasinsDimanche = new HashSet<String>();
        for (Magasin magasin : this.magasins ){
            if (magasin.getDimanche()== true)
            magasinsDimanche.add(magasin.getNom());
            }
        return magasinsDimanche;
        }

    @Override
    public String toString() {
        String res = this.nom + " : " + "\n";
        for (Magasin magasin : this.magasins ){
            res += magasin.getNom() + " : ouvert le lundi  " + magasin.getLundi() + " , ouvert le dimanche " + magasin.getDimanche()+ "; \n";
        }
        return res;
    }
}

