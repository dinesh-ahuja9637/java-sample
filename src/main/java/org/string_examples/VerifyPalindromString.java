package org.string_examples;

public class VerifyPalindromString {
    public static void main(String[] args) {
        String name1 = "n";
        StringBuilder obj1 = new StringBuilder(name1);
        StringBuilder obj2 = new StringBuilder(name1);
        if(String.valueOf(obj1).equalsIgnoreCase(String.valueOf(obj2))){
            System.out.println("Hi");
        }
        System.out.println(obj1.toString());
        obj1.reverse();
        System.out.println(obj1.toString());
        //boolean b = name1.equalsIgnoreCase(obj1);
        if(name1.equalsIgnoreCase(String.valueOf(obj1)))
        {
            System.out.println(
                    "YES"
            );
        }
        else{
            System.out.println("NO");
        }
    }
}
