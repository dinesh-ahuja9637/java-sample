package com.org.sample;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[0]);
        String[] s1 = new String[5];
        System.out.println(s1[0]);
        long[] l1 = new long[5];
        System.out.println(l1[0]);
        float[] f1 = new float[5];
        System.out.println("f1"+f1[0]);
        double[] d1 = new double[5];
        System.out.println("d1"+d1[0]);
        System.out.println(Arrays.toString(d1));

    }
}
