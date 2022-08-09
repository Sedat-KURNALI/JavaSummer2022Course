package day23_arrayLists;

public class Z01_basamak {
    public static void main(String[] args) {
        int sayi = 2048;
        int basamak = 0;
        int yedek = sayi;
        for (int i = 1; i <= sayi; i++) {
            basamak = i;
            yedek = yedek / 10;
            if (yedek == 0) {
                break;
            }
        }
        System.out.println("basamak = " + basamak);
    }
}
