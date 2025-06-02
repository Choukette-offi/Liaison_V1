package pourEtu.exo4;
import java.util.*;

public class Bibliothéque {
    public static <T extends Iterator<T>> void afficheTous(Iterable<T> coll){
        Iterator<T> it = coll.iterator(); 
        while (it.hasNext()) {
            System.out.println(it.next()+ " ");
        }
    }

    public static <T extends Iterator<T>> void getMin(Iterable<T> coll){
        Iterator<T> it = coll.iterator();
        
}
