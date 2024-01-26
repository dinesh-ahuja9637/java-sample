package com.org.sample;

import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sample {

    static int return_int(int num){
        return num*num;
    }

    public float return_int(float num){
        return num/num;
    }

    public int calculate_sum(int num)
    {
        int sum=0;
        int initial = 0;
        while (num>0)
        {
            return num + calculate_sum(num-1);
                    //calculate_sum(num);
        }
        return sum;
    }
    static  int a = 10;
    public static void main(String[] args) {
        System.out.println("Please enter the length of the int array you want to create");
        Scanner in = new Scanner(System.in);
        int length_arr = in.nextInt();
        int[] arr = new int[length_arr];
        for(int i = 0;i<length_arr;i++)
        {
            System.out.println("Please enter element at "+i+" position which is to be inserted in array, please enter int only");
            arr[i]=in.nextInt();
        }
        System.out.println("Array inputted by you is----->>>");
        System.out.println(Arrays.toString(arr));


    }
}
