package random_problems;

import java.util.Scanner;

public class FibonanciSeriesDemo {
    static int n1 = 1, n2 = 1, sum = 0;
    public static void fibo(int count)
    {

        if(count>0){

            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2= sum;
            fibo(count-1);}
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number till you want to generate fibinanci series:");
        int a = obj.nextInt();//3
        System.out.print("0 1");
        FibonanciSeriesDemo.fibo(a-2);
//        int num1=0,num2=1,sum;
//
//
//            System.out.print(num1);
//            System.out.print(" ");
//            System.out.print(num2);
//
//
//
//            for (int i = 2; i < a; i++) {
//                sum  = num1 + num2;
//                System.out.print(" "+sum);
//                num1 = num2;
//                num2 = sum;
//
//            }


    }
}
