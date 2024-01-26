package exception_handling;

import java.sql.SQLException;

public class ThrowDemo {

    public static void waitTime() throws InterruptedException {
        Thread.sleep(1000);
        throw new ArithmeticException();
    }

    public static void main(String[] args) throws InterruptedException , ArithmeticException,RuntimeException {

    }
}
