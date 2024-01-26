package org.string_examples;

public class Reverse_string {
    public static void main(String[] args) {
        String name = "Pranav";
        System.out.println("original string is :" + name);
        System.out.println("a index is:"+name.indexOf("a"));
        System.out.println("abcd"+name.indexOf("Pr"));
        name = "    pranava    ";
        System.out.println("trm:"+name.trim());
        name.concat("ahuja");
        System.out.println("updated name is:"+name);
        if(name.startsWith("Di"))
        {
            System.out.println("Yes");
        }
        StringBuffer obj = new StringBuffer(name);
    }
}
