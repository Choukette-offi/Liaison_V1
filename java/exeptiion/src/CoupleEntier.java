public class CoupleEntier implements Comparable<CoupleEntier> {
    private Integer a;
    private Integer b;

    CoupleEntier(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public Integer getA(){
        return a;
    }
    public Integer getB(){
        return b;
    }

    @Override
    public int compareTo(CoupleEntier o) {
        Integer res = this.a - o.a;
        if(res == 0){
            return this.b - o.b;
        }
        return res;
    }
}