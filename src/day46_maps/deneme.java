package day46_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class deneme {
    public static void main(String[] args) {
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, QA");
        sinifList.put(105, "Mahir, Kaya, JDev");
        sinifList.put(107, "Ensar, Canem, Tester");

        System.out.println(sinifList);

        Map<String, Integer> bransMapList = new HashMap<>();
        Integer sayi = 0;
        String[] arr;
        for (String each : sinifList.values()) {
            arr = each.split(", ");
            if (!bransMapList.containsKey(arr[2])) {
                bransMapList.put(arr[2], 1);
            } else {
                sayi = bransMapList.get(arr[2]);
                sayi++;
                bransMapList.put(arr[2], sayi);
            }
        }
        System.out.println(sinifList);
        System.out.println(bransMapList);

    }
}
