package org.collection_framework_map;

import java.util.Hashtable;

public class HashTabledemo {
    public static void main(String[] args) {
        Hashtable<String,Integer> obj = new Hashtable<>();
        obj.put("1",1);
        obj.put("1",2);
        obj.put("2",2);
        obj.put("3",3);

        System.out.println(obj);

    }
}
