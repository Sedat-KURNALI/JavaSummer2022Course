package day47_maps;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
        String str = "Heeeeellllooooo Woooorrrrllllllddddd.AAcDDDDx";
        str = str.replaceAll("\\W", "");
        String[] arr = str.split("");
        List<String> listDeneme = new ArrayList<>();
        for (String each : arr) {
            if (!listDeneme.contains(each)) {
                listDeneme.add(each);
            }
        }
        int toplam = 0;
        for (int i = 0; i < listDeneme.size(); i++) {
            toplam = 0;
            for (int j = 0; j < arr.length; j++) {
                if (listDeneme.get(i).equals(arr[j])) toplam++;
            }
            System.out.print(listDeneme.get(i) + "=" + toplam + "\t");
        }
        System.out.println("\n" + listDeneme);
        System.out.println("==========================");
        Map<String, Integer> harfSayisiMap = new HashMap<>();
        Integer sayi = 0;
        for (String each : arr) {
            if (!harfSayisiMap.containsKey(each)) {
                harfSayisiMap.put(each, 1);
            } else {
                sayi = harfSayisiMap.get(each);
                sayi++;
                harfSayisiMap.put(each, sayi);
            }
        }
        System.out.println(harfSayisiMap);

    }
}
