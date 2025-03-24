public class Animal {
    private String nom;
    private double poids;
    private Enclos enclos;

    protected Animal(String nom, double poids){
        this.nom = nom;
        this.poids = poids;
        this.enclos = null;
    }

    public void ajouteEnclos(String nom, double superficie){
        this.enclos = new Enclos(nom, superficie);
    }
    
    public Enclos getEnclos() {
        return enclos;
    }

    public void setEnclos(Enclos enclos) {
        this.enclos = enclos;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    @Override
    public String toString(){
        
        return this.nom + " pese " + this.poids + " kg";
    }
}
