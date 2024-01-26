package org.randm.problems;

import java.util.Arrays;

public class ArrayElementCount {
public static void funcA(){

}
    public static void main(String[] args) {
        int[] a = {12,5,12,6,7};
        System.out.println(Arrays.toString(a));
        int[] b = a;
        b [5] = 35;
       Arrays.sort(a);
        //System.out.println(Arrays.sort(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a [0] = 11;
        b [1] = 15;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b));

    }
}
