package com.bank;

import lombok.Data;

@Data
public class UserValidate {
    private String username;
    private String password;

    public UserValidate(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
