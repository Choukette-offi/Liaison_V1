public class Produit{
    private String nom;
    private double prix;

    public Produit(String nom, double prix){
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }


    public double getPrix() {
        return prix;
    }

    @Override
    public boolean equals(Object o){
        if(this == null){return false;}
        if(this == o){return true;}
        if(!(o instanceof Produit)){return false;}
        Produit tmp = (Produit) o;
        return tmp.getNom().equals(this.getNom()) && tmp.getPrix() == this.getPrix();
    }

    @Override
    public int hashCode(){
        return this.getNom().hashCode()*4001 + ((Double)this.prix).hashCode()*17;
    }
}
