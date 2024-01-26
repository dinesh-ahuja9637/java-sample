package org.string_examples;

import java.util.Arrays;

public class CountVowelsDemo {
    public static void main(String[] args) {

  String name = "My name is Dinesh Ahuja";
 String[] splitStringDemo= name.split(" ");
        System.out.println("spit:"+ Arrays.toString(splitStringDemo));
        System.out.println("original strng is :"+name);
        StringBuilder revese_string =new StringBuilder();
        for(int i =splitStringDemo.length-1;i>=0;i--)
        {
            revese_string.append(splitStringDemo[i]+" ");
        }
        revese_string.insert(2,"m");
        System.out.println("reverse string is:"+revese_string.toString());
        revese_string.delete(0,2);
        System.out.println("reverse string is:"+revese_string.toString());
        System.out.println("revese_string.length():"+revese_string.length());
        System.out.println("reverse string is:"+revese_string.toString());
        StringBuilder  obj = new StringBuilder(Arrays.toString(splitStringDemo));
        System.out.println(obj.reverse());

        System.out.println('j'+'a'+'v'+'a');
        System.out.println("j"+"a"+"v"+"a");
  String vowls ="aou";
        System.out.println(name);
        System.out.println(name.strip());
        System.out.println(name);
  String newStr = name.substring(0,3);
        System.out.println(newStr);
  char[] nameArray = name.toCharArray();
  char[] vowelsArray = vowls.toCharArray();
  int vowels = 0;
  for(int i=0;i<nameArray.length;i++)
  {
      for(int j=0;j<vowelsArray.length;j++)
      {
          if(nameArray[i] == vowelsArray[j])
          {
              vowels++;
          }
      }
  }
        System.out.println("No of vowels in string:"+name+" are:"+vowels);
  if(name.contains("i"))
  {
      System.out.println("Yes string contains vowles");
  }


    }
}
