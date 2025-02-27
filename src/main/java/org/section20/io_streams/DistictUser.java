package org.section20.io_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Student{
    int no;
    String name;
    public Student(int no,String name){
        this.no=no;
        this.name=name;
    }

    @Override
    public String toString() {
        return no + " - " + name;
    }
}

public class DistictUser {
    public static void main(String[] args) {
        List<String> username= Arrays.asList("ramay","rajani","ramya","prabhakar","pushpa");

        List<String> get_unique =username.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("getunique user"+get_unique);
        List<String> username2= Arrays.asList("ram","raj","ramya","prabha","pushpa");

        System.out.println(" users Comparator interface  get sorted");
        List<String> sorted= username2.stream().sorted().collect(Collectors.toList());
        System.out.println(" sorted:"+sorted);

        System.out.println(" using comparator");

        List<Student> students= Arrays.asList(
                new Student(1,"zBC"),
                new Student(2,"khy"),
                new Student(5,"hnk")
        );

        students.sort(Comparator.comparing(s->s.name));
        System.out.println(students);
    }
}
