package com.example.alco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLconnect {
    void testConnection() {
        String url = "jdbc:postgresql://10.10.104.136:5432/alko_olesya?user=postgres&password=123";
        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Подключено");
        } catch (SQLException e) {
            System.out.println("не удалось подключиться");
            System.out.println(e.getMessage());
        }
    }

    static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://10.10.104.136:5432/alko_olesya?user=postgres&password=123";
        Connection conn = DriverManager.getConnection(url);
        return conn;
    }
}