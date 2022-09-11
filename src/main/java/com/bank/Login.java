package com.bank;

import lombok.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Data
public class Login {
    private final String FILE_PATH = "src/main/resources/userdata.csv";
    private String username;
    private String password;
    private String role;

    public boolean validateUser(String username, String password) {
        return username.equals(this.username) && password.equals(this.password);
    }

    public Map<String, String> getUsernamePassword() {
        Map<String, String> usernamePassword = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String header = reader.readLine();
            String line;
            String[] userPass = new String[1];
            int count = 0;
            while ((line = reader.readLine()) != null) {
                userPass = line.split(",");
            }
            usernamePassword.put(userPass[0], userPass[1]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return usernamePassword;
    }
}
