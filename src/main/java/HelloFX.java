import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hej fra JavaFX " + version);
        Label label2 = new Label("Mikkel er en kæmpe boomer");
        Button button = new Button("Når du rør mig bliver jeg dobbelt så stor :^ hihihi)");
        Stage stage2 = new Stage();
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button button2 = new Button("HØHØHØHØØ");
                Label label3 = new Label("Hejsa");
                GridPane pane2 = new GridPane();
                pane2.add(button2, 0 ,0 );
                pane2.add(label3, 1, 1);

                Scene scene2 = new Scene(pane2, 1280, 960);
                stage2.setScene(scene2);
                stage2.show();
            }
        });

        GridPane pane = new GridPane();
        pane.add(label,0,0);
        pane.add(label2,1,1);
        pane.add(button,3,3); //Row -> //column ^
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    }
