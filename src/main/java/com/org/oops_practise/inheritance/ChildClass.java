package com.org.oops_practise.inheritance;

public class ChildClass extends BaseClass{

    int a = 6;
    int b = 6;
    ChildClass()
    {
        ///super();
        //System.out.println(super.a);
        System.out.println("Im inside the Child class constructor");
    }

    public void childClaassFunc()
    {
        System.out.println("Im just a child class func");
    }

    public void funcA()
    {
        //super.funcA();
        //super.funcB();
        System.out.println("Calling funcA func from ChildClass");
    }
    ChildClass(ChildClass obj)
    {
        this.a=obj.a;
        this.b=obj.b;
    }

    public static void main(String[] args) {
       // ChildClass childObj = new ChildClass();
       // childObj.funcA();

        //ChildClass childObj = new BaseClass();

        //BaseClass obj = new ChildClass();
       // System.out.println("a:"+obj.a);
       // System.out.println("b:"+obj.b);

//        System.out.println("a:"+childObj.a);
//        System.out.println("b:"+childObj.b);
//        ChildClass obj2 = new ChildClass(childObj);
//        System.out.println("a:"+obj2.a);
//        System.out.println("b:"+obj2.b);
//        childObj.a = 8;
//        System.out.println("latest values");
//        System.out.println("a:"+childObj.a);
//        System.out.println("a:"+obj2.a);


    }
}
