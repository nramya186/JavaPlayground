package org.section4.strings_printing.logiclab;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class TestAll {

    public static void main(String[] args) {
      countNumOfWordHash("My Name is Ramya is My Ramya");
      nonRepeatingCharinString("SWISS");
      countOccurencesofCharString("RAmya",'m');
      removeDuplicates("rrabya");
    }

    private static void removeDuplicates(String str) {
        StringBuilder nonRepeat = new StringBuilder();
        boolean[] visit= new boolean [256];
        for(char c: str.toCharArray()){
            if(!visit[c]){
                nonRepeat.append(c);
                visit[c]= true;
            }
        }
        System.out.println( nonRepeat.toString());

        // way two  using likedhashset
        LinkedHashSet<Character> nonRe = new LinkedHashSet<>();
        for(char c: str.toCharArray()){
            nonRe.add(c);
        }
        StringBuilder nonReapet= new StringBuilder();
        for(char c: nonRe){
            nonReapet.append(c);
        }
        System.out.println(" non repete using LinkedSet:"+ nonReapet);
    }

    private static void countOccurencesofCharString(String rAmya, char m) {
        int count =0;
        for(char c: rAmya.toCharArray()){
            if(c==m){
                count++;
            }
        }                System.out.println("count of char "+ m +" is :"+ count);

    }


    private static void countNumOfWordHash(String str) {
          String[] words= str.split("\\s+");
        HashMap<String,Integer> hashmap= new HashMap<>();
        for(String s : words){
            hashmap.put(s,hashmap.getOrDefault(s,0)+1);
        }
        System.out.println(hashmap);
    }

    private static void nonRepeatingCharinString(String str) {
        HashMap<Character,Integer> countMap= new HashMap<>();
        for(char c: str.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        for(char c: countMap.keySet()){
            if(countMap.get(c)==1){
            System.out.println("non repeting char is :"+ c);
            break;
            }
        }
    }

}
