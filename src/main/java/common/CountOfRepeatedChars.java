package common;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountOfRepeatedChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String result = scan.next();

        System.out.println(countOfRepeated(result));

    }

    public static String countOfRepeated(String str){
        String result = "";
        int count  = 0;
        char temp = str.charAt(0);

        for(char c : str.toCharArray()){
            if(temp == c)
                count++;
            else{
                result += ""+temp + count;
                temp = c;
                count =1;
            }
        }
        return result;
    }
}
