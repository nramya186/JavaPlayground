package org.section7.arrays.logicLab.leet_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        int k=3;
        System.out.println("before rotate : "+ Arrays.toString(nums));
        System.out.println(" After rotate array : ");
        rotateArray(nums,k);
    }

    private static void rotateArray(int[] nums, int k) {
        int n= nums.length;
        k %=n;
        for(int i=0;i<k;i++);
        int last=nums[n-1];
        for(int j=n-1;j>0;j--){  //right shift
            nums[j]=nums[j-1];
        }
        nums[0]=last;
        System.out.println(Arrays.toString(nums)); //[5, 1, 2, 3, 4]

        System.out.println("using the java 8 ");
        int[] rotated= rotatedArray(nums,k);
        System.out.println(Arrays.toString(rotated)); //[2, 3, 4, 5, 1]

    }


    public static int[] rotatedArray(int[] nums,int k){
        int n=nums.length;
        k %=n;

        //1conver int to list
        List<Integer> list= Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> roitated= new ArrayList<>();

        //2 rotate using sublist
        roitated.addAll(list.subList(n-k,n));
        roitated.addAll(list.subList(0,n-k));

        //3 conbert to list
        return roitated.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
