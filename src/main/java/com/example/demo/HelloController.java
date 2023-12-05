package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Connection;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField naam;

    private Stage primaryStage;

    @FXML
    protected void onHelloButtonClick() {
        try (Connection connection = MySQLConnector.connect()) {
            String query = "SELECT * FROM supersayan";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        // Process each row of the result set
                        String column1 = resultSet.getString("name");
                        int column2 = resultSet.getInt("rollno");
                        // ... (repeat for each column)
                        System.out.println(column1);
                        System.out.println(column2);
                        welcomeText.setText(column1 + column2);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClickH3() {
        welcomeText.setText("Welcome " + naam.getText());
    }

    @FXML
    void ongotoNextPage(ActionEvent event) {
        try {
            Parent nextScreen = FXMLLoader.load(getClass().getResource("hello-view-2.fxml"));
            primaryStage.getScene().setRoot(nextScreen);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}