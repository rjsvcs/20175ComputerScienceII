import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class OurVeryFirstGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        final Background yellow = new Background(new BackgroundFill(Color.YELLOW, null, null));
        final Background purple = new Background(new BackgroundFill(Color.PURPLE, null, null));
        final Background red = new Background(new BackgroundFill(Color.RED, null, null));

        BorderPane pane = new BorderPane();
        final Label label = new Label("");
        label.setBackground(red);



        label.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
        label.setPrefHeight(600);
        label.setPrefWidth(300);
        pane.setCenter(label);

        label.setOnMouseClicked((e) -> {
            int clicked = e.getClickCount();
            label.setText(Integer.toString(clicked));
        });

        label.setStyle("-fx-background-color: green;");


        GridPane buttons = new GridPane();
        buttons.setMaxWidth(Double.MAX_VALUE);

        Button left = new Button("Left");
        left.setMaxWidth(Double.MAX_VALUE);
        left.setOnAction((e) -> {
            label.setBackground(yellow);
        });



        buttons.add(left, 0, 0);

        Button right = new Button("Right");
        right.setMaxWidth(Double.MAX_VALUE);
        right.setOnAction((e) -> {
            label.setBackground(purple);
        });
        buttons.add(right, 1, 0);


        ColumnConstraints constraints = new ColumnConstraints();
        constraints.setPercentWidth(50.0);
        buttons.getColumnConstraints().addAll(constraints, constraints);

        pane.setBottom(buttons);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setTitle("Hi there!");
        primaryStage.show();
    }


//    private class ButtonObserver implements EventHandler<ActionEvent> {
//
//        @Override
//        public void handle(ActionEvent event) {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setContentText("You clicked a button!");
//            alert.show();
//        }
//    }

}
