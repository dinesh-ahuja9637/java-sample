package com.org;

public class singletonClassDemo {

    private static singletonClassDemo obj = new singletonClassDemo();

    public static singletonClassDemo getInstance()
    {
        return obj;
    }

    public static void main(String[] args) {
        singletonClassDemo.getInstance();
        System.out.println("Hi");

    }

}
