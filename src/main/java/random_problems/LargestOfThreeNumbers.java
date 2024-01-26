package random_problems;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a =3100,b =2900, c = 9900;

        int d = (a> b && a > c) ? a : ((b>c) ? b : c);
        System.out.println("larger using ternery:"+d);
        if(a> b && a > c)
        {
            System.out.println("Largest among 3 numbers is:"+a);
        }
        else if ( b > c)
        {
            System.out.println(b+" is the largest");
        }
        else System.out.println(c+" is the largest");
    }
}
