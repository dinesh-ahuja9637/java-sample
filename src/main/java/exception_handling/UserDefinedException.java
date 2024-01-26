package exception_handling;
class InvalidAgeException extends Exception{
    InvalidAgeException()
    {
        System.out.println("Age is less than 18");
    }
}
public class UserDefinedException {
    public static void ageVerify(int age) throws InvalidAgeException,ArrayIndexOutOfBoundsException {
        if(age<18)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            System.out.println("age is greater than 18");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        int age = 17;
        try {
            ageVerify(age);
        }
        catch (Exception e)
        {
            System.out.println("Hi");
        }
    }
}
