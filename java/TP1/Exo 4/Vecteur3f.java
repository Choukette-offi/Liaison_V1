public class Vecteur3f {
    private double x;
    private double y;
    private double z;

    public Vecteur3f(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void modifier(double valx, double valy, double valz){
        this.x = valx;
        this.y = valy;
        this.z = valz;
    }

    public double norme(){
        return Math.sqrt(Math.abs((this.x * this.x)) + Math.abs((this.y * this.y)) + Math.abs((this.z * this.z)));
    }
    @Override
    public String toString(){
        return "Vecteur3f: <" + this.x  + this.y  + this.z + "> De norme: " + this.norme();
    }
}

