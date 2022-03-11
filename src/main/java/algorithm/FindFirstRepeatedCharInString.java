package algorithm;

import javax.swing.plaf.IconUIResource;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindFirstRepeatedCharInString {
    public static void main(String[] args) {

        firstChar2("mustafa");
    }

    public static void firstChar(String str) {

        Set<Character> chars = new HashSet<>();

        for (Character ch : str.toCharArray()) {
            if (!chars.add(ch)) {
                System.out.println(ch);
            }
        }
    }

    public static void firstChar2(String str) {

        for (int i = 0; i < str.length()-1; i++) {
            int count = 0;
            for (int a = 1; a < str.length(); a++) {
                if(str.charAt(i) == str.charAt(a)){
                    count++;
                }
            }

            if(count==2){
                System.out.println("We found it");
                System.out.println(str.charAt(i));
            }
        }

    }
}
