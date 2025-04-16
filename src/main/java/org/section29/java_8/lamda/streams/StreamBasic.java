package org.section29.java_8.lamda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasic {
    public static void main(String[] args) {

        List<Integer> i= new ArrayList<>();
        i.add(10);
        i.add(11);
        i.add(12);
        i.add(13);
        i.add(14);
        i.add(15);
        System.out.println(" beore i : "+i);
        System.out.println("without Streams: to filter even number and add to list");
        List<Integer> evenList = new ArrayList<>();
        for(Integer j:i){
            if(j%2==0){
                evenList.add(j);
            }
        }
        System.out.println(evenList); //[10, 11, 12, 13, 14, 15]


        // with stream
        List<Integer> l1=i.stream().filter(k->k%2==0).collect(Collectors.toList());
        System.out.println("After using stream:"+ l1);//[10, 12, 14]

        //double every element from list
        List<Integer> l2= i.stream().map(m->m*2).collect(Collectors.toList());
        System.out.println("to double orignal list: using map"+l2);//[20, 22, 24, 26, 28, 30]



    }
}
