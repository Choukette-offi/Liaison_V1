public class Sommet {
    private int id;
    private String couleur;

    // Constructeur
    public Sommet(int id) {
        this.id = id;
        this.couleur = "blanc"; // couleur par défaut
    }

    // Getter pour l'id
    public int getId() {
        return id;
    }

    // Getter pour la couleur
    public String getCouleur() {
        return couleur;
    }

    // Méthode pour modifier la couleur
    public void modifierCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Sommet{id=" + id + ", couleur='" + couleur + "'}";
    }

    // Redéfinition de hashCode : basé uniquement sur id
    @Override
    public int hashCode() {
        return this.id*17;
    }

    // Redéfinition de equals : basé uniquement sur id
    @Override
    public boolean equals(Object obj) {
        if(this == null) return false;
        if (this == obj) return true;
        if (!(Sommet instanceof obj)) return false;
        Sommet other = (Sommet) obj;
        return this.id == other.id && this.couleur.equals(couleur);
    }
}
