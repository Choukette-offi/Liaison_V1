import java.util.Comparator;

public class ComparePrix implements Comparator<Livre> {
    
    @Override
    public int compare(Livre Livre1, Livre Livre2){
        if (Livre1.getPrix() == Livre2.getPrix())
            return 0;
        if (Livre1.getPrix() > Livre2.getPrix())
            return -1;
        return 1;
    }
}
