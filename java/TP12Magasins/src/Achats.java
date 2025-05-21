import java.util.HashMap;
import java.util.*;

public class Achats {
    private Map<Produit, Integer> achats;

    public Achats(){
        this.achats = new HashMap<>();
    }

    public void ajouter(Produit p, Integer i){
        achats.putIfAbsent(p, 0);
        if(achats.containsKey(p)){
            achats.replace(p, achats.get(p)+1);
        }
    }
}
