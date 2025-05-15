import java.util.Comparator;

public class CompareFantome implements Comparator<Fantome>{
    @Override
    public int compare(Fantome f1, Fantome f2) {
        return Integer.compare(f1.getForce(), f2.getForce());
    }
}
