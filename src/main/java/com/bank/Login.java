package com.bank;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Login {
    private String username;
    private String password;
    private String role;

    public boolean validateUser(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public List<String> getUsernamePassword() {
        List<String> usernamePassword = new ArrayList<>();

    }
}
