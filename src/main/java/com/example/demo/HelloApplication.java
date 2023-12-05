package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 1000);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // Get the controller associated with the MainScreen.fxml
        HelloController mainController = fxmlLoader.getController();
        mainController.setPrimaryStage(stage);


    }

    public static void main(String[] args) {
        System.out.println("aa");
        launch();
    }
}