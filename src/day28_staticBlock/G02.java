package day28_staticBlock;

import java.util.ArrayList;
import java.util.List;

public class G02 {
    public static void main(String[] args) {


        String strl = new String("mehmet");
        String str2 = new String("mehmet");

        System.out.println("new == " + (strl == str2));
        System.out.println("new equals     " + (strl.equals(str2)));

        String str3 = "mehmet";
        String str4 = "mehmet";

        System.out.println("klasik == " + (str3 == str4));
        System.out.println("klasik equals =" + (str3.equals(str4)));

        System.out.println(str3);
        System.out.println(str4);

        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if(a=="2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");
        System.out.println(a);

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("7");
        for(String s : list) System.out.print(s);
        System.out.println();

        List<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.add(7);
        values.set(1, 6);
        values.remove(0);
        for (Integer v : values) System.out.print(v);

    }
}
