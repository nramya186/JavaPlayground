package org.section4.strings_printing.logiclab;

public class GetDuplicateChar {

    public static String findCommon(String str1,String str2){
        StringBuilder common= new StringBuilder();

        boolean[] visited = new boolean[256]; //ascii char set

        for(char ch1: str1.toCharArray()){
            for(char ch2: str2.toCharArray()){
                if(ch1==ch2 && !visited[ch1]){
                    common.append(ch1);
//                    System.out.println(ch1);
                    visited[ch1]= true;// Fix: Mark character as visited
                    break;
                }
            }
        }
        return common.toString().trim();// Trim to remove trailing space
    }

    public static String findCommonWords(String str1, String str2){
        String[] words1= str1.split(" ");
        String[] words12= str2.split(" ");

StringBuilder wordCommon= new StringBuilder();
for(String word1: words1){
            for(String word2: words12){
                if(word1.equals(word2) && !wordCommon.toString().contains(word1) ){
                    wordCommon.append(word1).append(" ");
//                    System.out.println(word1);
                    break;
                }
            }
        }
        return wordCommon.toString().trim();
    }
    public static void main(String[] args) {
        String str1="hello";
        String str2= "world";
        System.out.println(" common charectert in both is:  "+findCommon(str1,str2));


        String st1 = "Java is a powerful language";
        String st2 = "Python is also a powerful language";

        System.out.println("Common words: " + findCommonWords(st1, st2));
    }

}
