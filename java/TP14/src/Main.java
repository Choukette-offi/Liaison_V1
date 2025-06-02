import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer>l = new ArrayList <>();
        l.add(5);
        l.add(4);
        Iterator<Integer> iterateur = l.iterator();
        while(iterateur.hasNext()){
            System.out.println(iterateur.next());
        } 
    }
}