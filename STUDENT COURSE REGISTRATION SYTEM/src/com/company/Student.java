package com.company;
import java.util.*;

public class Student {
    private String name;
    private String Title;
    private ArrayList<String> regCourses=new ArrayList<String>();



    Scanner sc=new Scanner(System.in);

    public ArrayList<String> getRegCourses() {
        return regCourses;
    }

    public Student(){

    }

    public Student(String name){
        this.name=name;
        System.out.println("Enter Course name");
        Title= sc.next();
    }
    public String getName() {
        return name;
    }


    public String getTitle() {
        return Title;
    }

    public  ArrayList<String> regdCourses(ArrayList<Student> students, String name){
        for(Student i:students){
            if(i.getName().equals(name)){
                return  i.getRegCourses();
            }
        }
        return new ArrayList<String>();
    }
    int count=0;
    public boolean isCourseAvailable(ArrayList<Student> students,ArrayList<Course> courses){

        int capacity=0;
        for(Course i:courses){
            if(i.getTitle().equals(getTitle())){
                capacity=i.getCapacity();
                i.setCapacity(capacity-1);
            }
        }


        return capacity>0?true:false;
    }



}
