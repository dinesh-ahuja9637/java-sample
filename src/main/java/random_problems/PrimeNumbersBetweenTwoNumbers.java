package random_problems;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {

    public static void printPrimeNumber(int count)
    {
        boolean flag = true;

        for(int i =2;i<count;i++)
        {
            if(count%i==0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            System.out.print(count+ " ");
        }


    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number till which you want to print prime number");
        int a = obj.nextInt();
        System.out.println("List of prime number is:");
        for(int i=2;i<=a;i++)
        {
            PrimeNumbersBetweenTwoNumbers.printPrimeNumber(i);
        }

    }
}
