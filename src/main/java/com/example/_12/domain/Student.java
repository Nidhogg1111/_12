package com.example._12.domain;

public class Student {
    public int num ;
    public String name;
    public String sex ;
    public int age ;

    public String id;

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student(int num, String name, String sex, int age, String id) {
        this.num = num;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
    }

    public Student() {
    }
}
