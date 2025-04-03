import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.event.EventHandler;

public class ControleurClavier implements EventHandler<KeyEvent>{
    private AppliDessin appli;
    
    public ControleurClavier(AppliDessin appli){
        this.appli = appli;
    }
    
    public void handle(KeyEvent e){       
        if (e.getCode().equals(KeyCode.ADD)){
            this.appli.augmenteLeDernierCercle();
            System.out.println("+");
        }
        else if (e.getCode().equals(KeyCode.SUBTRACT)){
            this.appli.diminueLeDernierCercle();
            
            System.out.println("-");
        }

        else if(e.getCode().equals(KeyCode.MULTIPLY)){
            this.appli.changeCouleur();
            System.out.println("*");
        }
    }
}
