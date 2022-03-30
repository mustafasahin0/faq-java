package common;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class CountOfNumbers {

    /**
     * Write a program to find count if each element in an array of numbers
     */

    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5,6,7,8,9,10,11,12,1,2,3,4,5,6,7,8,9};

        numCount2(numArr);
    }

    // Core Java
    public static void numCount(int[] arr, int target) {

        // Create an array of with size of the string.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                count++;
        }
        System.out.println("Occurrences of " + target + " is " + count + " times.");
    }


    // Streams
    public static void numCount2(int[] arr){

        Map<Integer, Long> numMap = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int finalI = i;
            long count = Arrays.stream(arr).filter(e -> e == arr[finalI]).count();

            if(!numMap.containsKey(arr[i])){
                numMap.put(arr[i], count);
            }else{
                numMap.put(arr[i], numMap.get(arr[i]));
            }
        }

        for (Map.Entry<Integer, Long> integerLongEntry : numMap.entrySet()) {
            System.out.println(integerLongEntry.getKey() + " : " + integerLongEntry.getValue());
        }

    }


}
