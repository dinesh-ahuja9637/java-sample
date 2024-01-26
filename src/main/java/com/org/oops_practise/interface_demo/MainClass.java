package com.org.oops_practise.interface_demo;

public class MainClass implements InterfaceDemo{

    @Override
    public void add() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println("Hello main()");
        MainClass obj = new MainClass();
        obj.add();
    }
}
