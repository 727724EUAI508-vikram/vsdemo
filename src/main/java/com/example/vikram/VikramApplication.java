package com.example.vikram;

import java.sql.Connection; // Corrected import
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VikramApplication {

    public static void main(String[] args) {
        SpringApplication.run(VikramApplication.class, args);
        System.out.println("Welcome");
        connection();
    }

    public static void connection() {
        String url = "jdbc:mysql://localhost:3306/vsdemopro";
        String user = "root";
        String pass = "root";

        try (Connection con = DriverManager.getConnection(url, user, pass)) {
            if (con != null) {
                System.out.print("Connected Successfully to vsdemo");
            }
        } catch (SQLException e) {
            System.out.print("Failed to connect vsdemo: " + e.getMessage());
        }
    }
}