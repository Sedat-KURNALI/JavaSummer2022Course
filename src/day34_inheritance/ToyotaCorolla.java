package day34_inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {

        ToyotaCorolla arb1 = new ToyotaCorolla();
        System.out.println(arb1.marka);
        System.out.println(arb1.model);

        ToyotaCorolla arb2 = new ToyotaCorolla();
        System.out.println(arb2.marka);
        System.out.println(arb2.model);


    }
}
