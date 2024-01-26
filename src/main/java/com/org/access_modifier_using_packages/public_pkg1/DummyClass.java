package com.org.access_modifier_using_packages.public_pkg1;
import com.org.access_modifier_using_packages.private_modifier.classB;

public class DummyClass {
    public static void main(String[] args) {

        DummyClass obj = new DummyClass();
        System.out.println("Hi");
        classB obj1 = new classB();
        System.out.println();

    }
}
