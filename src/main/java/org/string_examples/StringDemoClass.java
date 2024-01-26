package org.string_examples;

public class StringDemoClass {
    public static void main(String[] args) {
        String str1 = "Dinesh";
        String str2 = str1 ;
        String str3 = new String("Dinesh");
        if (str1 == str2)
        {
            System.out.println("true str1==str2");
        }

        if (str1 == str3)
        {
            System.out.println("true str1==str3");
        }
        else {
            System.out.println("true str1!=str3");
        }

        if(str1.equalsIgnoreCase(str3))
        {
            System.out.println("true equals()");
        }
        System.out.println("str2 at start is :"+str2);
        System.out.println("before->Str1 is:"+str1);
        System.out.println("Str1 capital:"+str1.toUpperCase());
        System.out.println("After Str1 is:"+str1);
        str1 = str1.toUpperCase();
        System.out.println("After converting Str1 to upperCase is:"+str1);
        System.out.println("str2 at end is :"+str2);



    }
}
