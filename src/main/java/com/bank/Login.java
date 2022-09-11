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
    UserValidate userValidate;
    private String username;
    private String password;
    private String role;

    public boolean validateUser(String username, String password) {
        Map<String, String> users = getUsernamePassword();
        for (Map.Entry<String, String> user : users.entrySet()) {
            if (username.equals(user.getKey()) && password.equals(user.getValue())) {
                return true;
            }
        }
        System.err.println("Account not found");
        return false;
    }

    public Map<String, String> getUsernamePassword() {
        Map<String, String> usernamePassword = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            String header = reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] users = line.split(",");
                    usernamePassword.put(users[0].trim(), users[1].trim());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return usernamePassword;
    }
}
