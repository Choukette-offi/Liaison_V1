import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Executable {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,2,1,4,5,6,4,5,2,3,6,5,1);
        List<Integer> ls1 = Arrays.asList(7,8,9,10,4,5,8,5,2,3,9,1,4,5,8,7);
        Bibliotheque.indiceEgaleElement(ls1);
        Bibliotheque.indiceEgaleElement(ls);
        Bibliotheque.enCommun(ls, ls1);
        Bibliotheque.compressionList(ls);
        System.out.println(ls);
    }
}