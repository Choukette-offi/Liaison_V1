import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Bibliotheque{
    static boolean sommeNulle(List<Integer> liste){
        for(Integer ls1 : liste){
            for(Integer ls2 : liste){
                if((ls1 + ls2) == 0){
                    return true;
                }
            }
        }
        return false;
    }

    static List<Integer> Occurence(List<Integer> liste){
        List<Integer> tmp = new ArrayList<>(liste);
        List<Integer> newB = new ArrayList<>();
        Collections.sort(tmp);
        for(int i = 1; i < tmp.size(); i++){
            if(tmp.get(i) != tmp.get(i-1)){
                newB.add(tmp.get(i-1));
            }
        } 
        return newB;
    }
    
    static boolean exactementMemesValeurs(List<Integer> liste1, List<Integer> liste2){
        List<Integer> tmp1 = new ArrayList<>(liste1);
        List<Integer> tmp2 = new ArrayList<>(liste2);
        Collections.sort(tmp1);
        Collections.sort(tmp2);
        if(tmp1.size() != tmp2.size()){
            return false;
        }
        for(int i = 0; i < tmp1.size(); i++){
            if(tmp1.get(i) != tmp2.get(i)){
                return false;
            }
        }
        return true;  
    }

    static Integer mediane(List<Integer> liste){
        List<Integer> tmp1 = new ArrayList<>(liste);
        Collections.sort(tmp1);
        if(tmp1.size()%2 == 0){
            return tmp1.get(tmp1.size()/2+1);
        }
        else{
            return tmp1.get(tmp1.size()/2);
        }
    }
}

