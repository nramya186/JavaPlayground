package org.section20.io_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,5,6,8);
        List<Integer> reverse= list.reversed();
        System.out.println("revere using reveresed method:"+reverse);
        List<Integer> reverse2 =list.stream()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
        System.out.println(" reverse using sorted and Comparator.reverseOrder: "+reverse2);
    }
}
