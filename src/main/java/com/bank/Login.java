package com.bank;

import lombok.Data;

@Data
public class Login {
    private String username;
    private String password;
    private String role;

    public boolean validateUser(String username, String password) {
        if (username.equals(this.username) && password.equals(this.password)) {
            return true;
        }
        return false;
    }
}
