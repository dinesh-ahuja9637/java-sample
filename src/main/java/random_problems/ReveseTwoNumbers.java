package random_problems;

public class ReveseTwoNumbers {
 int a =2, b= 3;

 public void swapWithoutTemp(int a , int b)
 {
     this.a = a;
     this.b = b;
     a = a+b;

 }
    public void swapUsingTemp(int a , int b)
    {
        int temp = 0;
        temp = this.a;
        this.a= this.b;
        this.b = temp;
    }

    public static void main(String[] args) {


        ReveseTwoNumbers obj = new ReveseTwoNumbers();
        System.out.println("Before swap value of a is:"+obj.a+" value of b is:"+obj.b);
        obj.swapUsingTemp(obj.a,obj.b);
        System.out.println("After swap value of a is:"+obj.a+" value of b is:"+obj.b);

    }
}
