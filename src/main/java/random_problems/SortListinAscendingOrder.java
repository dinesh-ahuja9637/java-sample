package random_problems;

import java.util.ArrayList;
import java.util.Arrays;

public class SortListinAscendingOrder
{
    public static void main(String[] args) {
        int[] array = new int[]{12,0,11,-15,1,0};
        int temp=0;
        System.out.println("array before sorting in ascending order is:"+ Arrays.toString(array));
        for( int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
            System.out.println("array after "+i+" iteration is:->"+ Arrays.toString(array));
        }
        System.out.println("array after sorting in ascending order is:"+ Arrays.toString(array));
    }
}
