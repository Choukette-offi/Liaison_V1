import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Plateau{
    private int nbLignes;
    private int nbColonnes;
    private int pourcentageDeBombes;
    private int nbBombes;
    private List<List<CaseIntelligente>> lePlateau;
    public Plateau(int nbLignes, int nbColonnes, int pourcentageDeBombes){
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.pourcentageDeBombes = pourcentageDeBombes;
        this.creerLesCasesVides();
        this.nbBombes = 0;
        this.poseDesBombesAleatoirement();
    }
    private void creerLesCasesVides(){
        this.lePlateau = new ArrayList<>();
        for (int i=0;i<this.nbLignes;i++){
            List<CaseIntelligente> ligne = new ArrayList<>();
            this.lePlateau.add(ligne);
            for (int j=0;j<this.nbColonnes;j++){
                ligne.add(new CaseIntelligente());
            }
        }
        this.rendLesCasesIntelligentes();
    }
    private void rendLesCasesIntelligentes(){
        for (int x=0;x<this.nbLignes;x++){
            for (int y=0;y<this.nbColonnes;y++){
                for (int dx=-1;dx<2;dx++){
                    for (int dy=-1;dy<2;dy++){
                        if (dx!=0 || dy != 0){
                            try{
                                this.getCase(x,y).ajouteVoisine(this.getCase(x+dx, y+dy));
                            }
                            catch(IndexOutOfBoundsException e){}
                        }
                    }
                }
            }
        }
    }
    protected void poseDesBombesAleatoirement(){
        Random generateur = new Random();
        for (int x = 0; x < this.getNbLignes(); x++){
            for (int y = 0; y < this.getNbColonnes(); y++){
                if (generateur.nextInt(100)+1 < this.pourcentageDeBombes){
                    this.poseBombe(x, y);
                    this.nbBombes = this.nbBombes + 1;
                }
            }
        }
    }

}
