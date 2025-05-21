import java.util.*;
public class Executablepokedex {
    public static void main(String[] args) {
        Pokedex pokedexAnakin = new Pokedex();
        pokedexAnakin.ajouterPokemon(Attaque.DRAGON, "Carmache");
        pokedexAnakin.ajouterPokemon(Attaque.DRAGON, "Palkia");
        pokedexAnakin.ajouterPokemon(Attaque.EAU, "Palkia");
        pokedexAnakin.ajouterPokemon(Attaque.SOL, "Carmache");
        pokedexAnakin.ajouterPokemon(Attaque.DRAGON, "Colimucus");
        System.out.println(pokedexAnakin);
        System.out.println(pokedexAnakin.appartient("Carmache"));
        System.out.println(pokedexAnakin.appartient("Arceus"));
        try {
            System.out.println(pokedexAnakin.toutesLesAttaques("Palkia"));
            System.out.println(pokedexAnakin.toutesLesAttaques("Arceus"));
        } catch (PasUnTelPokemonException e) {
            System.err.println("Le pokemon n'existe pas");
        }
        System.out.println(pokedexAnakin.attaquePreferee());
        System.out.println(pokedexAnakin.convertDico());
    }
}