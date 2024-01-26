package exception_handling;

public class NotHandlingExceptionDemo {
    public static void main(String[] args) {
        int a = 5,c;
        try{
            c = a/1;
            System.out.println("in try block");
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("After finally");
        try{
            System.out.println("hi");
        }
         finally {
            System.out.println("Finally block2");
        }
    }
}
