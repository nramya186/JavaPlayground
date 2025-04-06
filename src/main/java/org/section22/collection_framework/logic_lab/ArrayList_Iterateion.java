package org.section22.collection_framework.logic_lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayList_Iterateion {
    public static void main(String[] args) {
        ArrayList<Integer> marks= new ArrayList<>();
        marks.add(100);
        marks.add(67);
        marks.add(89);
        marks.add(98);
        System.out.println( "list using :");
 iterateList(marks);

    findDuplicate("ganesha");
    }

    private static void findDuplicate(String str) {
        HashMap<Character, Integer> charCount =new HashMap<>();
        for(char c:str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: charCount.entrySet()){
            if(entry.getKey()>1){
                System.out.println(entry.getKey()+" appears "+entry.getValue()+" times");
            }
        }

        for(Map.Entry<Character,Integer> entry1 : charCount.entrySet()){
            if(entry1.getValue()>1){
                System.out.println(entry1.getKey() +" + "+entry1.getValue());
            }
        }
    }

    public static void iterateList(List<Integer> list){
        //for-loop
        for(int i=0;i<list.size();i++){
            System.out.println("for loop "+list.get(i));
        }

        //while loop
        int j=0;
        while(j<list.size()){
            System.out.println("while loop: "+list.get(j));
            j++;
        }

        //advance for loop
        for(int item: list){
            System.out.println(item);
        }
    }

    
}
