package org.collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListCollectionDemo {
    public static void main(String[] args) {
        LinkedList<String>  obj= new LinkedList<String>();
        obj.add("Dinesh");
        obj.add("Pranav");
        obj.add("Indu");

        System.out.println(obj);


        System.out.println(obj.getFirst());


    }

}
