package org.dinesh;

public final class FinalClassDemo {
    FinalClassDemo()
    {
        System.out.println("Im calling FinalClassDemo constructor");
    }
    public void demo()
    {
        System.out.println("Hi im demo");
    }

    public static void main(String[] args) {
        FinalClassDemo obj = new FinalClassDemo();
        obj.demo();

    }
}
