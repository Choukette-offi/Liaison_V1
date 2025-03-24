import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Personne> lesConvives;
    public Table() {
        this.lesConvives = new ArrayList<>();
    }
    public void ajouteConvive(String nom, int age) {
        Personne convive = new Personne(nom, age);
        this.lesConvives.add(convive);
    }
    public double moyenneAge() {
        double somme = 0;
        for (Personne convive : this.lesConvives){
            somme += convive.getAge();
        }
        return somme/this.lesConvives.size();
    }
    public int nombreDAdultes() {
        int cpt = 0;
        for (Personne pers : this.lesConvives) {
            if (pers.getAge() > 18)
                cpt += 1;
        }
        return cpt;
    }
    public String lePlusJeune() {
        int mini = this.lesConvives.get(0).getAge();
        String plusJeune = "";
        for (Personne pers : this.lesConvives) {
            if (pers.getAge() < mini){
                mini = pers.getAge();
                plusJeune = pers.getNom();
            }
        }
        return plusJeune;
    }
    public boolean sontACote(String personne1, String personne2) {
        for (int i=0; i<this.lesConvives.size(); i++) {
            if (this.lesConvives.get(i).getNom().equals(personne1) && this.lesConvives.get(i+1).getNom().equals(personne2))
                    return true;
            if (this.lesConvives.get(i).getNom().equals(personne2) && this.lesConvives.get(i+1).getNom().equals(personne1))
                    return true;
            }
        }
        return false;
    }
    public void echange(String personne1, String personne2) {
        int ind1 = 0;
        int ind2 = 0;
        for (int i=0; i<this.lesConvives.size(); i++) {
            if (this.lesConvives.get(i).getNom().equals(personne1))
            ind1 = i;
            if (this.lesConvives.get(i).getNom().equals(personne2))
            ind2 = i;
        }
        Personne pers = this.lesConvives.get(ind1);
        this.lesConvives.get(ind1) = this.lesConvives.get(ind2);
        this.lesConvives.get(ind2) = pers;


    }
}