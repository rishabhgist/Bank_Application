package com.bank;

import lombok.Data;

@Data
public class UserValidate {
    private String username;
    private String password;

    private String role;

    public UserValidate(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


}
