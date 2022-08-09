package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Z002 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); //  []  bo?

        Integer[] arr = {2, 8, 7, 1, 52, 41, 0, 2};
        System.out.println(Arrays.toString(arr)); // [2, 8, 7, 1, 52, 41, 0, 2]

        List<Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 8, 7, 1, 52, 41, 0, 2]

    }
}
