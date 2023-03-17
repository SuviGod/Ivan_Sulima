package edu.sulima;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task2 {
    public static String first_non_repeating_letter(String string){

        HashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for(char c: string.toCharArray()){
            c = Character.toLowerCase(c);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        for(char c: string.toCharArray()){
            if(frequencyMap.get(Character.toLowerCase(c)) == 1){
                return Character.toString(c);
            }
        }
        return "";
    }
}
