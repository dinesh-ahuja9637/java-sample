package random_problems;

public class ReveseNumber {
    public static void main(String[] args) {
        int a = 123;
        StringBuilder reveseNumb=new StringBuilder();

        int num,reminder;
        System.out.println("original number is:"+a);

        while(a>0) {

            reminder = a % 10;
            a = a / 10;
            reveseNumb.append(reminder);
        }
        System.out.println("revese number is:"+reveseNumb);

    }


}
