package day43_interfaces_iterators;

import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main2 {

    public static String CodelandUsernameValidation(String str) {
        Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{2,23}[^_]");
        Matcher matcher = p.matcher(str);
        return matcher.matches() ? "true" : "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}