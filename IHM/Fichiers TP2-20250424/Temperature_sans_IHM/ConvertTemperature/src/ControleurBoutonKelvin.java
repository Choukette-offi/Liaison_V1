import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class ControleurBoutonKelvin implements EventHandler<ActionEvent>{ 

    private AppliConverter appli;
    private Temperature temperature;
    
    public ControleurBoutonKelvin(Temperature temperature, AppliConverter appli){
        this.temperature = temperature;
        this.appli = appli;
    }

    @Override
    public void handle(ActionEvent e) {
        double value;
        try{
            value = this.appli.getValueKelvin();
            this.temperature.setvaleurKelvin(value);
            this.appli.majTF();                
        }
        catch (NumberFormatException exp) {
            this.appli.effaceTF();
        }
    }
          
}