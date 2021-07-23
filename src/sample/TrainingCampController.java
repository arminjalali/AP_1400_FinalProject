package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;

public class TrainingCampController {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void easyBot() throws IOException, InterruptedException {
        stage.close();
        Game game = new Game();
        game.gameMap();
    }
}
