package org.section7.arrays.logicLab.leet_lab;

import java.util.*;

public class ToSum {
    public static void main(String[] args) {
        int[] nums={1,-1,2,4,1,2};
        int target=3;
        int[][] pairs= getTosum(nums,target);
        System.out.println(Arrays.deepToString(pairs));
    }
    public static int[][] getTosum(int[] nums,int target){
        List<int[]> result =  new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(complement)){
                result.add(new int[]{map.get(complement),i});
            }
            map.put(nums[i],i);
        }
        return result.toArray(new int[0][]);

    }
}
