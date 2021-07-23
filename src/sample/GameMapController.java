package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GameMapController {

    @FXML
    ImageView card1;
    @FXML
    private Text timerText;
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void action(){
        card1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("This is checkmark");
                a.show();
            }
        });
    }
    public void timeCount(int time){
        String str = "";
        int minute = time / 60;
        int second = time - (minute * 60);
        str += minute + ":";
        if (second < 10){
            str += "0";
        }
        str += second;
        timerText.setText(str);
    }
}
