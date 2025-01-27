package org.example;


import java.util.Locale;

public class Main {
    public static boolean checkForPalindrome(String str){
        String tmzStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.US);
        String tersStr = new StringBuilder(tmzStr).reverse().toString();
        return tmzStr.equals(tersStr);
    }

    public static String convertDecimalToBinary(int decimal){
        if(decimal==0){
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (decimal>0){
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println("I did, did I? => " + checkForPalindrome("I did, did I?"));
        System.out.println("Racecar => " + checkForPalindrome("Racecar"));
        System.out.println("hello => " + checkForPalindrome("hello"));
        System.out.println("Was it a car or a cat I saw ? => " + checkForPalindrome("Was it a car or a cat I saw ?"));
    }

}