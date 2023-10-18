package com.company;
import java.util.*;

public class Main {

    public static Course selectedCourse(ArrayList<Course> courses,String courseName){
        for(Course i:courses){
            if(i.getTitle().equals(courseName)){
                return i;
            }
        }
        return null;
    }

    public static Student findStudent(ArrayList<Student> students,String name){
        for(Student i:students){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList<Student>();
        ArrayList<Course> courses=new ArrayList<Course>();
        courses.add(new Course(001,"Java",
                "We teach with realtime projects",3,"Summer2023"));
        courses.add(new Course(002,"Python",
                "We teach with realtime projects",2,"Winter2023"));
        courses.add(new Course(003,"Web Development",
                "We teach with realtime projects",1,"Summer2023"));

        for(Course i:courses){
            i.printCourse();
        }

        Scanner sc=new Scanner(System.in);
	    int opt=5;
        while(opt==5){

            System.out.println("Enter 1 for Enrol into course");
            System.out.println("Enter 2 for Cancelling the enrolled course");
            int num=sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("Enter the name");
                    String name=sc.next();
                    Student student=new Student(name);
                    Course selectedCourse=selectedCourse(courses, student.getTitle());
                    if(selectedCourse!=null && student.isCourseAvailable(students,courses)){
                        students.add(student);
                        System.out.println("Enroll Success");
                        Student f=findStudent(students,student.getName());
                        f.getRegCourses().add(student.getTitle());
                    }else{
                        System.out.println("Sorry there is no availablity for this course! Thank You");
                    }
                    break;
                case 2:
                    System.out.println("Enter the student name");
                    String stName=sc.next();
                    Student selectedStudent=findStudent(students,stName);
                    if(selectedStudent!=null){
                        System.out.println("Enter the couse name you want to unenroll");
                        String courseUnenroll=sc.next();
                        if(selectedStudent.getRegCourses().contains(courseUnenroll)){
                            selectedStudent.getRegCourses().remove(courseUnenroll);
                            Course sel=selectedCourse(courses,courseUnenroll);
                            sel.setCapacity(sel.getCapacity()+1);
                            System.out.println("Course unenrolled successfully");
                        }
                    }
                    else{
                        System.out.println("Sorry The name you is not registered any courses");
                    }
                    break;

                default:
                    System.out.println("press valid num");
                    break;
            }
            System.out.println("Enter 5 to proceed");
            System.out.println("Enter 0 to exit");
            opt= sc.nextInt();
        }

        for(Student student:students){
            if(!student.getRegCourses().isEmpty()){
                System.out.println(student.getName()+"'s registered courses is "+student.getRegCourses());

            }
        }
    }
}
