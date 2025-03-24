public class Vaisseau{
    private String nom;
    private int nombreDePassagers;
    private int puissanceDeFeu;

    public Vaisseau(String nom, int puissance){
        this.nom = nom;
        this.puissanceDeFeu = puissance;
    }

    public Vaisseau(String nom, int puissance, int passagers){
        this.nom = nom;
        this.puissanceDeFeu = puissance;
        this.nombreDePassagers = passagers;
    }
    public String getNom(){
        return this.nom;
    }

    public int getNombrePassagers(){
        return this.nombreDePassagers;
    } 

    public int getPuissance(){
        return this.puissanceDeFeu;
    }
    public boolean transportePassagers(){
        if(this.nombreDePassagers == 0)
            System.out.println(this.nom + " ne transporte pas de passagers");
        return this.nombreDePassagers >0;
    }
}