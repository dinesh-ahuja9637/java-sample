package org.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//code for creating both type safe collection and untype safe collection
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add(0,"Dinesh");
        obj.add(1,"Manish");

        System.out.println(obj);
        String a = obj.get(0);
        System.out.println(a);
        System.out.println();



    }
}
