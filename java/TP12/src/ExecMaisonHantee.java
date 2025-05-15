public class ExecMaisonHantee {
    public static void main ( String [] args ) {
    Fantome revenant = new Fantome ("Le Revenant", 3 , 120) ;
    Fantome spectre = new Fantome ("Le Revenant", 3 , 120) ;
    Fantome macheur = new Fantome ("Le M â cheur", 1 , 190) ;
    Fantome frappeur = new Fantome ("Le Frappeur", 5 , 250) ;
    Fantome vortex = new Fantome ("Le Vortex", 4 , 300) ;
    Fantome mortitia = new Fantome ("Mortitia", 5 , 230) ;
    MaisonHantee haloween = new MaisonHantee ("Haloween") ;
    haloween.ajouter(revenant);
    haloween.ajouter(spectre);
    haloween.ajouter(macheur);
    haloween.ajouter(frappeur);
    haloween.ajouter(vortex);
    haloween.ajouter(mortitia);
    System.out.println(haloween);
    // la suite
    }
    }
