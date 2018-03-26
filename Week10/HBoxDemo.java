import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox box = new HBox();

        box.getChildren().addAll(new Label("Left"), new Label("Middle"),
                new Label("Right"));

        primaryStage.setScene(new Scene(box));

        primaryStage.sizeToScene();
        primaryStage.show();
    }
}
