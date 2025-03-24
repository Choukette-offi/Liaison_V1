import java.util.List;
import java.util.ArrayList;

public class Festival {
    private String nom;
    private String adresse;
    private List<Concert> concerts;
    private List<Billet> billets;

    public Festival(String nom, String adresse){
        this.nom = nom;
        this.adresse = adresse;
        this.concerts  = new ArrayList<>();
        this.billets = new ArrayList<>();
    }

    public String nomF(){
        return this.nom;
    }

    public String adresseF(){
        return this.adresse;
    }

    public List<Concert> getConcerts(){
        return this.concerts;
    }

    public void ajouterConcert(Concert concert){
        Concert nConcert = new Concert(concert.getGroupe(), concert.getGroupe());
        concerts.add(nConcert);
    }

    public void reserver(Spectateur spectateur, Concert concert, int prix){
        Billet billet = new Billet(prix, concert, spectateur);
        billets.add(billet);
    }

    public int nombreBilletConcert(Concert concert){
        int cpt = 0;
        for(Billet bil : this.billets){
            if(bil.getConcert() == concert){
                cpt += 1;
            }
        }
        return cpt;
    }

    public int nombreConcert(){
        return this.concerts.size();
    }
}
