package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Game {
    private int time;
    private GameMapController gameMapController;

    public Game(){
        time = 180;
    }
    public void startTimeOfGame() throws InterruptedException {
        TimerTask timeOfGame = new TimerTask() {
            @Override
            public void run() {
                while (time != 0){
                    try {
                        TimeUnit.SECONDS.sleep(1);
                        time--;
                        gameMapController.timeCount(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("End of Game!");
                System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timeOfGame , 1);
    }
    public void start(){

    }

    public void gameMap() throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gameMap.fxml"));
        gameMapController = new GameMapController();
        fxmlLoader.setController(gameMapController);
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Training Camp");
        stage.setScene(new Scene(root , 391 , 691));
        gameMapController.setStage(stage);
        stage.show();
        startTimeOfGame();
    }
}
