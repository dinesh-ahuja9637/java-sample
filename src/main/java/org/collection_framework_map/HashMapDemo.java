package org.collection_framework_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap<Integer,String> obj = new HashMap<>();
        HashMap<Object,Object> obj1 = new HashMap<>();
        obj.put(0,"Dinesh");
        System.out.println("first:"+obj);
        String s1 = obj.getOrDefault(1,"Indu");

        System.out.println(
               "s1 :"+s1
        );
        System.out.println("After update"+obj);
        obj1.put(1,1);
        System.out.println(obj1);
        //obj.remove(0,"Dinesh");
        System.out.println(obj);
        obj.replace(0,"Dinesh","Pranav");
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());
        System.out.println("value with indu:"+obj.containsValue("INDU"));
        obj.putIfAbsent(0,"1")
                ;
        System.out.println(obj);

//        Set s = obj.keySet();
//        System.out.println(s);
//        System.out.println("Vaues:"+obj.values());
//
//        Set entries = obj.entrySet();
//        System.out.println("Entries:"+entries);

for(Map.Entry i:obj.entrySet())
        {
            System.out.println("Key:"+i.getKey()+" "+"Value is:"+i.getValue());
        }
    }
}
