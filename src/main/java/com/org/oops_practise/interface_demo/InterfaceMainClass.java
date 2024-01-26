package com.org.oops_practise.interface_demo;

public class InterfaceMainClass implements InterfaceDemo,InterfaceDemo1{

    public static void main(String[] args) {
        InterfaceDemo obj = new  InterfaceMainClass();
        InterfaceDemo.addition();
        obj.add();
    }
    //InterfaceDemo2 obj = new InterfaceDemo2();
    public void add()
    {
        System.out.println("Hi add()");
    }
    public void add1()
    {
        System.out.println("Hi add1()");
    }
}
