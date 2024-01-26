package exception_handling;

public class TryAndFinallyDemo {
    public static void main(String[] args) {
        int a =5,c;
        try{
            c = a/0;
        }
        finally {
            System.out.println("hi finally");
        }
    }
}
