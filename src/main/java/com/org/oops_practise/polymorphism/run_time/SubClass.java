package com.org.oops_practise.polymorphism.run_time;

public class SubClass extends BaseClass_MethodOverriding {




    public void add()
    {
        super.add();
        System.out.println("Hi!!! im calling add() function from sub class");
    }

    public static void demoFunc()
    {
        System.out.println("Im inside the static method demoFunc() in the Sub Class");
    }

    public static void main(String[] args) {
     SubClass obj1 = new SubClass();
     obj1.add();
//       SubClass.demoFunc();

       //SubClass obj3;
       //SubClass.demoFunc();
       //BaseClass_MethodOverriding.demoFunc();

//       BaseClass_MethodOverriding obj = new SubClass();
//       obj.add();
//        BaseClass_MethodOverriding.demoFunc();
    }
}
