package com.example.a301.myapplication.Model;

/**
 * Created by 301 on 2017-09-29.
 */

public class Model_Student {

    String studentNum;
    String lecture1;
    String lecture2;
    String lecture3;
    String password;
    String name;

    public Model_Student() {
    }

    public Model_Student(String studentNum, String lecture1, String lecture2, String lecture3,String password, String name) {
        this.studentNum = studentNum;
        this.lecture1 = lecture1;
        this.lecture2 = lecture2;
        this.lecture3 = lecture3;
        this.password = password;
        this.name=name;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public String getLecture1() {
        return lecture1;
    }

    public String getLecture2() {
        return lecture2;
    }

    public String getLecture3() {
        return lecture3;
    }

    public String getPassword() {
        return password;
    }
    public String getName(){return  name;}
}
