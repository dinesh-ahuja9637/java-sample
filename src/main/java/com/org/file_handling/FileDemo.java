package com.org.file_handling;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Random obj1 = new Random();
        int a = obj1.nextInt(55555);
        File obj = new File("C:\\Users\\91976\\Desktop\\java_file\\demo"+a+".txt");
        if(!obj.exists() && obj.createNewFile())
        {
            System.out.println("File successfully created");
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.getName());
            System.out.println("can read:"+obj.canRead());
            System.out.println("canco path:"+obj.getCanonicalPath());
            System.out.println(" file size:"+obj.length());

        }else {
            System.out.println("File creation failed");
            System.out.println(obj.getAbsolutePath());
        }
    }
}
