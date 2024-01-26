package com.org.access_modifier_using_packages.public_pkg1;
import com.org.access_modifier_using_packages.private_modifier.classB;

public class classB_ProtectedADemo extends classB {

    public static void main(String[] args) {
        classB_ProtectedADemo obj = new classB_ProtectedADemo();
        System.out.println(obj.a);
    }

}
