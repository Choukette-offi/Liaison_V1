import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
public class ControleurOperation implements EventHandler<ActionEvent> {
    private AppliSomme appli;

    public ControleurOperation(AppliSomme appli) {
        this.appli = appli;
    }

    @Override
    public void handle(ActionEvent e) {
            RadioButton source = (RadioButton) e.getSource();
            if (source.getText().equals("+")) {
                appli.additionne();
            } else if (source.getText().equals("-")) {
                appli.soustrait();
            } else if (source.getText().equals("*")) {
                appli.multiplie();
            } else if (source.getText().equals("/")) {
                appli.divise();
                }
    }
}