package random_problems;

import java.util.Scanner;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in)
                ;
        System.out.println("Enter the number which you want to check if it's prime number or not");
        int numb = obj.nextInt();
        //int m = numb/2;
        boolean flag = true;
        System.out.println("Number entered by you is:"+numb);
        for(int i=2;i<numb;i++)
        {
            if(numb%i==0)
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Number entered by you "+numb+" is a prime number");
        }
        else {
            System.out.println("Number entered by you "+numb+" is not a prime number");
        }

    }
}
