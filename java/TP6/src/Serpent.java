public class Serpent extends Animal {
    private boolean estVenimeux;

    public Serpent(String nom, double poids, boolean venimeux){
        super(nom, poids);
        this.estVenimeux = venimeux;
    }

    @Override
    public String toString(){
        if(this.estVenimeux){
            return "\n" + "Serpent " + super.toString() + " venimeux" + "\n";
        }
        
        else{
            return "\n" + "Serpent " + super.toString() + " non venimeux" + "\n";
        }
    }
    
    public String crier(){
        return "SSSSSSSSSsssssssssss!!!!";
    }

}
