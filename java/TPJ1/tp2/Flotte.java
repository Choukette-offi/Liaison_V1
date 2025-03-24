import java.util.List;
import java.util.ArrayList;

public class Flotte{
    private String nomFlotte;
    private int nombreVaisseau = 0;
    private int puissanceDeFeuFlotte;
    private List<Vaisseau> lesVaisseau;

    public Flotte(){  
        this.nomFlotte = "Nouvelle Flotte";
        this.lesVaisseau = new ArrayList<>();
    }

    public Flotte(String nom){
        this.nomFlotte = nom;
        this.lesVaisseau = new ArrayList<>();
    }

    public String getNom(){
        return this.nomFlotte;
    }

    public void ajoute(Vaisseau nomVaisseau){
        this.nombreVaisseau += 1;
        this.puissanceDeFeuFlotte += nomVaisseau.getPuissance();
        this.lesVaisseau.add(nomVaisseau);
    }
    public void ajoute(String nomVaisseau, int puissanceDeFeu){
        this.nombreVaisseau += 1;
        this.puissanceDeFeuFlotte += puissanceDeFeu;
        Vaisseau leVaisseau = new Vaisseau(nomVaisseau, puissanceDeFeu);
        this.lesVaisseau.add(leVaisseau);
    }

    public void ajoute(String nomVaisseau, int puissanceDeFeu, int nombreDePassagers){
    this.nombreVaisseau += 1;
    this.puissanceDeFeuFlotte += puissanceDeFeu;
    Vaisseau leVaisseau = new Vaisseau(nomVaisseau, puissanceDeFeu, nombreDePassagers);
    this.lesVaisseau.add(leVaisseau);
    }

    public int nombreVaisseaux(){
        return this.nombreVaisseau;
    }

    public int totalPuissance(){
        return this.puissanceDeFeuFlotte;
    }
}

