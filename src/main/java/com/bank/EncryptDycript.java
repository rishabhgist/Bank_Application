package com.bank;

import lombok.Data;

@Data
public class EncryptDycript {
    String usernameEncryptDycript(String username, char mode) {
        return null;
    }

    String encrypt(String value) {
        String enCoded = "";
        char[] values = value.toCharArray();
        int[] codedValues = new int[values.length];
        for (int index = 0; index < values.length; index++) {
            enCoded += values[index] + 1 + "%";
        }
        return enCoded;
    }

}
