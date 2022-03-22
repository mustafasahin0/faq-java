package algorithm;

/*
Given an array of integers, return the indices of the two numbers whose sum is equal to a given target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9.

The output should be [0, 1].
Because nums[0] + nums[1] = 2 + 7 = 9.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] myArray = {2, 7, 9, 11};

        System.out.println(Arrays.asList(twoSum2(myArray, 6)));


    }

    public static int[] twoSum(int[] array, int target) {
        // 1 2 3 4 5 6 7 8
        // 1 2 3 4 5 6 7
        // 2 3 4 5 6 7 8

        for (int i = 0; i < array.length - 1; i++) {

            for (int o = 1; o < array.length; o++) {

                if (array[i] + array[o] == target) {
                    return new int[]{i, o};
                }
            }

        }

        return new int[]{};
    }

    public static int[] twoSum2(int[] array, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< array.length; i++){
            int potentialMatch = target - array[i];

            if(map.containsKey(potentialMatch))
                return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);

            return new int[]{};

        }

        return null;
    }
}
