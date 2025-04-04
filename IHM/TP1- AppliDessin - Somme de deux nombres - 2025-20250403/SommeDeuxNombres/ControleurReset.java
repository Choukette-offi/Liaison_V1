import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ControleurReset implements EventHandler<ActionEvent> {
   private AppliSomme appli;

   public ControleurReset(AppliSomme var1) {
      this.appli = var1;
   }

   public void handle(ActionEvent var1) {
      this.appli.efface();
      System.err.println("reset");
   }
}