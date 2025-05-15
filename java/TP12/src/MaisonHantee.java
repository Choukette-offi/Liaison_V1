import java.util.*;

public class MaisonHantee{
    private String nom;
    private TypeFantome type;
    private Set<Fantome> fantomes;

    public MaisonHantee(String nom) {
        this.nom = nom;
        this.fantomes = new HashSet<>();
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Fantome> getFantomes() {
        return fantomes;
    }

    public void ajouter(Fantome f){
        this.fantomes.add(f);
    }

    public void setFantomes(Set<Fantome> fantomes) {
        this.fantomes = fantomes;
    }

    public String fantomLePlusFort() {
        return Collections.max(fantomes, new CompareFantome()).getNom();
    }

    public Set<Fantome> fantomesAvecForce(int f){
        Set<Fantome> result = new HashSet<>();
        for(Fantome fantome: fantomes){
            if(fantome.getForce() == f){
                result.add(fantome);
            }
        }
        return result;
    }

    public List<Fantome> trieForce(){
        List<Fantome> result = new ArrayList<>(this.fantomes);
        switch (type){
            case NATUREL:
                Collections.sort(result);
                return result;
        
            case INDUIT:
                Comparator<Fantome> comp = new CompareFantome();
                Collections.sort(result, comp);
                return result;
        }
    }
}

