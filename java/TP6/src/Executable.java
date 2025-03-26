public class Executable {
    public static void main(String[] args) {
        Zoo Beauval = new Zoo("Beauval");
        Animal Simba = new Lion("Simba", 55.0, false);
        Animal Mufasa = new Lion("Mufasa", 120.0, true);
        Animal Kaa = new Serpent("Kaa", 30.0, false);
        Beauval.ajouteAnimal(Simba);
        Beauval.ajouteAnimal(Mufasa);
        Beauval.ajouteAnimal(Kaa);
        System.out.println(Beauval.toString());
        System.out.println(Simba.crier());
        System.out.println(Mufasa.crier());
        System.out.println(Kaa.crier());
    }
}