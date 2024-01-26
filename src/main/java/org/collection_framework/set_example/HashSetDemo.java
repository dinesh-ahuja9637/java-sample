package org.collection_framework.set_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {
    static ArrayList<Integer> arr;
    static HashSet<Integer> bj;
    public static void create_list()
    {
        arr = new ArrayList<>();
        arr.add(11);
        arr.add(10);
        arr.add(15);
        arr.add(null);
        arr.add(null);
        arr.add(null);
        arr.add(5);
        arr.add(8);
        arr.add(8);
        arr.add(11);
        System.out.println("Array List Created with duplicates:"+arr);
    }

    public static void unique_list(ArrayList<Integer> e)
    {
         bj = new HashSet<Integer>(e);
        System.out.println("set1:"+bj);
        System.out.println("set2:"+bj);
        System.out.println("set3:"+bj);

        arr = new ArrayList<Integer>(bj);

        //ArrayList<Integer> bj1 = new ArrayList<Integer>(bj);
        System.out.println("ArrayList with unique list items is:"+arr);

    }

    public static void main(String[] args) {
        HashSetDemo.create_list();
        HashSetDemo.unique_list(arr);
        System.out.println("Array List after all operations is:"+arr);
        System.out.println("Set before:"+bj);
        Iterator obj = bj.iterator();

        while(obj.hasNext())
        {
            System.out.println(obj.next());
        }

        System.out.println("Set before:"+bj);
        System.out.println("Set before:"+bj);
        System.out.println("Set before:"+bj);
        bj.remove(55);
        System.out.println("Set before:"+bj);
    }


}
