package org.section4.strings_printing.logiclab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("reverse give string :" + reverString("Hello"));
        System.out.println("reverse give string using Collection :" + reverseCo("Hello Ramya"));
        System.out.println(" reverse word from sentence :"+ reverseWords("reverse words from the sentence by rAMyra"));
        System.out.println(" using collection reverse:"+reverseWordCollection("hi reverse"));
    }

    private static String reverString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    private static String reverseCo(String str2) {
        List<Character> list = new ArrayList<>();
        //add to list
        for (char s : str2.toCharArray()) {
            list.add(s);
        }
        Collections.reverse(list); // reverse using collections
        StringBuilder reversed = new StringBuilder();
        List<Character> r = new ArrayList<>();
        System.out.println(" reverdded collections method reverde:" + list);
        // add revered list to  string builder
        for (char c : list) {
            reversed.append(c);
        }
        return reversed.toString();
    }

    public static String reverseWords(String s){
        String[] words= s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i= words.length-1;i>=0;i--){
            reversedSentence.append(words[i]).append(" ");
        }
        System.out.println(" reverse :"+ reversedSentence.toString().trim());
   return reversedSentence.toString().trim();
    }

    private static String reverseWordCollection(String s){
        String sentence = "Hello World from Java";
        List<String> wordsList = Arrays.asList(sentence.split(" "));

        Collections.reverse(wordsList);
        String reversedSentence = String.join(" ", wordsList);

        System.out.println(reversedSentence);
        return  reversedSentence;
    }
}
