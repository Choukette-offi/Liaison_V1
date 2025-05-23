public class CoupleGenerique<T extends Comparable<T>> implements Comparable<CoupleGenerique<T>> {
    private T a;
    private T b;

    CoupleGenerique(T a, T b){
        this.a = a;
        this.b = b;
    }

    public T getA(){
        return a;
    }
    public T getB(){
        return b;
    }

    @Override
    public int compareTo(CoupleGenerique<T> cpl){
        return a.compareTo(cpl.getA());
    }
}
