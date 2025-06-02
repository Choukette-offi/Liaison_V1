public class Sommet {
    private int id;
    private String couleur;


    public Sommet(int id) {
        this.id = id;
        this.couleur = "blanc"; 
    }

    public int getId() {
        return id;
    }

    public String getCouleur() {
        return couleur;
    }

    public void modifierCouleur(String couleur) {
        this.couleur = couleur;
    }
    @Override
    public String toString(){
        return "Le sommet se nomme: " + this.id + " et il a une couleur: " + this.couleur;
    }

    @Override
    public int hashCode() {
        return this.id*17;
    }

    @Override
    public boolean equals(Object o){
        if(this == null){return false;}
        if(this == o){return true;}
        if(!(o instanceof Sommet)){return false;}
        Sommet tmp = (Sommet) o;
        return this.id == tmp.id;
    }
}
