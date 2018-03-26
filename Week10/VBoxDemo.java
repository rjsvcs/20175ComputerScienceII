import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox();

        box.getChildren().addAll(new Label("Top"), new Label("Middle"),
                new Label("Bottom"));

        primaryStage.setScene(new Scene(box));

        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
