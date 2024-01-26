package com.org.oops_practise.abstract_demo;

public class AbstractDemoChildClass extends AbstractClassDemo{

    AbstractDemoChildClass()
    {
        System.out.println("Hi im inside the child class constrcutor");
    }
    public void add()
    {
        System.out.println("Hi");
    }

    static void demoFunc()
    {
        System.out.println("Hi imm static method of child");
    }

    @Override
    public void subtract()
    {
        //super.subtract();
        System.out.println("Hello im in subtract() of child class");
    }

    public static void main(String[] args) {

//      AbstractDemoChildClass obj = new AbstractDemoChildClass();
//    obj.add();
//   obj.subtract();
//AbstractDemoChildClass.demoFunc();
//AbstractClassDemo.demoFunc();
    AbstractClassDemo obj1 = new AbstractDemoChildClass();
    obj1.subtract();
    AbstractClassDemo.demoFunc();


    }
}
