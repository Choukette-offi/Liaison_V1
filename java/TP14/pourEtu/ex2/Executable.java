import java.util.ArrayList;
import java.util.List;

public class Executable{
    public static void main(String[] args){
        List<Integer> l = new ArrayList <>();
        l.add(5);
        l.add(4);
        System.out.println(Iterateur.mystere0(l));
        System.out.println(Iterateur.mystere1(l, 2));
    }
}