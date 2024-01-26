package exception_handling;

public class MultipleCatchBlocksForSingleTryBlock {

    public static void main(String[] args) {
        int a =5,b=6,c;
        String name = "Dinesh";
        try
        {
            c = a/2;
            System.out.println("c:"+c);

            System.out.println(name.toUpperCase());
            System.out.println(Integer.parseInt(name));
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
