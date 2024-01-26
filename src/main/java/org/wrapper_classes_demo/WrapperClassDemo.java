package org.wrapper_classes_demo;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a:"+(a+a));
        Integer bc = 11;
        System.out.println("bc:"+bc);
        int ba = bc.intValue();
        System.out.println("ba:"+ba);
        Integer b = Integer.valueOf(a);
        System.out.println("b:"+b+b);
        Integer a1 = 11;
        System.out.println(a1.toString());


    }
}
