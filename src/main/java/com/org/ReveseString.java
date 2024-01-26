package com.org;

import javax.sound.midi.Soundbank;

public class ReveseString {

    public static void main(String[] args) {
        String name = "Dinesh";
        System.out.println("original name is:"+name);
        StringBuilder obj = new StringBuilder(name);
        System.out.println("reverse name using string builder is:"+obj.reverse());

        char[] revese_name = name.toCharArray();
        StringBuilder revese= new StringBuilder();

        for(int i= revese_name.length-1;i>=0;i--)
        {
            revese.append(revese_name[i]);
        }
        System.out.println("revese name using char array is:"+revese);
    }
}
