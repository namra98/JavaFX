package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnector {

    public static Connection connect() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sayan";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }
}
