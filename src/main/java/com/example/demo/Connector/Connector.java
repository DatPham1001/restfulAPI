package com.example.demo.Connector;

import java.sql.*;

public class Connector {
    Connection connection = null;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/data";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1234";
    public  Connection getConnection() {

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
        }
        return connection;
    }
    public ResultSet executeQuery(String sql){
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            return  resultSet;
        } catch (SQLException throwables) {
            System.out.println("Failed execute");
        }finally {

        }
        return null;
    }
//    public String updateQuery(String sql) {
//        try {
//            Statement statement = connection.createStatement();
//            System.out.println("Executing query: " + sql);
//            statement.execute(sql);
//            return "true";
//        } catch (Exception e) {
//            return "false";
//        }
//    }
    public Statement updateQuery(String sql) {
        try {
            Statement statement = connection.createStatement();
            System.out.println("Executing query: " + sql);
            statement.execute(sql);
        } catch (Exception e) {
            System.out.println("Failed execute");
        }
        return null;
    }
//    public boolean close

}
