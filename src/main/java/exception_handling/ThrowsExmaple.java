package exception_handling;

import java.io.FileNotFoundException;

public class ThrowsExmaple {
    public static void main(String[] args) throws ArithmeticException  {
        int a =10,c;
        try{
        c = a/10;
            System.out.println("bye 111");}
        catch(ArithmeticException e)
        {
            System.out.println("Handoed this exception");
        }
        finally {
            System.out.println("hi");
        }
        System.out.println("bye");

    }
}
