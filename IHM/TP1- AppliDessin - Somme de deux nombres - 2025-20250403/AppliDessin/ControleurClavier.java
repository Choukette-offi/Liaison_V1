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
            System.out.println("+");
        }
    }
}
