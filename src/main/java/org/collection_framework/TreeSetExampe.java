package org.collection_framework;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetExampe {

    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<Integer>();
        obj.add(5);
        obj.add(1);
        obj.add(2);
        //obj.add(null);

        ArrayList<Integer> obj1 = new ArrayList<>(obj);
        System.out.println(".get(2);:"+obj1.get(2));
       // System.out.println(".get(2);:"+obj1.get(3));
        System.out.println(obj);
        //obj.remove(5);
        System.out.println(obj);
        obj.descendingSet();
        System.out.println(obj);
        System.out.println("pollFirst:"+obj.pollFirst());
        System.out.println("pollLast:"+obj.pollLast());
        System.out.println("higher:"+obj.higher(1));
        Object o = obj.clone();
        System.out.println(o);

    }
}
