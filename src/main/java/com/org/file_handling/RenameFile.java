package com.org.file_handling;

import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo.txt");
    File f1 = new File("C:\\Users\\91976\\Desktop\\java_file\\FileWriterDemo1.txt");
        f.renameTo(f1);
    }
}
