package org.collection_framework.comparator_comparable.comparator;



import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    ComparatorDemo(int roll_no, String name, int class_no)
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
        return "{Roll no:" + roll_no + " name:"+name+" class:"+class_no+"}";
    }

    int class_no;
    public static void main(String[] args) {
        ArrayList<ComparatorDemo> obj = new ArrayList<ComparatorDemo>();

        obj.add(new ComparatorDemo(1,"Indu",11));
        obj.add(new ComparatorDemo(5,"Dinesh",9));
        obj.add(new ComparatorDemo(0,"Pranav",0));
        System.out.println(obj);
        Collections.sort(obj,new RollNoComparator());
        System.out.println(obj);


    }
}
