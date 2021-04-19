package com.files;
import java.io.*;
import java.util.Scanner;
public class fileRead {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        try
        {
            fileIn = new FileInputStream("file.txt");
            Scanner scan = new Scanner(fileIn);
//            int a;
//            while ((a = fileIn.read()) != -1) {
//                System.out.println((char)a);
//            }
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
        finally {
            if (fileIn != null) {
                fileIn.close();
            }
        }
    }
}
