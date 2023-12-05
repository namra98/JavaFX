package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
}