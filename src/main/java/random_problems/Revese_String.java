package random_problems;

import java.util.Scanner;

public class Revese_String {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your name");
        //String name = "Dinesh";
        String name = obj.next();
        String name1=" ";
        System.out.println("is empty:"+name1.isEmpty());
        System.out.println("is blank:"+name1.isBlank());
        System.out.println("name entered by user is :"+name);
        StringBuilder reverseName = new StringBuilder(name);
        reverseName.reverse();
        System.out.println("Original name is :"+name);
        System.out.println("Revese name is:"+reverseName);

        if(name.equalsIgnoreCase(reverseName.toString()))
        {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }

    }
}
