package com.org.file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileDemo {
    public static void fileWriterFunc() throws IOException {
        File o;
        FileWriter f = null;
        o = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo.txt");

        try {

            if(!o.exists())
            {
                f = new FileWriter(o);
                f.write("hello!! this file is written using java code");
            }
            else {
                f = new FileWriter(o,true);
                f.append("\n appending at the end, the new text");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            f.close();
            System.out.println("File writing done");
        }
    }

    public static void main(String[] args) throws IOException {
        fileWriterFunc();
    }
}
