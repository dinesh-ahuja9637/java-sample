package org.collection_framework;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector_CollectionDemo {

    public static void main(String[] args) {
        List obj = new Vector();
        System.out.println("true/false:"+obj.contains(1));
        obj.add("dinesh");
        obj.add(1);
        System.out.println("true/false:"+obj.contains(1));
        System.out.println(obj);
        Iterator bj = obj.iterator();
        while(bj.hasNext())
        {
            System.out.println(bj.next());
        }
    }
}
