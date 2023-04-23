package com.example._12.domain;

public class Record {
    public String id;
    public String coach;
    public String time;
    public String xuehao;
    public String num;

    public Record(String id, String coach, String time, String xuehao, String num) {
        this.id = id;
        this.coach = coach;
        this.time = time;
        this.xuehao = xuehao;
        this.num = num;
    }

    public Record() {
    }

    @Override
    public String toString() {
        return "Record{" +
                "id='" + id + '\'' +
                ", coach='" + coach + '\'' +
                ", time='" + time + '\'' +
                ", xuehao='" + xuehao + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
