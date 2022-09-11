package com.bank;

import lombok.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public class Login {
    private String username;
    private String password;
    private String role;

    private final String FILE_PATH = "src/main/resources/userdata.csv";

    public boolean validateUser(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public List<String> getUsernamePassword() {
        List<String> usernamePassword = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return usernamePassword;
    }
}
