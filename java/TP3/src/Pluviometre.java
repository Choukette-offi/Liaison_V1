package src;
import java.util.List;
import java.util.ArrayList;

public class Pluviometre{
    private int annee;
    private int semaine;
    private List<Integer> precipitations;
    
    public Pluviometre(int annee, int semaine){
        this.annee = annee;
        this.semaine = semaine;
        this.precipitations = new ArrayList<>();
        for (int i = 0; i < 7; i++){
            precipitations.add(null);}
    }

    public void setPrecipitation(int jour, Integer pluie){
        this.precipitations.set(jour, pluie);
    }

    public Integer getPluie(Integer jour){
        return this.precipitations.get(jour);
    }

    public Integer quantiteTotale(){
        Integer quantiteT = null;
        for(Integer qte: this.precipitations){
            if(quantiteT == null && qte != 0)
            quantiteT = qte;
            if(quantiteT != null && qte > 0)
            quantiteT += qte;
        }
        return quantiteT;
    }

    public Integer quantiteMax(){
        Integer quantiteM = null;
        for(Integer qte: this.precipitations){
            if(quantiteM == null && qte != null)
            quantiteM = qte;
            if(quantiteM != null && qte > quantiteM)
            quantiteM = qte;
        }
        return quantiteM;
    }

    public boolean estPluvieuse(){
        for(int i=0; i<6; i++){
            if(this.precipitations.get(i)!=null && this.precipitations.get(i+1)!=null)
                if(this.precipitations.get(i)!=0 && this.precipitations.get(i+1)!=0)
                    return true;
        }
        return false;
    }
}