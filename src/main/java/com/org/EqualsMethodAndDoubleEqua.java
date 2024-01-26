package com.org;

public class EqualsMethodAndDoubleEqua {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a++;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        Integer c = 100;
        Integer d = c;
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        c++;
        System.out.println("c:"+c);
        System.out.println("d:"+d);

        String s1 = "Dinesh";
        String s2 = s1;
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s1);
        s1 = s1 + "ahuja";
        System.out.println();
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s1);

        if(c==d)
        {
            System.out.println("c==d");
        }

        if(a==b)
        {
            System.out.println("a==b");
        }
        if(c.equals(d))
        {
            System.out.println("c.equals(d)");
        }
    }
}
