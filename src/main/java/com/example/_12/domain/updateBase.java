package com.example._12.domain;

public class updateBase {
    private String name;
    private String sex ;
    private String age ;

    private String num;
    private String status ;

    @Override
    public String toString() {
        return "updateBase{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", num='" + num + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public updateBase(String name, String sex, String age, String num, String status) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.num = num;
        this.status = status;
    }

    public updateBase() {
    }
}
