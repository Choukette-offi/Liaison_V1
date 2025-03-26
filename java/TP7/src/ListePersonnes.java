import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListePersonnes{
    private List<Personne> lsPersonnes;

    public ListePersonnes(List<Personne> liste){
        this.lsPersonnes = liste;
    }

    public void triePersonnes(){
        Collections.sort(this.lsPersonnes);
    }

    public int ecartAge(){
        for(int i = 0; i < this.lsPersonnes.size() + 1; i++){
            Personne perc;
            int min = 1000;
            if(this.lsPersonnes == this.lsPersonnes.get(0))
                perc = lsPersonnes.get(i);
            else{
                if(min>(this.lsPersonnes.get(i-1).getAge() - this.lsPersonnes.get(i).getAge())){
                    min = this.lsPersonnes.get(i-1).getAge() - this.lsPersonnes.get(i).getAge();
                }
            }
        }
        return min;
    }
}