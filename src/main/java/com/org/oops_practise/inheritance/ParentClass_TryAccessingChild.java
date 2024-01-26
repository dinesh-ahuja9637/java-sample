package com.org.oops_practise.inheritance;

public class ParentClass_TryAccessingChild {
    public static void main(String[] args) {

        //plain base class object
      //BaseClass baseObj = new BaseClass();
      //baseObj.funcA();
        //baseObj.funcC();

        // pain child class object
       // ChildClass childClassObj = new ChildClass();
        //childClassObj.funcA();

        //now lets create parent class reference pointing to child class object
    BaseClass baseObjAccessingChild = new ChildClass();
      System.out.println("value of a is:"+baseObjAccessingChild.a);
        baseObjAccessingChild.funcA();
    // baseObjAccessingChild.funcA();




////lets create child reference and point it to parent object
        //ChildClass chidObj = new BaseClass();



    }
}
