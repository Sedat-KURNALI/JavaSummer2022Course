package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

import static day46_maps.ReusableMethods.mapOlustur;

public class C03_Compute {
    public static void main(String[] args) {
        Map<String, Integer> harfMapi = new HashMap<>();
        harfMapi.put("A", 3);
        harfMapi.put("B", 5);
        harfMapi.put("C", 2);
        harfMapi.put("D", 8);
        harfMapi.put("E", 1);
        harfMapi.put("F", 7);

        System.out.println(harfMapi);

        harfMapi.compute("A", (k, v) -> v * 2 + 3);
        System.out.println(harfMapi);
        harfMapi.compute("D", (a, b) -> b * b);
        System.out.println(harfMapi);
        harfMapi.computeIfAbsent("C", (v) -> 30);
        System.out.println(harfMapi);
        harfMapi.computeIfAbsent("S", (v) -> 38);
        System.out.println(harfMapi);
        harfMapi.computeIfPresent("G", (k, v) -> v + 5);
        System.out.println(harfMapi);
        harfMapi.computeIfPresent("E", (k, v) -> v + 15);
        System.out.println(harfMapi);



    }
}
