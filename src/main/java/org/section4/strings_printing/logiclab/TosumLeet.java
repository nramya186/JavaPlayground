package org.section4.strings_printing.logiclab;

import java.util.Arrays;

public class TosumLeet {
public static int[] toSum(int[] nums, int target){
    for(int i = 0; i< nums.length; i++){
        for (int j=i+1; j< nums.length;j++){
            for(int k=j+1; k<nums.length;k++) {
                if (nums[i] + nums[j] +nums[k]== target){
                        return new int[]{i, j, k};
                }
            }
        }
    }return new int[]{};
}

    public static void main(String[] args) {
        int[] nums= {2,4,5,6,7,8,7};
        int target = 55;
        int[] result = toSum(nums,target);
        System.out.println(" check which 3 elements from array is equal to target :");
       if(result.length>0){
        System.out.println(Arrays.toString(result));}
       else {
           System.out.println("  sum of element is not match  target "+target);
       }
    }
}
