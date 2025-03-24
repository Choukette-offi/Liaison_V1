public class Billet {
    public int prix;
    public Concert concert;
    public Spectateur spectateur;
    
    public Billet(int prix, Concert concert, Spectateur spectateur){
        this.prix = prix;
        this.concert = concert;
        this.spectateur = spectateur;
    }

    public Concert getConcert(){
        return this.concert;
    }
}
