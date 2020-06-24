package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    public int id;
    public String name;
    public String password;
    public  String status;

    public UserDTO(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserDTO(int id) {

    }
}
