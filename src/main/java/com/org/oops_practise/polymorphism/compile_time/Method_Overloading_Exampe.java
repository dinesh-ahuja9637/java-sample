package com.org.oops_practise.polymorphism.compile_time;

public class Method_Overloading_Exampe {

    public void add()
    {
        System.out.println("Hi Add() without an retun");
    }

    public void add(int a, int b)
    {
        System.out.println("Hi Add() with null reurn type but one parameter");
    }

    public void add(int b, String a)
    {
        System.out.println("Hi Add() with null reurn type but one parameter");
    }

    public void add(String b, int a)
    {
        System.out.println("Hi Add() with null reurn type but one parameter");
    }

    public void add(float a)
    {
        System.out.println("Hi Add() with null reurn type but one parameter");
    }

    public void add(double a)
    {
        System.out.println("Hi Add() with null reurn type but one parameter");

    }



    public static void main(String[] args) {
        Method_Overloading_Exampe obj = new Method_Overloading_Exampe();
        obj.add();
    }
}
