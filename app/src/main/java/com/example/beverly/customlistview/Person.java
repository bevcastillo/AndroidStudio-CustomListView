package com.example.beverly.customlistview;

public class Person {

    private int img;
    private String name, course;

    public Person(int img, String name, String course) {
        super();
        this.img = img;
        this.name = name;
        this.course = course;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
