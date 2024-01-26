package org.dinesh;

public class SwapTwoNumbers {
    int a =10, b=20;
    public void swap(int a , int b)
    {
       this.a = a;
        this.b=b;
        System.out.println("Before---Inside the function a and b are:"+this.a+" && "+this.b);
        int temp;
        temp = this.a;
        this.a= this.b;
        this.b= temp;
        System.out.println("After----Inside the function a and b are:"+this.a+" && "+this.b);
    }

    public static void main(String[] args) {
        SwapTwoNumbers obj = new SwapTwoNumbers();
        System.out.println("Before---Inside the main a and b are:"+obj.a+" && "+obj.b);
        obj.swap(obj.a, obj.b);
        System.out.println("After---Inside the main a and b are:"+obj.a+" && "+obj.b);
        SwapTwoNumbers obj1 = new SwapTwoNumbers();
        System.out.println("Before--obj1---Inside the main a and b are:"+obj1.a+" && "+obj1.b);
    }
}
