public class Lion extends Animal {
    private boolean aCrinière;

    public Lion(String nom, double poids, boolean criniere){
        super(nom, poids);
        this.aCrinière = criniere;
    }

    @Override
    public String toString(){
        if(this.aCrinière){
            return "\n" + "Lion " + super.toString() + " possède une crinière" + "\n";
        }
        
        else{
            return "\n" + "Lion " + super.toString() + " sans crinière" + "\n";
        }
    }
    public String crier(){
        return "RHOOOOOOOOOOOOOUUUUUU !!!!";
    }

}
