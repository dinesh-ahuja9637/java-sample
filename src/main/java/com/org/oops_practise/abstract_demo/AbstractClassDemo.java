package com.org.oops_practise.abstract_demo;

abstract class AbstractClassDemo {

     AbstractClassDemo()
     {
          System.out.println("Hi im inside the constrcutor inside abtract class");
     }

     static void demoFunc()
     {
          System.out.println("Hi imm static method");
     }

     public abstract void add();

     public void subtract()
     {
          System.out.println("Hello im in subtract() of parent class");
     }
}
