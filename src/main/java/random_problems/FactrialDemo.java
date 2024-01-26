package random_problems;

import java.util.Scanner;

public class FactrialDemo {

    public static long factorialFind(int n)
    {
        if(n>=1)
        {
            return n * FactrialDemo.factorialFind(n-1);

        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Eneter the number for which you want to find factorial of:");
        int numb = obj.nextInt();
        System.out.println("Number entered by you is:"+numb);
        System.out.println("factorial of "+numb+" is:"+FactrialDemo.factorialFind(numb));
    }
}
