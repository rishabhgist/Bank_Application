package com.bank;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        System.out.println(login.getUsernamePassword());
        System.out.println(login.validateUser("rishabh", "rishabh@123"));
    }
}