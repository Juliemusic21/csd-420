package com.example.demo;/*
 * Julie Sakai
 * CSD 420
 * Module 9 Programming Assignment
 * 2/22/25
 */

import java.sql.*;

public class CreateTable {
    Connection con;
    Statement stmt;

    public CreateTable() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/databasedb?";
            con = DriverManager.getConnection(url + "user=student1&password=pass");
            stmt = con.createStatement();

            // Drop table if it exists
            try {
                stmt.executeUpdate("DROP TABLE IF EXISTS address1");
                System.out.println("Table addressdb Dropped (if it existed)");
            } catch (SQLException e) {
                System.out.println("Error dropping table: " + e.getMessage());
            }

            // Create table
            try {
                stmt.executeUpdate("CREATE TABLE addressdb(ID int PRIMARY KEY, LASTNAME varchar(40), FIRSTNAME varchar(40), STREET varchar(40), CITY varchar(40), STATE varchar(40), ZIP varchar(40))");
                System.out.println("Table addressdb Created");
            } catch (SQLException e) {
                System.out.println("Table addressdb Creation failed: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            System.exit(0);
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
                System.out.println("Database connections closed");
            } catch (SQLException e) {
                System.out.println("Connection close failed: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new CreateTable();
    }
}
