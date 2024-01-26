package exception_handling;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);

        }
        int a = 0;
        try{
        a=10/0;}
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(a);
    }
}
