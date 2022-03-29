package common;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseString {

    /**
     * Write a program that reverse a String
     *
     * @param args
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.next();
        System.out.println(reverse6(str));

    }

    //For Loop
    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //StringBuffer
    public static String reverse2(String str) {

        StringBuffer stringBuffer = new StringBuffer(str);

        String result = new String(stringBuffer.reverse());

        return result;
    }

    //StringBuilder
    public static String reverse3(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        String result = new String(stringBuilder.reverse());

        return result;
    }

    //Char Array
    public static String reverse4(String str) {
        String result = "";
        char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }
        return result;
    }

    //Stream
    public static String reverse5(String str) {
        String result = "";
        List<String> stringList = Arrays.asList(str.split(""));
        Collections.reverse(stringList);
        result = stringList.stream().map(a -> new String(a)).collect(Collectors.joining());
        return result;
    }

    //Lambda - Functional Interface - Function
    public static String reverse6(String str){
        Function<String, String> reverse = s -> {
            StringBuffer stringBuffer = new StringBuffer(s);
            return new String(stringBuffer.reverse());
        };
       return reverse.apply(str);
    }
}
