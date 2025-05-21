import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Toggle;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Applidiagramme extends Application{

    @Override
    public void init(){
        // cette méthode est utilisée pour initialiser les éléments 
        // non graphiques et événetuellement graphiques autres que la Scène et le Stage
    }

    private BorderPane root(){
        BorderPane pane = new BorderPane(); 
        pane.setTop(BorderPane());
        pane.setCenter(VBox());
        pane.setRight(TilePane());
        return pane;
    }

    private BorderPane BorderPane(){
        BorderPane pane = new BorderPane();
        pane.setStyle("-fx-background-color:rgb(59, 103, 161);");
        Label txt1 = new Label("Allo 45 -Module Analyste");
        txt1.setStyle("-fx-font-size: 24px;");
        Button boutonDeco = new Button("Deconnexion");
        boutonDeco.setGraphic("../graphics/user.png");
        pane.setLeft(txt1);
        pane.setRight(boutonDeco);
        pane.setPadding(new Insets(5));
        return pane;
    }

    private VBox VBox(){
        Label txt2 = new Label("Analyse du Sondage sur les habitudes alimentaires");
        txt2.setStyle("-fx-font-size: 20px;");
        ComboBox menu = new ComboBox<String>();
        PieChart chart = new PieChart();
        chart.setTitle("Que lisez-vous au petit déjeuner ?" ) ;
        chart.getData().setAll(
            new PieChart.Data("Le journal" , 21),
            new PieChart.Data("Un livre" , 3),
            new PieChart.Data("Le courier" , 7),
            new PieChart.Data("La boîte de céréales", 75));
        chart.setLegendSide(Side.LEFT) ; // pour mettre la l é gende à gauche
        Button boutonQuestP = new Button("Question précédente");
        Button boutonQuestS = new Button("Question suivante");
        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(boutonQuestP,boutonQuestS); 
        VBox vbox = new VBox();
        vbox.getChildren().addAll(txt2,menu,chart,hbox);
        vbox.setPadding(new Insets(5));
        return vbox;
    }

     public TilePane TilePane(){
        TilePane tilePane = new TilePane();
        tilePane.setStyle("-fx-background-color:rgb(207, 228, 255);");
        ImageView a1 =new ImageView(new Image("../graphics/chart_1.png"));
        ImageView a2 =new ImageView(new Image("../graphics/chart_2.png"));
        ImageView a3 =new ImageView(new Image("../graphics/chart_3.png"));
        ImageView a4 =new ImageView(new Image("../graphics/chart_4.png"));
        ImageView a5 =new ImageView(new Image("../graphics/chart_5.png"));
        ImageView a6 =new ImageView(new Image("../graphics/chart_6.png"));
        ImageView a7 =new ImageView(new Image("../graphics/chart_7.png"));
        tilePane.getChildren().addAll(a1,a2,a3,a4,a5,a6,a7);
        return tilePane;
    }

    @Override
    public void start(Stage stage){              
        Scene scene =new Scene(root(), 800, 600);
        stage.setTitle("diagramme");
        stage.setScene(scene);
        stage.show();
    }

    public void quitte(){
        Platform.exit();
    }
}