package com.example.demo;

import com.example.demo.Connector.Connector;
import com.example.demo.DAO.UserDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/data";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "1234";

    public static void main(String[] args) throws SQLException {
//        Connector connector = new Connector();
//        Connection connection = connector.getConnection();
//        String sql ="SELECT * FROM user";
//        ResultSet resultSet = connector.executeQuery(sql);
//        while (resultSet.next()){
//            int id = resultSet.getInt("id");
//            System.out.println(id);
//        }
        UserDAO userDAO = new UserDAO();
//        userDAO.getUserInfo();

}
}