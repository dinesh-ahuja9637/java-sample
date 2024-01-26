package exception_handling;

public class ExceptionDemoArthematic {
    public static void main(String[] args) {
        String name = "dinesh";
        System.out.println(name);
        try{
        System.out.println(name.toUpperCase());

        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally handled the exception");
        }
        System.out.println("yeah");
    }
}
