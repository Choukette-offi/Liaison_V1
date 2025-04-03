import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Bibliotheque {   
    public static List<Integer> compressionList(List<Integer> liste){
        Collections.sort(liste);
        int i = 0;
        int compt = 0;
        List<Integer> n_ls = new ArrayList<>();
        for(i = 0; i<liste.size() - 1; i++){
            if(liste.get(++i) == liste.get(i)){
                compt ++;
            }
            else{
                n_ls.add(compt);
                n_ls.add(liste.get(1-i));
                compt = 1;
            }
        }
        return n_ls;
    }
}
