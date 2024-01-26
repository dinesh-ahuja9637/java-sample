package com.org.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingScannerDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo.txt");
        Scanner obj = new Scanner(f);

        while(obj.hasNextLine())
        {
            System.out.println(obj.nextLine());

        }

    }
}
