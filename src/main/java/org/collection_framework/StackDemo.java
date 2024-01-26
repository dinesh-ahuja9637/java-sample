package org.collection_framework;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(null);
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
        System.out.println(obj.peek());
        System.out.println(obj);
    }
}
