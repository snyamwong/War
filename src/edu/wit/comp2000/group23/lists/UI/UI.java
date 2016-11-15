package edu.wit.comp2000.group23.lists.UI;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("ui.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(root != null) {
            Scene scene = new Scene(root, 500, 300);

            primaryStage.setTitle("WAR");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();


        }
    }
}
