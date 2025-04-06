package org.section4.strings_printing.logiclab.leet_lab;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt r= new RomanToInt();
        System.out.println(r.romanInt("XII"));
    }

    public  int romanInt(String s){
        //step 1: Map Roman to values
        HashMap<Character ,Integer> romanMap= new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        int sum=0; //final int value
        int preValue=0; //keep tracking of previous numeral value

        // Step 2: Traverse the string from left to right
        for(int i = s.length()-1;i>=0;i--){
            int curValue=romanMap.get(s.charAt(i));

            //3 apply sub strcation  rule
            if(curValue<preValue){
                sum-=curValue;
            }else {
                sum+= curValue;
            }
            preValue=curValue;
        }
return sum;

    }
}
