package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class BattleDeckController {
    private Stage stage;
    private ArrayList<ImageView> selectedCard = new ArrayList<>();
    private int counter;
    private ImageView blank = new ImageView();
    @FXML
    private ImageView myCard1;
    @FXML
    private ImageView myCard2;
    @FXML
    private ImageView myCard3;
    @FXML
    private ImageView myCard4;
    @FXML
    private ImageView myCard5;
    @FXML
    private ImageView myCard6;
    @FXML
    private ImageView myCard7;
    @FXML
    private ImageView myCard8;
    @FXML
    private ImageView archerCard;

    public void setStage(Stage stage) {
        this.stage = stage;
        counter = 1;
    }

    @FXML
    public void chooseCard(MouseEvent event){
        ImageView imageView = (ImageView) event.getSource();

        if (counter == 1){
            counter++;
            blank.setImage(myCard1.getImage());
            myCard1.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 2){
            counter++;
            blank.setImage(myCard2.getImage());
            myCard2.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 3){
            counter++;
            blank.setImage(myCard3.getImage());
            myCard3.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 4){
            counter++;
            blank.setImage(myCard4.getImage());
            myCard4.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 5){
            counter++;
            blank.setImage(myCard5.getImage());
            myCard5.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 6){
            counter++;
            blank.setImage(myCard6.getImage());
            myCard6.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 7){
            counter ++;
            blank.setImage(myCard7.getImage());
            myCard7.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
        else if (counter == 8){
            counter = 1;
            blank.setImage(myCard8.getImage());
            myCard8.setImage(imageView.getImage());
            imageView.setImage(blank.getImage());
        }
    }

    @FXML
    public void finishSelect() throws IOException {
        selectedCard.add(myCard1);
        selectedCard.add(myCard2);
        selectedCard.add(myCard3);
        selectedCard.add(myCard4);
        selectedCard.add(myCard5);
        selectedCard.add(myCard6);
        selectedCard.add(myCard7);
        selectedCard.add(myCard8);
        stage.close();
        Main main = new Main();
        main.menu();
    }
}
