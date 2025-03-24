public class ExecutableCouple {
    public static void main(String [] args) {
    // Tests pour les méthodes somme() et produit() de Couple
    Couple exemple;
    exemple = new Couple(3, -8);
    assert exemple.somme() == -5;
    assert exemple.produit() == -24;
    exemple = new Couple();
    assert exemple.somme() == 0;
    assert exemple.produit() == 0;
    exemple = new Couple(7);
    assert exemple.somme() == 14;
    assert exemple.produit() == 49;
    }
    }