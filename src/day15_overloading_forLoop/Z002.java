package day15_overloading_forLoop;

public class Z002 {
    public static void main(String[] args) {
        // 10 - 30 arası sayılar

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
    }
}
