import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
class Executable {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1,3,2,1,4,5,6,4,5,2,3,6,5,1);
        Bibliotheque.compressionList(ls);
        System.out.println(ls);
    }
    
}