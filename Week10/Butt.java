import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Butt extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Button button = new Button("Button!");
        button.setFont(new Font("Courier New", 48));
        button.setPrefHeight(200);
        button.setPrefWidth(400);
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                Alert alert = new Alert(Alert.AlertType.INFORMATION);
//                alert.setTitle("Hi!");
//                alert.setContentText("Here is some content!");
//                alert.show();
//            }
//        });
        button.setOnAction((e) -> {
            showAlert();
        });

        Scene scene = new Scene(button);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Hey, look, it's a title.");
        primaryStage.show();

    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hi!");
        alert.setContentText("Here is some content!");
        alert.show();
    }

//    private class ButtonObserver implements EventHandler<ActionEvent> {
//
//        @Override
//        public void handle(ActionEvent event) {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Hi!");
//            alert.setContentText("Here is some content!");
//            alert.show();
//        }
//    }
}
