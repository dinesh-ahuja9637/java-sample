package org.collection_framework_map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> obj = new LinkedHashMap<>();
        obj.put(1,"Dinesh");
        System.out.println(obj);
        obj.put(null,"Pranav");
        obj.put(null,"Indu");
        System.out.println(obj);

    }
}
