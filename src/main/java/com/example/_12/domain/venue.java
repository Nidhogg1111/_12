package com.example._12.domain;

public class venue {
    public String id;
    public String coach;
    public String time;



    




    public String introducetion;

    public String num;

    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return "venue{" +
                "id='" + id + '\'' +
                ", coach='" + coach + '\'' +
                ", time='" + time + '\'' +
                ", introducetion='" + introducetion + '\'' +
                ", num='" + num + '\'' +
                '}';
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

    public String getIntroducetion() {
        return introducetion;
    }

    public void setIntroducetion(String introducetion) {
        this.introducetion = introducetion;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public venue(String id, String coach, String time, String introducetion, String num) {
        this.id = id;
        this.coach = coach;
        this.time = time;
        this.introducetion = introducetion;
        this.num = num;
    }

    public venue() {
    }
}
