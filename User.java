package com.elevatelabs.libmanagementsys;

public class User {
    int userId;
    String name;

    public User( int userId, String name){
        this.userId = userId;
        this.name = name;
    }
    public void displayUser(){
        System.out.println("User id: " + userId + "Name: " + name);

    }
}
