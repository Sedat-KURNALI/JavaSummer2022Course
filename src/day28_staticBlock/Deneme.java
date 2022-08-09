package day28_staticBlock;

import java.util.ArrayList;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list);
        degistir(list);
        System.out.println(list);
        degistir2(list);
        System.out.println(list);

    }


    public static void degistir(List<Integer> list) {
        for (Integer each : list) {
            each = each + 3;
            System.out.print(each + " ");
        }
        System.out.println();
        System.out.println(list);
    }

    public static void degistir2(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 3);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list);
    }
}

