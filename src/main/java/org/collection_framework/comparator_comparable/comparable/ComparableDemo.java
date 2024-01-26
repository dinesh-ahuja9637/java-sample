package org.collection_framework.comparator_comparable.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo implements Comparable<ComparableDemo> {
    @Override
    public int compareTo(ComparableDemo o) {

        return this.roll_no-o.roll_no;
    }
    ComparableDemo(int roll_no, String name, int class_no)
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
        ArrayList<ComparableDemo> obj = new ArrayList<>();

        obj.add(new ComparableDemo(1,"Indu",11));
        obj.add(new ComparableDemo(5,"Dinesh",9));
        obj.add(new ComparableDemo(0,"Pranav",0));
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
