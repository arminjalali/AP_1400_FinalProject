package sample;

import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class MenuController {
    private Stage stage;
    public void setStage(Stage stage){
        this.stage = stage;
    }
    @FXML
    public void logOut() throws Exception {
        stage.close();
        Stage stage = new Stage();
        Main main = new Main();
        main.start(stage);
    }
    @FXML
    public void trainingCamp() throws IOException {
        stage.close();
        Main main = new Main();
        main.trainingCamp();
    }

    @FXML
    public void battleDeck() throws IOException {
        stage.close();
        Main main = new Main();
        main.battleDeck();
    }
}
