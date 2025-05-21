public class Oeuf{
    private String type;
    private int poids;
    private int qte;

    Oeuf(String type, int poids, int qte){
        this.type = type;
        this.poids = poids;
        this.qte = qte;
    }

    public void incrementerQte(int qte){
        this.qte += qte;
    }

    public String getType() {
        return type;
    }

    public int getPoids() {
        return poids;
    }

    public int getQte() {
        return qte;
    }
}