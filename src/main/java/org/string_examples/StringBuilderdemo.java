package org.string_examples;

import java.util.Arrays;

public class StringBuilderdemo {
    public static void main(String[] args) {
        StringBuilder obj = new StringBuilder("Dinesh ahuja");

        String obj11= "Dinesh Ahuja my name is" + "/t"+
                "helo Dinesh";
        //System.out.println(obj11);


//        System.out.println(obj11.replaceFirst("Dinesh","Pranav"));
//        System.out.println(obj11.replace("Dinesh","Pranav"));


obj.append(1);
//obj.d
obj.insert(0,2);

//        System.out.println(obj.charAt(0));
//        System.out.println(obj);
//        obj.reverse();
//        System.out.println(obj);

        StringBuilder s11 = new StringBuilder("Dinesh");
        StringBuilder s12 = new StringBuilder("dinesh");


                if(s11.toString().equalsIgnoreCase(s12.toString()))
                {
                    System.out.println("s11 & s12 are Equals");
                }
                else {
                    System.out.println("s11 & s12 are not equals");
                }

                String s13 = "Dinesh";
                String s14 = new String("Dinesh");
        //String s14 = "Dinesh";
        System.out.println(s13.contentEquals("Din"));

                if(s13==s14)
                {
                    System.out.println("s13==s14");
                }
                else {
                    System.out.println("s13!=s14");
                }

                if(s13.compareToIgnoreCase(s14)==0)
                {
                    System.out.println("s13.compareToIgnoreCase ==s14");
                }

                if(s13.equals(s14))
                {
                    System.out.println("equals s13==s14");
                }


    }

}
