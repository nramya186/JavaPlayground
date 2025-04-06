package org.section19.LambdaExpressions.LabdaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Interface {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(5);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(" before sorting:" + num);// before sorting:[1, 5, 2, 3, 4]
        //list always follwo insertion order
        Collections.sort(num);
        System.out.println("after sorting: " + num); //[1, 2, 3, 4, 5]
        //default natural sorting order ascending order low->high

        // customize sorting order we use comparator
        //syntax: Collections.sort(num,ComparatorObject);
        //in comparator(obj1,obj2) if obj1>obj then-1;if obj1<obj2 = 1; if obj1=obj2 then 0
        // Collections.sort(num, Comparator.comparing());

        Collections.sort(num,new MyComparator());
        System.out.println("coustom sorting(desending order) : "+num);

        //using labda expresstion caomparator interfaceC

         // new My comparator() obj is replaced with it and no need of extra class to override
        System.out.println("using labda expresstion"+num);
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
      /*  if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else   {
            return 0;
        }*/ //insed lenthy code we have alternative
        return (o1>o2) ? -1: (o1<o2)? 1 : 0 ;
    }
}
