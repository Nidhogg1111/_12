package com.example._12.domain;

public class reg {
    public String pass ;
    public String check;
    public String age  ;
    public String username;
    public String sex  ;
    public String name ;
    public String num  ;

    public String radio;
    public reg() {
    }

    @Override
    public String toString() {
        return "reg{" +
                "pass='" + pass + '\'' +
                ", check='" + check + '\'' +
                ", age='" + age + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", num='" + num + '\'' +
                ", radio='" + radio + '\'' +
                '}';
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public reg(String pass, String check, String age, String username, String sex, String name, String num, String radio) {
        this.pass = pass;
        this.check = check;
        this.age = age;
        this.username = username;
        this.sex = sex;
        this.name = name;
        this.num = num;
        this.radio = radio;
    }
}
