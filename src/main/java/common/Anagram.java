package common;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to see if it is anagram");
        String str1 = scan.next();
        System.out.println("Enter second string");
        String str2 = scan.next();

        System.out.println(isAnagram2(str1, str2));

    }

    // Solution 1
    public static boolean isAnagram(String str1, String str2) {
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        String a1 = "", a2 = "";

        for (int i = 0; i < char1.length; i++) {
            a1 += char1[i];
        }

        for (int i = 0; i < char2.length; i++) {
            a2 += char2[i];
        }

        return a1.equals(a2);
    }

    // Streams Solution
    public static boolean isAnagram2(String str1, String str2) {
        boolean isAnagram = Stream.of(str1.toLowerCase().split("")).sorted().collect(Collectors.joining()).equals(
                Stream.of(str2.toLowerCase().split("")).sorted().collect(Collectors.joining())
        );
        return isAnagram;
    }
}
