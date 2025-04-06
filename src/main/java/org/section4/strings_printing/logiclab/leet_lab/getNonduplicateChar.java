package org.section4.strings_printing.logiclab.leet_lab;

public class getNonduplicateChar {
    public static void getunique(String str){
        int[] freq= new int[256];
        for(int i=0;i<=str.length()-1;i++){
            freq[str.charAt(i)]++;
        }
        System.out.println(" non repeteing char :");
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)]==1){
                System.out.print(str.charAt(i) +" "); //return;// if  return it will write all char
            }
        }
    }
    public static void firstNon(String str){
        int[] frequency = new int[256];
        for(int i=0;i<str.length();i++){
            frequency[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
           if( frequency[str.charAt(i)]==1){
               System.out.println("first non repeting char :"+ str.charAt(i));
               return;
           }
        }
    }

    public static void main(String[] args) {
        getunique("abcswissibop");
        firstNon("sjifts");
    }
}
