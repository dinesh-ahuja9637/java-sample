package com.org.file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileContentDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo1.txt");
        File f1 = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo2.txt");
        if(f.exists())
        {
            Scanner obj = new Scanner(f);
            FileWriter fileWriter = new FileWriter(f1);
            while(obj.hasNextLine())
            {
                fileWriter.write(obj.nextLine());
            }
            fileWriter.close();
            obj.close();
            System.out.println("File content copied !! please check");
        }
        else {
            System.out.println("File does not exsits");
        }

    }
}
