package com.company;
import java.util.*;

public class Main {

    public static float calPercentage(int total,int numStud){
        float avg=(total/numStud);
        return avg;
    }
    public static String grade(int avg){
        String g=null;
        switch (avg/10){
            case 10:
                g="O";
                break;
            case 9:
                g="A";
                break;
            case 8:
                g="B";
                break;
            case 7:
                g="C";
                break;
            case 6:
                g="D";
                break;
            case 5:
                g="E";
                break;
            default:
                g="F";
                break;
        }
        return g;
    }

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the Student");
        String name=sc.nextLine();
        System.out.println("Enter the number of subject");
        int numberSub=sc.nextInt();
        int totalMarks=0;
        for (int i=0;i<numberSub;i++){
            System.out.println("Enter the Mark");
            int mark= sc.nextInt();
            totalMarks+=mark;
        }
        int Avg=totalMarks/numberSub;
        System.out.println("Name: "+name);
        System.out.println("Total marks: "+totalMarks);
        System.out.println("Average: "+calPercentage(totalMarks,numberSub)+"%R");
        System.out.println("Grade: "+grade(Avg));
    }
}
