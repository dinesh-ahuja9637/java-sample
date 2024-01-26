package random_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayAndDigitsOfNumber {
    public static void main(String[] args) {
        int[] a1 = {1,11,12,15};
        int sum=0;
        for(int i=0;i<a1.length;i++)
        {
            sum = sum + a1[i];
        }
        System.out.println("Array is:"+ Arrays.toString(a1));
        System.out.println("Sum of above array is:"+sum);
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a long number for which you want sum of all digits eg: sum of numb 01234 is 10");
        long numb = obj.nextLong();

        int sumLong =0;
        while(numb>0)
        {
            sumLong = sumLong + (int)(numb%10);
            numb = numb/10;
        }
        System.out.println("Sum of the above number "+numb+ " is:"+sumLong);
    }
}
