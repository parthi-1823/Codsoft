package com.company;

public class Course {
    private  int courseCode;
    private String title;
    private String description;
    private int capacity;
    private String schedule;

    public Course(int courseCode, String title, String description, int capacity, String schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTitle() {
        return title;
    }

    public void printCourse(){
        System.out.println("Code: "+courseCode+"Title: "+getTitle()+"Description: "+description+"Capacity: "+getCapacity()+"Schedule: "+schedule);
    }
}
