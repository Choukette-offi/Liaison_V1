public class Magasin {
    private String nom ;
    private boolean ouvertLundi ;
    private boolean ouvertDimanche ;

    public Magasin ( String nom , boolean lundi , boolean dimanche ) {
        this.nom=nom;
        this.ouvertLundi= lundi;
        this.ouvertDimanche = dimanche;
    }
    // les getters
    public String getNom(){
        return this.nom;
    }

    public boolean getLundi(){
        return this.ouvertLundi;
    }

    public boolean getDimanche(){
        return this.ouvertDimanche;
    }
    @Override
    public String toString () {
        return this.nom + " : ouvert le lundi  " + this.getLundi() + " , ouvert le dimanche " + this.getDimanche()+ "; \n";
    }

    @Override
    public boolean equals(Object o){
        if(this == null){return false;}
        if(this == o){return true;}
        if(!(o instanceof Magasin)){return false;}
        Magasin tmp = (Magasin) o;
        return tmp.getNom().equals(this.getNom()) && tmp.getDimanche() == this.getDimanche() &&tmp.getLundi() == this.getLundi();
    }

    @Override
    public int hashCode(){
        if(this.ouvertLundi && this.ouvertDimanche ){
            return this.getNom().hashCode() * 7489;
        }
        if(this.ouvertDimanche){
            return this.getNom().hashCode() * 7759;
        }
        if(this.ouvertLundi){
            return this.getNom().hashCode() * 31;
        }
        else{
            return this.getNom().hashCode();
        }
    }    
}