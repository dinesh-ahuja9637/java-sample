package org.collection_framework_map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    static{
        System.out.println("hi");
    }

    public static void main(String[] args) {
        System.out.println("Hi main");
        TreeMap<String,Integer> obj = new TreeMap<>();
        obj.put("1",1);
        obj.put("3",2);
       // obj.put(null,3);
        obj.put("0",2);
        System.out.println(obj);
        obj.descendingMap();
        System.out.println(obj);

        for(Map.Entry m : obj.entrySet())
        {
            if(m.getKey() == "1")
            {
                m.setValue("One");
            }
            System.out.println("Key is:"+m.getKey()+" and Value is: "+m.getValue());
        }
    }
}
