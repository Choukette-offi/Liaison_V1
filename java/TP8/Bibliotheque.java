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

    public static boolean enCommun(List<Integer> liste1, List<Integer> liste2){
        for(int i: liste1){
            for(int j: liste2){
                if(i == j){
                    return true;
                }
            }
        }
        return false;
    }

    public static List<Integer> intersection(List<Integer> liste1, List<Integer> liste2){
        Collections.sort(liste1);
        Collections.sort(liste2);
        int i =0, j=0;
        List<Integer> res;
        while (i<liste1.size() && j<liste2.size()) {
            if(liste1.get(i) == liste2.get(j)){
                res.add(liste1.get(i));
            }
            else if(liste1.get(i) > liste2.get(j)){
                j++;
            }
            else{
                i++;
            }
        }
        return res;
    }

    public static boolean indiceEgaleElement(List<Integer> liste1){
        int i=0;
        for(int val: liste1){
            if(i == val){
                return true;
            }
            i++;
        }
        return false;
    }

}
