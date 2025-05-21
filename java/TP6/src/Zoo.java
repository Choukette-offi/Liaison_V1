import java.util.List;
import java.util.ArrayList;

public class Zoo {

    private String nom;
    private List<Animal> lesAnimaux;

    public Zoo(String nom){
        this.nom = nom;
        this.lesAnimaux = new ArrayList<>();
    }

    public String getNom(){
        return this.nom;
    }

    public void ajouteAnimal(Animal nom){
        this.lesAnimaux.add(nom);
    }

    @Override
    public String toString() {
        return getNom() + " contient" + lesAnimaux;
    }
}