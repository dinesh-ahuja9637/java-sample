package com.org.access_modifier_using_packages.private_modifier;

public class classB extends PrivateClassDemo{

    public static void main(String[] args) {
        classB obj = new classB();

        System.out.println("value of a is:"+obj.a);
    }
}
