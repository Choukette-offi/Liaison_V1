import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Executable{
    public static void main(String[] args){
        List<Integer> liste = new ArrayList<>(Arrays.asList(1,3,2,1,4,5,6,4,5,2,3,6,5,1));  
        List<Integer> liste1 = new ArrayList<>(Arrays.asList(1,3,2,1,4,5,6,4,5,2,3,6,5,1));
        List<Integer> liste2 = new ArrayList<>(Arrays.asList(1,3,4,5,2,3,6,5,1));
        System.out.println(Bibliotheque.sommeNulle(liste));
        System.out.println(Bibliotheque.Occurence(liste));
        System.out.println(Bibliotheque.exactementMemesValeurs(liste, liste1));
        System.out.println(Bibliotheque.exactementMemesValeurs(liste1, liste2));;
    } 
}


