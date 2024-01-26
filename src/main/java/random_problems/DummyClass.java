package random_problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DummyClass {
    void funcA()
    {
        System.out.println("Hi funcA()");
    }
    public static void main(String[] args) {
        System.out.println("hi");
        ArrayList<Integer> arr1 = new ArrayList<>()
                ;

        arr1.add(5);
        arr1.add(11);
        arr1.add(6);
        arr1.add(0);
        arr1.add(1);
        System.out.println(arr1);
        Collections.sort(arr1);
        System.out.println("sorted array is:"+arr1 );
        Collections.reverse(arr1);
        System.out.println("revese array is:"+arr1 );
    }
}
