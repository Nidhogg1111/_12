package com.example._12.domain;

public class logindata
{
    public String username;
    public String password;
    public String type;

    public String num;

    @Override
    public String toString() {
        return "logindata{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", num='" + num + '\'' +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public logindata(String username, String password, String type, String num) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.num = num;
    }

    public logindata() {
    }
}
