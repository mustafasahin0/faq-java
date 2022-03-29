package common;

import java.util.*;

public class CountOfCharacters {

    /**
     * Write a program to fund count if each element in an array of characters
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.next();

       // System.out.println("Enter the character that you want to count check");
       // char ch = scan.next().charAt(0);

        charCount2(str);

    }

    // Core Java
    public static void charCount(String str, String ch) {
        char[] charArray = ch.toLowerCase(Locale.ROOT).toCharArray();
        char target = charArray[0];

        // Create an array of with size of the string.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase(Locale.ROOT).charAt(i) == target)
                count++;
        }
        System.out.println("Occurrences of " + ch + " is " + count + " times.");
    }

    // Streams
    public static void charCount2(String str){
       HashMap<Character, Long> countMap = new LinkedHashMap<>();

       for(int i = 0; i< str.length(); i ++){
           int finalI = i;
           long count = str.chars().filter(e -> (char)e == str.charAt(finalI)).count();
           if(!countMap.containsKey(str.charAt(i))){
               countMap.put(str.charAt(i), count);
           }else{
               countMap.put(str.charAt(i), countMap.get(str.charAt(i)));
           }
       }

        for (Map.Entry<Character, Long> characterLongEntry : countMap.entrySet()) {
            System.out.println(characterLongEntry.getKey() + " : " + characterLongEntry.getValue());
        }

    }

}
