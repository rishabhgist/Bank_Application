package com.bank;

public class NoUserFoundException extends Exception {
    public NoUserFoundException() throws Exception {
        throw new Exception("Account not found");
    }
}
