package com.org.oops_practise.classes_and_object;

import com.org.packg1.Demo_Class;

//import static com.org.packg1.Demo_Class.message;

public class Class_Example extends Demo_Class {
    String name;
    Class_Example(String name)
    {
        this.name=name;
        System.out.println("Hello "+this.name);
    }
    public static void main(String[] args) {
        final int a =3;
        System.out.println("value of a is:"+a);
        final Class_Example obj = new Class_Example("Dinesh");
        obj.name="Yogesh";
        //message();

    }
}
