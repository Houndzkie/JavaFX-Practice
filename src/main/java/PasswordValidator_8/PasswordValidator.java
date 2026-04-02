package PasswordValidator_8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PasswordValidator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("passwordvalidator-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 240);
        primaryStage.setTitle("Password Validation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
