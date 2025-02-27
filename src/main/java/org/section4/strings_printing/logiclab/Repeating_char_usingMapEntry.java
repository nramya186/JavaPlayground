package org.section4.strings_printing.logiclab;

import java.util.HashMap;
import java.util.Map;

public class Repeating_char_usingMapEntry {
    public static void main(String[] args) {
        System.out.println(" ---------- Find non repeating first char from string ----------");
        System.out.println("find: "+findNonReaping("swiss"));
    }
    public static Character findNonReaping(String str){
        //1 creating map with Charecter and interger key valu pair
        Map<Character,Integer> nonRepeat = new HashMap<>();

        //2 insert str to map as key and value as count
        for(char c: str.toCharArray()){
            nonRepeat.put(c,nonRepeat.getOrDefault(c,0)+1);
        }

        // search value which match 1
        for(Map.Entry<Character,Integer> entry : nonRepeat.entrySet()){
            if(entry.getValue()==1 ){
                return entry.getKey();
            }
        }
        return '\0';
    }
}
