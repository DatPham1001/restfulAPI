package com.example.demo.Controller;

import com.example.demo.DAO.UserDAO;
import com.example.demo.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    UserDAO userDAO = new UserDAO();
    UserDTO userDTO = new UserDTO();

    @GetMapping("/{id}")
    public UserDTO getUserByID(@PathVariable int id) throws SQLException {
        UserDTO result = userDAO.getUserByID(id);
        return result;
    }


    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        UserDTO result = userDAO.createUser(userDTO);
        return result;
    }
}
