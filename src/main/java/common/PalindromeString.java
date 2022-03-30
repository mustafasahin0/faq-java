package common;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome");
        String entry = scan.next();

        System.out.println(isPalindrome2(entry));
    }

    // Basic Approach
    public static boolean isPalindrome(String str) {

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i) + "";
        }
        if (reversed.equalsIgnoreCase(str))
            return true;

        return false;
    }

   // Java 8
   public static boolean isPalindrome2(String str){
        return IntStream.rangeClosed(0, str.length()/2).noneMatch( p -> str.charAt(p) != str.charAt( str.length()-p-1));
   }
}
