package com.example.demo.DAO;

import com.example.demo.Connector.Connector;
import com.example.demo.DTO.UserDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    Connector connector = new Connector();
    Connection connection = connector.getConnection();

    public UserDTO getUserByID(int id) throws SQLException {

        String sql = "SELECT * From user Where id =" + id;
        ResultSet resultSet = connector.executeQuery(sql);
        UserDTO getUserByID = new UserDTO();
        while (resultSet.next()) {
//            getUserByID.add(resultSet.getInt("id"));
//            getUserByID.add(resultSet.getString("password"));
//            getUserByID.add(resultSet.getString("name"));
//            getUserByID.add(new UserDTO(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("password")));
            getUserByID.setId(id);
            getUserByID.setName(resultSet.getString("name"));
            getUserByID.setPassword(resultSet.getString("password"));
        }
        return getUserByID;
    }
    public UserDTO createUser(UserDTO userDTO){
        int id = userDTO.getId();
        String name = userDTO.getName();
        String password = userDTO.getPassword();
        String sql = "INSERT INTO `data`.`user` (`id`, `name`, `password`) VALUES ('"+id+"', '"+name+"', '"+password+"');";
        Statement statement = connector.updateQuery(sql);
        userDTO.setStatus("Created Successfully");
        return userDTO;
    }
}
