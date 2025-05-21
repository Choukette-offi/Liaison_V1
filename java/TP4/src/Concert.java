public class Concert {
    private String nomConcert;
    private String groupe;

    public Concert (String grp, String nomc){
        this.groupe = grp;
        this.nomConcert = nomc;
    }

    public String getNomC(){
        return this.nomConcert;
    }
    
    public String getGroupe(){
        return this.groupe;
    }
}
