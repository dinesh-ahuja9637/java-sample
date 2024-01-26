package random_problems;



import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd_NumbersList {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter number till which you want to print even and odd numbers:");
        int a = obj.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i=0; i<=a;i++)
        {
            if(i%2==0)
            {
                evenNumbers.add(i);
            }
            else {
                oddNumbers.add(i);
            }
        }
        if(evenNumbers.size()>0)
        {
            System.out.println("Array List of even numbers is: "+evenNumbers);
        }
        else
        {
            System.out.println("ArrayList of even numbers is empty");
        }

        if(oddNumbers.size()>0)
        {
            System.out.println("Array List of odd numbers is: "+oddNumbers);
        }
        else
        {
            System.out.println("ArrayList of odd numbers is empty");
        }


    }
}
