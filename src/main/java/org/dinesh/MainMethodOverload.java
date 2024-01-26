package org.dinesh;

public class MainMethodOverload {
    public static void main(String[] args) {
        System.out.println("Main method with String()");
        MainMethodOverload.main(3);
    }

    public static void main(int args) {
        System.out.println("Hi");
    }


}
