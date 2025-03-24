public class Spectateur{
    private String nom;
    private String prenom;

    public Spectateur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPremon(){
        return this.prenom;
    }
}