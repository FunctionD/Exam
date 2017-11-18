package com.lanqiao.exam.vo;

public class Courses {
    private Integer id;
    private String course;

    public Courses() {
    }

    public Courses(Integer id, String course) {
        this.id = id;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", course='" + course + '\'' +
                '}';
    }

}
