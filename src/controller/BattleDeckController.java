package controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BattleDeckController {
    private Stage stage;
    private ArrayList<ImageView> selectedCard = new ArrayList<>();
    private ArrayList<Boolean> blanks = new ArrayList<>();
    private Map <ImageView , Integer> map = new HashMap<>();
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

    public void setFields(Stage stage) {
        this.stage = stage;
        for (int i = 0 ; i < 8 ; i++){
            blanks.add(false);
        }
    }

    @FXML
    public void chooseCard(MouseEvent event){
        ImageView imageView = (ImageView) event.getSource();
        if (!selectedCard.contains(imageView)) {
            if (!blanks.get(0)) {
                blanks.set(0 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard1.getLayoutX();
                double y2 = myCard1.getLayoutY();
                myCard1.setLayoutX(x1);
                myCard1.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(0 , imageView);
                map.put(imageView , 0);
            } else if (!blanks.get(1)) {
                blanks.set(1 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard2.getLayoutX();
                double y2 = myCard2.getLayoutY();
                myCard2.setLayoutX(x1);
                myCard2.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(1 , imageView);
                map.put(imageView , 1);
            } else if (!blanks.get(2)) {
                blanks.set(2 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard3.getLayoutX();
                double y2 = myCard3.getLayoutY();
                myCard3.setLayoutX(x1);
                myCard3.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(2 , imageView);
                map.put(imageView , 2);
            } else if (!blanks.get(3)) {
                blanks.set(3 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard4.getLayoutX();
                double y2 = myCard4.getLayoutY();
                myCard4.setLayoutX(x1);
                myCard4.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(3 , imageView);
                map.put(imageView , 3);
            } else if (!blanks.get(4)) {
                blanks.set(4 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard5.getLayoutX();
                double y2 = myCard5.getLayoutY();
                myCard5.setLayoutX(x1);
                myCard5.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(4 , imageView);
                map.put(imageView , 4);
            } else if (!blanks.get(5)) {
                blanks.set(5 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard6.getLayoutX();
                double y2 = myCard6.getLayoutY();
                myCard6.setLayoutX(x1);
                myCard6.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(5 , imageView);
                map.put(imageView , 5);
            } else if (!blanks.get(6)) {
                blanks.set(6 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard7.getLayoutX();
                double y2 = myCard7.getLayoutY();
                myCard7.setLayoutX(x1);
                myCard7.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(6 , imageView);
                map.put(imageView , 6);
            } else if (!blanks.get(7)) {
                blanks.set(7 , true);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard8.getLayoutX();
                double y2 = myCard8.getLayoutY();
                myCard8.setLayoutX(x1);
                myCard8.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.add(7 , imageView);
                map.put(imageView , 7);
            }
        }
        else{
            if (map.get(imageView) == 0) {
                blanks.set(0 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard1.getLayoutX();
                double y2 = myCard1.getLayoutY();
                myCard1.setLayoutX(x1);
                myCard1.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(0 , imageView);
            } else if (map.get(imageView) == 1) {
                blanks.set(1 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard2.getLayoutX();
                double y2 = myCard2.getLayoutY();
                myCard2.setLayoutX(x1);
                myCard2.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(1 , imageView);
            }else if (map.get(imageView) == 2) {
                blanks.set(2 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard3.getLayoutX();
                double y2 = myCard3.getLayoutY();
                myCard3.setLayoutX(x1);
                myCard3.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(2 , imageView);
            } else if (map.get(imageView) == 3) {
                blanks.set(3 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard4.getLayoutX();
                double y2 = myCard4.getLayoutY();
                myCard4.setLayoutX(x1);
                myCard4.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(3 , imageView);
            } else if (map.get(imageView) == 4) {
                blanks.set(4 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard5.getLayoutX();
                double y2 = myCard5.getLayoutY();
                myCard5.setLayoutX(x1);
                myCard5.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(4 , imageView);
            }else if (map.get(imageView) == 5) {
                blanks.set(5 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard6.getLayoutX();
                double y2 = myCard6.getLayoutY();
                myCard6.setLayoutX(x1);
                myCard6.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(5 , imageView);
            } else if (map.get(imageView) == 6) {
                blanks.set(6 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard7.getLayoutX();
                double y2 = myCard7.getLayoutY();
                myCard7.setLayoutX(x1);
                myCard7.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(6 , imageView);
            } else if (map.get(imageView) == 7) {
                blanks.set(7 , false);
                double x1 = imageView.getLayoutX();
                double y1 = imageView.getLayoutY();
                double x2 = myCard8.getLayoutX();
                double y2 = myCard8.getLayoutY();
                myCard8.setLayoutX(x1);
                myCard8.setLayoutY(y1);
                imageView.setLayoutX(x2);
                imageView.setLayoutY(y2);
                selectedCard.remove(imageView);
                map.remove(7 , imageView);
            }
        }
    }

    @FXML
    public void finishSelect() throws IOException {
        selectedCard.add(myCard3);
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
