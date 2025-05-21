import java.util.List;
import java.util.Collections; 

public class Livre implements Comparable<Livre>{
    private String nom;
    private String Auteur;
    private int dateDePlublication;
      

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Livre(String nom, String auteur, int dateDePlublication, double prix) {
        this.nom = nom;
        this.Auteur = auteur;
        this.dateDePlublication = dateDePlublication;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public int getDateDePlublication() {
        return dateDePlublication;
    }

    public void setDateDePlublication(int dateDePlublication) {
        this.dateDePlublication = dateDePlublication;
    }


    @Override
    public int compareTo(Livre l1){
        if (this.dateDePlublication == l1.dateDePlublication)
            return 0;
        if (this.dateDePlublication > l1.dateDePlublication)
            return 1;
        return -1;
    }
}
