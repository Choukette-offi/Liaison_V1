import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Panier{
    private List<Oeuf> lesOeufs;

    public Panier() {
        this.lesOeufs = new ArrayList<>();
    }

    public void ajouterOeuf(Oeuf oeuf) {
        for (Oeuf o : lesOeufs) {
            if (o.getType().equals(oeuf.getType())) {
                o.incrementerQte(oeuf.getQte());
                return;
            }
        }
        lesOeufs.add(oeuf);
    }

    public int poidsTotal(Oeuf oeuf) throws PanierVideExeption {
        if (lesOeufs.isEmpty()) {
            throw new PanierVideExeption("Le panier est vide");
        }
        else{
            int qte = 0;
            for(Oeuf o : lesOeufs){
                qte += (o.getPoids() * o.getQte());
            }
            return qte;
        }
    }

    public int quantiteDe(String type) throws PasDeTelTypeDOeufExeption {
        int qte = 0;
        for(Oeuf o : lesOeufs){
            if(o.getType().equals(type)){
                qte += o.getQte();
            }
        }
        if(qte == 0){
            throw new PasDeTelTypeDOeufExeption("Pas de tel type d'oeuf");
        }
        return qte;
    }

    public Oeuf OeufLePlusLeger() throws PanierVideExeption {
        if (lesOeufs.isEmpty()) {
            throw new PanierVideExeption("Le panier est vide");
        }
        Oeuf oeufLePlusLeger = lesOeufs.get(0);
        for (Oeuf oeuf : lesOeufs) {
            if (oeuf.getPoids() < oeufLePlusLeger.getPoids()) {
                oeufLePlusLeger = oeuf;
            }
        }
        return oeufLePlusLeger;
    }
    public List<Oeuf> trierOeufs(){
        List<Oeuf> lesOeufsTries = new ArrayList<>(this.lesOeufs);
        Collections.sort(lesOeufsTries);
        return lesOeufsTries;
    }
}
