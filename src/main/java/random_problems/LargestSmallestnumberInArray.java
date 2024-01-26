package random_problems;

import java.util.Arrays;

public class LargestSmallestnumberInArray {
    public static void main(String[] args) {
        int[] a = {11,12,1,5,99};
        int small =a[0],large=a[0];
        System.out.println("Array is:"+ Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<=small)
            {
                small = a[i];
            }
            else  {
                large = a[i];
            }
        }
        System.out.println("largest number is array is:"+large);
        System.out.println("smallest number is array is:"+small);
    }
}
