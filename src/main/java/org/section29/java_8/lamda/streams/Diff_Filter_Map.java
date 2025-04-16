package org.section29.java_8.lamda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Diff_Filter_Map {
    //stream() method present indide collection interface in default
    //sretam interface prenrt inside collection interface, prent inside java.util.Stream package
    public static void main(String[] args) {
                //1.Configuration
        //2.Processing

        List<String> name= new ArrayList<>();
        name.add("Ramya");
        name.add("sid");
        name.add("suraj");
        name.add("ronit");
        name.add("vedu");
        name.add("rajani");
        System.out.println(name);

        List<String> l1= name.stream().filter(s->s.length()>=4).collect(Collectors.toList());
        System.out.println(" getting name longer than 4 char: "+l1);

        //making it tio uppercase
        List<String> l2= name.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("names to uppercase:"+l2);

        //count method whomany num is there
        //whos char is >=3
        long count=name.stream().filter(s->s.length()>=3).count();
        System.out.println("how many num of name is lenth >3 :"+count);

       //sorted :
        //natural order
        List<String> sort= name.stream().sorted().collect(Collectors.toList());
        System.out.println(" sorted:  "+ sort);
        //customise order
        List<String> costOrder= name.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("cust :"+costOrder);

        List<Integer> nam = Arrays.asList(10, 20, 5, 30);
        //min and max()
        Integer min= nam.stream().min((s1, s2)->s1.compareTo(s2)).get();
        System.out.println("min value"+ min);

        Integer max=nam.stream().max((s1,s2)->s1.compareTo(s2)).get();
        System.out.println("max:"+max);

        //toArray()- to copy to array
        Integer[] ir= nam.stream().toArray(Integer[]::new);
        for(Integer i:ir)
        {
            System.out.println(i);
        }

    }
}
