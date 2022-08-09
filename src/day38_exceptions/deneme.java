package day38_exceptions;

public class deneme {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 5;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(sayi1 / sayi2);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            sayi2--;
        }


    }
}
