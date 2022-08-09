package day15_overloading_forLoop;

public class Z001 {
    public static void main(String[] args) {
        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun
        String input = "ey edip adanada pide ye12";
        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            tersInput = tersInput + input.substring(i, i + 1);
        }
        System.out.println(tersInput);
    }
}
