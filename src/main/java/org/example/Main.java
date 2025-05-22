package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(numberToWords(123)); // One Two Three
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        String reversed = new StringBuilder(String.valueOf(number)).reverse().toString();
        return String.valueOf(number).equals(reversed);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) return "Invalid Value";
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();
        for (char digit : String.valueOf(number).toCharArray()) {
            result.append(words[digit - '0']).append(" ");
        }
        return result.toString().trim();
    }
}
