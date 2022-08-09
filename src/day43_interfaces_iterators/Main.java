package day43_interfaces_iterators;

import java.util.*;
import java.io.*;
class Main {
    public static String CodelandUsernameValidation(String str) {
        // code goes here
        if (
                str.length() >= 4 &&
                        str.length() <= 25 &&
                        str.substring(0, 1).replaceAll("[a-zA-Z]", "").equals("") &&
                        str.replace("_", "").replaceAll("\\w", "").equals("") &&
                        !str.substring(str.length() - 1).equals("_")
        ) {
            str = "true";
        } else str = "false";

        return str;
    }
    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}