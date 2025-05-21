public class ExecutablePokemon {
    public static void main(String [] args) {
    Pokemon poke;
    poke = new Pokemon("Bulbizarre", 30);
    poke.evoluer("Herbizarre", 37);
    poke.evoluer("Florizarre");
    System.out.println(poke.toString()); // (1)
    Pokemon abo = new Pokemon("Abo", 10);
    abo.evoluer("Arkob", 24);
    System.out.println(abo.toString()); // (1)
    }
    }
