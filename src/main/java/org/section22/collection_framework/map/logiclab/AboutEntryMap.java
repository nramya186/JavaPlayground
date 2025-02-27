package org.section22.collection_framework.map.logiclab;

import java.util.*;
import java.util.stream.Collectors;

public class AboutEntryMap {

    static Map<String, Integer> student_marks = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(" Map.entry <k,V> is nested interface ,inside map interface. it represent single key value pair" +
                "getKey()\tReturns the key from the entry.\n" +
                "getValue()\tReturns the value from the entry.\n" +
                "setValue(V value)\t \tUpdates the value associated with the key.\n");
        System.out.println("adding map :\n");
        addMap();
//        // Using entrySet() to iterate over key-value pairs
        System.out.println("Entry set : it can also be used for modifying values, filtering, sorting, and transforming data\n");
        useEntrySet();

        System.out.println(" .map uses in stream:");
        dotMapUses();
    }


    public static void addMap() {
        student_marks.put("ramya", 90);
        student_marks.put("abhira", 96);
        student_marks.put("aditya", 78);
        student_marks.put("adhira", 80);
    }

    public static void useEntrySet() {
        // Using entrySet() to iterate over key-value pairs
        // Iterating using entrySet()
        for (Map.Entry<String, Integer> entry : student_marks.entrySet()) {
            System.out.println("student: " + entry.getKey() + ", marks: " + entry.getValue());
        }
        System.out.println(" student:map:" + student_marks); //op :  student:map:{ramya=90, abhira=96, adhira=80, aditya=78}
        System.out.println(" uses keyset: \n" +
                "keySet() + get()\tGood when only keys are needed\t\n" +
                "entrySet()\tBest when both keys and values are needed\n");

        for (String key : student_marks.keySet()) {
            System.out.println(" student:" + key + "marks :" + student_marks.get(key));
        }
        System.out.println(" student:map:" + student_marks);
        //op:  student:map:{ramya=90, abhira=96, adhira=80, aditya=78}
        System.out.println(" Modify Map using entrySet()");
        for (Map.Entry<String, Integer> entry2 : student_marks.entrySet()) {
            if (entry2.getKey().equals("aditya")) {
                entry2.setValue(88);
                System.out.println(" aditya set to 88");
            }
        }
        System.out.println(" student:map:" + student_marks); // student:map:{ramya=90, abhira=96, adhira=80, aditya=88}
        System.out.println(" Converting entrySet() to Other Data Structures\n");
        List<Map.Entry<String, Integer>> list = new LinkedList<>(student_marks.entrySet());

        System.out.println("Convert Map to String (Key-Value Pairs)\n");
        String result = student_marks.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " = " + entry.getValue())
                .collect(Collectors.joining(","));
        System.out.println(result); // Output: Ramya=90, Ronit=88, Rajani=95
        //ramya = 90,abhira = 96,adhira = 80,aditya = 88

        System.out.println(" 2. Filtering Entries Based on Condition\n");

        student_marks.entrySet()
                .stream()
                .filter(ent -> ent.getValue() > 85)
                .forEach(et -> System.out.println(et.getKey() + " ->" + et.getValue()));
        //op: ramya ->90
        //abhira ->96
        //aditya ->88
        System.out.println("3. Sorting a Map Using entrySet()\n");
        student_marks.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue()) //For descending order, use
                .forEach(et -> System.out.println(et.getKey() + " ->" + et.getValue()));
        //op: adhira ->80
        //aditya ->88
        //ramya ->90
        //abhira ->96
        System.out.println("Convert Map to Another Map (Filtered)\n");
        Map<String, Integer> toper = student_marks.entrySet()
                .stream()
                .filter(et -> et.getValue() > 85)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("topper :" + toper); //topper :{ramya=90, abhira=96, aditya=88}
    }

    private static void dotMapUses() {
        System.out.println("\n" +
                "When to Use .map()?\n" +
                "Use .map() when:\n" +
                "\n" +
                "You need to convert elements to another type (e.g., Integer to String).\n" +
                "You want to apply a function to each element in a collection.\n" +
                "You want to extract a specific field from an object list.\n" +
                "You want to modify data without changing the number of elements.");

        //1. Transforming a List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);  // Output: [1, 4, 9, 16, 25]
        System.out.println("✅ Use .map() when you want to modify each element individually.\n" +
                "\n");

        //2. Converting Data Type
        List<String> stringNumbers = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(stringNumbers);//o/p: [1, 2, 3, 4, 5]
        System.out.println("✅ Use .map() when you want to change data types of elements.\n" +
                "\n");

        //3. Extracting Specific Fields from Objects

        class Person {
            String name;
            int age;
            Person(String name, int age) { this.name = name; this.age = age; }
            public String getName() { return name; }
        }

        List<Person> people = Arrays.asList(new Person("Ramya", 25), new Person("Ronit", 22));
        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names); // Output: [Ramya, Ronit]
        System.out.println("✅ Use .map() when you want to extract specific fields from objects.\n" +
                "\n");

        //4. Modifying Strings in a List
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [RAMYA, RONIT]
        System.out.println(" ✅ Use .map() when you need to modify elements without changing the structure.\n" +
                "\n");


        //5. Converting a Map to a List

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        List<Integer> keys = map.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(keys); // Output: [1, 2, 3]

        System.out.println(" When NOT to Use .map()?\n" +
                "Scenario\tUse Instead\n" +
                "Need to filter elements (reduce the number of elements)\t.filter()\n" +
                "Need to flatten a nested structure (List<List<T>>)\t.flatMap()\n" +
                "Need to reduce a collection to a single value (sum, max, etc.)\t.reduce()\n");

        System.out.println("  Use .map() when:\n" +
                "You need to transform elements individually.\n" +
                "You are changing the type of elements.\n" +
                "You are extracting fields from objects.\n" +
                "You are modifying data without altering the number of elements.");
    }
}