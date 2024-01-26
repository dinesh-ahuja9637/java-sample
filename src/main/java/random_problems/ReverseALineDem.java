package random_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseALineDem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any line you want to print in revese order");
        String line = obj.nextLine();
        System.out.println("original line is:"+line);
        String[] line1 = line.split(" ");
        System.out.println(Arrays.toString(line1));
        System.out.println("Reverse of above line is:");
        for(int i = line1.length-1;i>=0;i--)
        {
            System.out.print(line1[i]+ " ");
        }

    }
}
