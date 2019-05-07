package com.restaurant.User_Classes;

public  class User {

    private static String password;

    private static String phone;

    private static String username;

    public void login(){
    
    };

    public void logout() {
    }

    public void viewMainMenu() {
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        User.password = password;
    }

    public void setPhone(String phone) {
        User.phone = phone;
    }

    public void setUsername(String username) {
        User.username = username;
    }
    
}
