public class Bouteille {
    private String region;
    private String appelation;
    private int millesime;

    public Bouteille(String region, String appelation, int millesime){
        this.region = region;
        this.appelation = appelation;
        this.millesime = millesime;
    }

    public String getRegion() {
        return this.region;
    }

    public String getAppellation() {
        return this.appelation;
    }

    public String getMillesime() {
        return this.millesime;
    }

    @Override
    public boolean equals(Object object){
        if (object == null) {return false;}

        if (object == this) {return true;}

        if (!(object instanceof Bouteille)) {return false;}

        Bouteille tmp = (Bouteille) object;
        return tmp.region.equals(this.region) && tmp.appelation.equals(this.appelation) && tmp.millesime == this.millesime;
    }
}
