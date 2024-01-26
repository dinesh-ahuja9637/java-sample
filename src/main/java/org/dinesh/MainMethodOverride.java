package org.dinesh;

import java.util.*;

public class MainMethodOverride extends MainMethodOverload{

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.set(0,11);
        arr.add(0,12);
        System.out.println(arr);




    }
}
