package day39_exceptions;

import java.util.Scanner;

public class denemem {
    public static void main(String[] args) {
        Scanner scan ;
        int sayi = 0;
        System.out.println("Sayi gir=");
        do {
            try {
                scan = new Scanner(System.in);
                sayi= scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Lutfen sayi giriniz");
            }
        } while (true);
        System.out.println(sayi);
    }
}
