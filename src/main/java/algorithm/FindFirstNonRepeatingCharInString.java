package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstNonRepeatingCharInString {

    public static void main(String[] args) {
        findNonRepeatedCharWithCollection2("enes");

    }

    public static void findNonRepeatedCharWithCollection(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < str.length(); j++) {
                if(i != j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                    break;
                }

            }

            if(unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public static void findNonRepeatedCharWithCollection2(String str) {

       Map<Character, Integer> map = new HashMap<>();

       for(int i = 0; i< str.length(); i++){
           char ch = str.charAt(i);

           if(map.containsKey(ch)){
               map.put(ch, map.get(ch) + 1);
           }else{
               map.put(ch, 1);
           }
       }

       for(Map.Entry<Character, Integer> entry : map.entrySet()){
           if(entry.getValue()==1){
               System.out.println(entry.getKey());
               break;
           }
       }
    }

    }
