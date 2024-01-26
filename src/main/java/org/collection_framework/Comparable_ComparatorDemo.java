package org.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Comparable_ComparatorDemo implements Comparable<Comparable_ComparatorDemo> {
    @Override
    public int compareTo(Comparable_ComparatorDemo o) {

        return this.roll_no-o.roll_no;
    }
    Comparable_ComparatorDemo(int roll_no, String name,int class_no)
    {
        this.roll_no = roll_no;
        this.name = name;
        this.class_no=class_no;
    }
    int roll_no;
    String name;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    @Override
    public String toString() {
        return "Comparable_ComparatorDemo{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", class_no=" + class_no +
                '}';
    }

    int class_no;

    public static void main(String[] args) {
        ArrayList<Comparable_ComparatorDemo> obj = new ArrayList<>();

        obj.add(new Comparable_ComparatorDemo(1,"Indu",11));
        obj.add(new Comparable_ComparatorDemo(5,"Dinesh",9));
        obj.add(new Comparable_ComparatorDemo(0,"Pranav",0));
        System.out.println(obj);
        Collections.sort(obj);
        Collections.reverse(obj);
        System.out.println(obj);
       // Iterable obj1=obj.iter
       // Iterator obj1 = obj.iterator();
        //while(obj1.hasNext())
       // {
            //System.out.println(obj1.next());
       // }

        //Collections.sort(obj);
        //comparable

    }


}
