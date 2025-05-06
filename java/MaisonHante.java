import java.util.List;
import java.util.ArrayList;

public class MaisonHante{
    private String nom;
    private List<Fantome> fantomes;

    public MaisonHante(String nom) {
        this.nom = nom;
        this.fantomes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Fantome> getFantomes() {
        return fantomes;
    }

    public void setFantomes(List<Fantome> fantomes) {
        this.fantomes = fantomes;
    }

    public String fantomLePlusFort() {
        if (fantomes.isEmpty()){
            return "Aucun fatome dans cette maison.";
        }
        Fantome plusFort = fantomes.get(0);
        for(Fantome f: fantomes){
            if (f.getForce() > plusFort.getForce()){
                plusFort = f;
            }
        }
        return plusFort.getNom();
    }

    public List<Fantome> fantomesAvecForce(int f){
        List<Fantome> result = new ArrayList<>();
        for(Fantome fantome: fantomes){
            if(fantome.getForce() == f){
                result.add(fantome);
            }
        }
        return result;
    }
}

