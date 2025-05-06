public class Executable {
    public static void main(String[] args){
        Panier panier = new Panier();
        Oeuf oeuf1 = new Oeuf("Oeuf en chocalat", 50, 10);
        Oeuf oeuf2 = new Oeuf("Oeuf de poule", 100, 5);
        
        panier.ajouterOeuf(oeuf1);
        panier.ajouterOeuf(oeuf2);
        
        try{
            panier.quantiteDe("Oeuf praliné");
        }
        catch(PasDeTelTypeDOeufExeption e){
            System.out.println(e.getMessage());
        }
        try{
            panier.quantiteDe("Oeuf en chocalat");
        }
        catch(PasDeTelTypeDOeufExeption e){
            System.out.println(e.getMessage());
        }
        try{
            panier.quantiteDe("Oeuf de poule");
        }
        catch(PasDeTelTypeDOeufExeption e){
            System.out.println(e.getMessage());
        }

        try {
             panier.poidsTotal(oeuf1);
        }
        catch(PanierVideExeption e){
            System.out.println(e.getMessage());
        }
        
        try{
            panier.OeufLePlusLeger();
        }
        catch(PanierVideExeption e){
            System.out.println(e.getMessage());
        }
    }
}
