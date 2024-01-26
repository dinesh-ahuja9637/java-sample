package com.org.oops_practise.inheritance;

public class BaseClass {

    int a = 5;
    int b = 5;

    public void funcA()
    {
        System.out.println("Calling funcA func from BaseClass");
    }
    protected void funcB()
    {
        System.out.println("Calling funcB func from BaseClass");
    }

    private void funcC()
    {
        System.out.println("Calling funcC func from BaseClass");
    }
    BaseClass()
    {
        System.out.println("Im inside the constructor of Base_Class");
    }

    public static void main(String[] args) {
        BaseClass baseObj = new BaseClass();
        baseObj.funcC();
    }
}
