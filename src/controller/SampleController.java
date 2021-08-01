package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;


public class SampleController {
    private Stage stage;
    @FXML
    private TextField usernameFieldLogin;
    @FXML
    private TextField usernameFieldSignUp;
    @FXML
    private PasswordField passwordFieldLogin;
    @FXML
    private PasswordField passwordFieldSignUp;
    @FXML
    private PasswordField confirmPasswordFieldSignUp;
    public SampleController(Stage stage){
        this.stage = stage;
    }
    @FXML
    public void login() throws IOException {
        if (!new File("personalInfo.txt").exists()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("You haven't signed up yet.");
            alert.showAndWait();
            voidEveryThing();
            return;
        }
        try {
            FileReader reader = new FileReader("personalInfo.txt");
            BufferedReader reader1 = new BufferedReader(reader);
            for (int i = 0 ; i < usernameFieldLogin.getText().length() ; i++){
                int num = usernameFieldLogin.getText().charAt(i);
                if (num > 64 && num < 91){
                    usernameFieldLogin.setText(usernameFieldLogin.getText().replace(usernameFieldLogin.getText().charAt(i) , (char) (num + 32)));
                }
            }
            String str;
            while ((str = reader1.readLine()) != null){
                String [] split = str.split("@");
                if (split[0].equals(usernameFieldLogin.getText()) && split[1].equals(passwordFieldLogin.getText())){
                    stage.close();
                    Main main = new Main();
                    main.menu();
                    return;
                }
            }
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("You haven't signed up yet.");
            alert.showAndWait();
            reader1.close();
            reader.close();
            voidEveryThing();
        } catch (FileNotFoundException e) {
            System.out.println("Error in opening file!");
        }
    }
    @FXML
    public void signUp() throws IOException {
        if (usernameFieldSignUp.getText().equals("") || passwordFieldSignUp.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Fill all fields.");
            alert.showAndWait();
            voidEveryThing();
            return;
        } else if (usernameFieldSignUp.getText().length() < 4 || usernameFieldLogin.getText().length() > 12) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Username can not shorter than 4 characters or greater than 12 characters.");
            alert.showAndWait();
            voidEveryThing();
            return;
        } else if (!passwordFieldSignUp.getText().equals(confirmPasswordFieldSignUp.getText())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Please make sure your passwords match.");
            alert.showAndWait();
            voidEveryThing();
            return;
        } else if (passwordFieldSignUp.getText().length() < 8 || passwordFieldSignUp.getText().length() > 32) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Password can not shorter than 8 characters or greater than 32 characters.");
            alert.showAndWait();
            voidEveryThing();
            return;
        }
        for (int i = 0; i < usernameFieldSignUp.getText().length(); i++) {
            int num = usernameFieldSignUp.getText().charAt(i);
            if (i == 0 && num < 58 && num > 47) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("First character can not be a number.");
                alert.showAndWait();
                voidEveryThing();
                return;
            }
            if (num < 48 || (num > 57 && num < 65) || (num > 90 && num < 97) || num > 122) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Username is only allowed for English letters and numbers.");
                alert.showAndWait();
                voidEveryThing();
                return;
            }

            if (num > 64 && num < 91) {
                int newNum = num + 32;
                char c = (char) newNum;
                usernameFieldSignUp.setText(usernameFieldSignUp.getText().replace(usernameFieldSignUp.getText().charAt(i), c));
            }
        }
        try {
            if (!new File("personalInfo.txt").exists()) {
                FileWriter writer = new FileWriter("personalInfo.txt");
                BufferedWriter writer1 = new BufferedWriter(writer);
                writer1.write(usernameFieldSignUp.getText());
                writer1.write("@");
                writer1.write(passwordFieldSignUp.getText());
                writer1.newLine();
                writer1.close();
                writer.close();
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Confirm");
                alert.setContentText("You have successfully signed up!");
                alert.showAndWait();
                voidEveryThing();
                return;
            }
            FileReader reader = new FileReader("personalInfo.txt");
            BufferedReader reader1 = new BufferedReader(reader);
            String str;
            String[] enter = usernameFieldSignUp.getText().split("@");
            while ((str = reader1.readLine()) != null) {
                String[] info = str.split("@");
                if (info[0].equals(enter[0])) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("You have already signed up.");
                    alert.showAndWait();
                    reader1.close();
                    reader.close();
                    voidEveryThing();
                    return;
                }
            }
            reader1.close();
            reader.close();
            FileWriter writer = new FileWriter("personalInfo.txt", true);
            BufferedWriter writer1 = new BufferedWriter(writer);
            writer1.append(usernameFieldSignUp.getText());
            writer1.append("@");
            writer1.append(passwordFieldSignUp.getText());
            writer1.newLine();
            writer1.close();
            writer.close();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm");
            alert.setContentText("You have successfully signed up!");
            alert.showAndWait();
            voidEveryThing();
        } catch (IOException ioException) {
            System.out.println("Error in opening file!");
            System.exit(0);
        }
    }
    public void voidEveryThing(){
        usernameFieldLogin.setText("");
        usernameFieldSignUp.setText("");
        passwordFieldSignUp.setText("");
        passwordFieldLogin.setText("");
        confirmPasswordFieldSignUp.setText("");
    }
}
