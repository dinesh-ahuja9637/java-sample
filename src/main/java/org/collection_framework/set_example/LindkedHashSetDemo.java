package org.collection_framework.set_example;

import java.util.LinkedHashSet;

public class LindkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> obj = new LinkedHashSet<String>();
        //obj.add
        obj.add("dinesh");
        obj.add("ahuja");
        obj.add("Dinesh");
        obj.add(null);
        System.out.println(obj);
        obj.remove("dinesh");
        System.out.println(obj);
    }
}
