public class Fantome {
    private String nom;
    private int force;
    private int taille;

    public Fantome(String nom, int force, int taille) {
        this.nom = nom;
        this.force = force;
        this.taille = taille;
    }
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getForce() {
        return force;
    }
    public void setForce(int force) {
        this.force = force;
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }


}
