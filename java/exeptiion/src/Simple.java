public class Simple<T> {
    private T Val;
    
    public Simple(T val) {
        this.Val = val;
    }

    public T getVal() {
        return Val;
    }

    public Simple(){
        this.Val = null;
    } 

    public void setVal(T val) {
        this.Val = val;
    }
}