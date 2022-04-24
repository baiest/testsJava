package com.example.testsjava.roman;

import java.beans.PropertyEditorSupport;
import java.util.*;

public class RomanNumerals {
    private static Map<Integer, String> roman;
    static {
        roman = new HashMap<>();
        roman.put(1,"I");
        roman.put(5,"V");
        roman.put(10,"X");
        roman.put(50,"L");
        roman.put(100,"C");
        roman.put(500,"D");
        roman.put(1000,"M");
    }
    private static List<Integer> values = new ArrayList<>(){
        {
            add(1);
            add(5);
            add(10);
            add(50);
            add(100);
            add(500);
            add(1000);
        }
    };
    private static List<Character> letters = new ArrayList<>(){
        {
            add('I');
            add('V');
            add('X');
            add('L');
            add('C');
            add('D');
            add('M');
        }
    };
    /**
     * @param num integer to convert to string
     * @return recursive function to join letter roman
     * */
    public static String arabicToRoman(int num) {
        if(roman.containsKey(num)) return roman.get(num);
        int indexValue = values.indexOf(num);
        if (indexValue != -1) return letters.get(indexValue).toString();

        /*
        * Find the minimal value of letters roman and it's index
        * */
        int valueMinimal = 0;
        int indexValueMinimal = -1;
        for (int i = 0; i <= values.size() - 1; i++) {
            if(num <= values.get(i)){
                indexValueMinimal = i - 1;
                valueMinimal = values.get(indexValueMinimal);
                break;
            }
        }
        /*
        * If no find the minimal value, that will be the last
        * */
        if(valueMinimal == 0) {
            indexValueMinimal = values.size() - 1;
            valueMinimal = values.get(indexValueMinimal);
        }

        /*
        * Find the next value of range
        * */
        int nextLetter;
        if(indexValueMinimal < values.size() - 1){
            nextLetter = values.get(indexValueMinimal + 1);
        } else {
           nextLetter = values.get(indexValueMinimal);
        }

        boolean condition = num == 4
                || num == 9
                || num%40==0 && num<50
                || num%90==0 && num<100
                || num%400==0 && num<500
                || num%900==0 && num<1000;

        String result;
        if(condition){
            result = arabicToRoman(nextLetter - num) + roman.get(nextLetter);
            roman.put(num, result);
            return result;
        }
        if(num>10 && num%10 > 0){
            result = arabicToRoman(num - num%10) + arabicToRoman(num%10);
            roman.put(num, result);
            return result;
        }
        result = roman.get(valueMinimal) + arabicToRoman(num - valueMinimal);
        roman.put(num, result);
        return result;
    }
}
