import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Random;

public class WhackAMole extends Application {
    private static final Random RNG = new Random();
    private static final Background WHEAT = new Background(new BackgroundFill(Color.WHEAT, null, null));
    private static final Background PAPAYA_WHIP = new Background(new BackgroundFill(Color.DODGERBLUE, null, null));

    private int score = 0;
    private Label scoreLabel;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane moles = new GridPane();
        for(int col=0; col<3; col++) {
            for(int row=0; row<3; row++) {
                Mole mole = new Mole();
                Thread thread = new Thread(mole);
                thread.setDaemon(true);
                thread.start();
                moles.add(mole, col, row);
            }
        }


        BorderPane border = new BorderPane();
        scoreLabel = new Label("0");
        scoreLabel.setFont(new Font("Comic Sans", 36));
        border.setTop(scoreLabel);

        border.setCenter(moles);


        primaryStage.setScene(new Scene(border));
        primaryStage.setTitle("Whack a Mole");
        primaryStage.show();
    }




    private class Mole extends Button implements Runnable {
        private boolean active;

        Mole() {
            super("");
            setPrefHeight(100);
            setPrefWidth(100);
            setBackground(WHEAT);
            active = false;

            setOnAction((e) -> {
                whack();
            });
        }

        private void whack() {
            if(active) {
                score = score + 1;
                active = false;
                scoreLabel.setText(Integer.toString(score));
                setBackground(WHEAT);
            }
        }

        @Override
        public void run() {
            while(true) {

                long sleepTime = RNG.nextInt(1000) + 1000;
                try {
                    Thread.sleep(sleepTime);
                    active = true;
                    setBackground(PAPAYA_WHIP);
                    Thread.sleep(750);
                    setBackground(WHEAT);
                    active = false;

                } catch (InterruptedException e) {
                    // squash
                }
            }
        }
    }
}
