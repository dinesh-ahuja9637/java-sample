package com.org.oops_practise.classes_and_object;

public class Student {
    int roll_no;
    String name;
    int std;
    static String school_name="HOLY FAMILY SCHOOL";

    static{
        System.out.println("Im inside the static block");
    }

    Student()
    {
        System.out.println("Default constructor--->I'm inside the school and below are my details:");
    }
    Student(int roll_no, String name, int std)
    {
        System.out.println("Parameterized Constructor->I'm inside the school and below are my details:");
        this.roll_no=roll_no;
        this.name=name;
        this.std=std;
    }



     public static void main(String[] args) {
        Student rahul = new Student(2,"Rahul Ahuja",5);
        System.out.println(Student.school_name);
        rahul.school_name = "HOLY FAMILY MODIFIED";
        System.out.println(Student.school_name);
        System.out.println(rahul.roll_no);
        System.out.println(rahul.name);
        System.out.println(rahul.std);
        Student manish = rahul;
         System.out.println(manish.roll_no);
         System.out.println(manish.name);
         System.out.println(manish.std);
         System.out.println("changing rahul's name to full name");
         rahul.name = "Rahul Ahuja";
         System.out.println("Manish's updated name is:"+manish.name);

        Student mukesh = new Student(1,"Mukesh",5);
        System.out.println(Student.school_name);
        System.out.println(mukesh.roll_no);
        System.out.println(mukesh.name);
        System.out.println(mukesh.std);
    }
}
