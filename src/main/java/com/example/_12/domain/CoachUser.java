package com.example._12.domain;

public class CoachUser {
    String username ;
    String password ;

    @Override
    public String toString() {
        return "CoachUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoachUser(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public CoachUser() {
    }

    String name     ;
}