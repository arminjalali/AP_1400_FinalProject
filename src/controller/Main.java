package controller;

import controller.BattleDeckController;
import controller.MenuController;
import controller.SampleController;
import controller.TrainingCampController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/sample.fxml"));
        SampleController sampleController = new SampleController(primaryStage);
        fxmlLoader.setController(sampleController);
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Clash Royale");
        primaryStage.setScene(new Scene(root, 321, 380));
        primaryStage.show();
    }
    public void menu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/menu.fxml"));
        MenuController menuController = new MenuController();
        fxmlLoader.setController(menuController);
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.setScene(new Scene(root , 357 , 436));
        menuController.setStage(stage);
        stage.show();
    }
    public void trainingCamp() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/trainingCamp.fxml"));
        TrainingCampController trainingCampController = new TrainingCampController();
        fxmlLoader.setController(trainingCampController);
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Training Camp");
        stage.setScene(new Scene(root , 242 , 347));
        trainingCampController.setStage(stage);
        stage.show();
    }
    public void battleDeck() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../view/battleDeck.fxml"));
        BattleDeckController battleDeckController = new BattleDeckController();
        fxmlLoader.setController(battleDeckController);
        Parent root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Battle Deck");
        stage.setScene(new Scene(root , 390 , 592));
        battleDeckController.setFields(stage);
        stage.show();
    }
    public static void main(String[] args) throws InterruptedException {
        launch(args);
    }
}
