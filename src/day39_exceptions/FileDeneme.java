package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileDeneme {
    public static void main(String[] args)  {
        int a = 0;
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/day39_exceptions/Test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            while ((a = fis.read()) != -1) {
                System.out.print((char) a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
