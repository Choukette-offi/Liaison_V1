import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Toggle;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ToggleGroup;

public class AplliLog extends Application{

    private Label resultat;
    private TextField tf1;
    private TextField tf2;

    @Override
    public void init(){
        // cette méthode est utilisée pour initialiser les éléments 
        // non graphiques et événetuellement graphiques autres que la Scène et le Stage
        this.tf1 = new TextField();
        this.tf2 = new TextField();
        this.resultat = new Label("");        
    }

    private GridPane gridPane(){
        GridPane pane = new GridPane();
        pane.add(new Label("Identifiants"), 0, 0);
        pane.add(new Label("Mot De Passe"), 0, 1);        
        pane.add(tf1, 1, 0,3,1);
        pane.add(tf2, 1, 1,3,1);
        pane.setHgap(30);
        pane.setVgap(20); 
        Button boutonQ =new Button("Connexion");
        pane.add(boutonQ, 3, 2);;
        boutonQ.setAlignment(Pos.BOTTOM_RIGHT);
        boutonQ.setOnAction(new ControleurQuitter(this)); 
        return pane;
    }

    private HBox root(){
        HBox pane = new HBox(10);
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(gridPane());
        vbox.setPrefWidth(350);
        HBox.setMargin(vbox, new Insets(10));
        pane.getChildren().add(vbox);
        return pane;
    }

    @Override
    public void start(Stage stage){              
        Scene scene =new Scene(root());
        stage.setTitle("Page de connexion");
        stage.setScene(scene);
        stage.show();
    }

    public void quitte(){
        Platform.exit();
    }
}