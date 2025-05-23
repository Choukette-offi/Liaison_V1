public class Executable {
    Simple<String> s = new Simple<>("toto");
    Simple<Integer> i = new Simple<>(12);
    Simple<Double> d = new Simple<>(5.5);
    Simple<String> s2 = new Simple<>();
    Simple<Integer> i2 = new Simple<>();
    Simple<Double> d2 = new Simple<>();
    CoupleGenerique<Integer> n1 = new CoupleGenerique<Integer>(6, 2);
    CoupleGenerique<Integer> n2 = new CoupleGenerique<Integer>(64, 21);
    CoupleGenerique<Integer> n3 = new CoupleGenerique<Integer>(64, 3);
    CoupleGenerique<Integer> n4 = new CoupleGenerique<Integer>(6, 2);
    n1.compareTo(n2);
}
