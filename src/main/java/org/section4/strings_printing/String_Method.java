package org.section4.strings_printing;

import java.util.Arrays;

public class String_Method {

        public static void main(String[] args) {
            //Split the string String str = "apple,banana,cherry"; into individual fruit names.

           /* String str = "apple,banana,cherry";
            String[] fruits = str.split(",");

            System.out.println(" fruit name :" + fruits);

            for (String fruit : fruits) {
                System.out.println(fruit);

            }

            System.out.println("Fruit names as a list: " + Arrays.toString(fruits));
*/
            System.out.println("---------------------------------------------------");
            System.out.println("Creating Strings 2 ways \n1. Literal: String str = \"Hello, World!\";\n" +
                    "2. Using new keyword: String str = new String(\"Hello, World!\");");

            System.out.println("\nImmutable Nature: Since String is immutable, methods like replace(), toUpperCase(), etc., return a new string object instead of modifying the original string.");
            System.out.println("\nPerformance Considerations: If you need to manipulate strings frequently, consider using StringBuilder or StringBuffer for mutable sequences of characters.");

            String str="Hello, Word!";
            String str2="hello, java";
            String emptyStr = "";

            // 1. length()
            System.out.println("\n1. length(): Retrieves the number of characters in the string.");
            System.out.println("Length: " + str.length()); // Output: 13

            // 2. charAt(int index)
            System.out.println("\n2. charAt(): Returns the character at the specified index.");
            System.out.println("Character at index 4: " + str.charAt(4)); // Output: o

            // 3. substring(int beginIndex)
            System.out.println("\n3. substring(): Extracts a portion of the string.");
            System.out.println("Substring from index 7: " + str.substring(7)); // Output: World!

            // 4. indexOf(String str)
            System.out.println("\n4. indexOf(): Finds the first occurrence of a specified character or string.");
            System.out.println("Index of 'o': " + str.indexOf('o')); // Output: 4

            // 5. lastIndexOf(String str)
            System.out.println("\n5. lastIndexOf(): Finds the last occurrence of a character or substring.");
            System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Output: 8

            // 6. equals(Object another)
            System.out.println("\n6. equals(): Compares the string for exact equality.");
            System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!")); // Output: true

            // 7. equalsIgnoreCase(String another)
            System.out.println("\n7. equalsIgnoreCase(): Compares two strings ignoring case.");
            System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!")); // Output: true

            // 8. toLowerCase() / toUpperCase()
            System.out.println("\n8. toLowerCase() / toUpperCase(): Changes the case of the string.");
            System.out.println("Lowercase: " + str.toLowerCase()); // Output: hello, world!
            System.out.println("Uppercase: " + str.toUpperCase()); // Output: HELLO, WORLD!

            // 9. trim()
            System.out.println("\n9. trim(): Removes leading and trailing spaces.");
            System.out.println("Trimmed str2: '" + str2.trim() + "'"); // Output: 'Hello, Java!'

            // 10. replace(char oldChar, char newChar)
            System.out.println("\n10. replace(): Replaces specified characters or substrings.");
            System.out.println("Replace 'o' with 'a': " + str.replace('o', 'a')); // Output: Hella, Warld!

            // 11. split(String regex)
            System.out.println("\n11. split(): Splits the string into an array based on a regex.");
            String[] words = str.split(", ");
            System.out.println("Split by ', ':");
            for (String word : words) {
                System.out.println(word); // Output: "Hello" and "World!"
            }

            // 12. contains(CharSequence s)
            System.out.println("\n12. contains(): Checks if a substring is present.");
            System.out.println("Contains 'World': " + str.contains("World")); // Output: true

            // 13. startsWith(String prefix) / endsWith(String suffix)
            System.out.println("\n13. startsWith() / endsWith(): Checks for specific prefixes or suffixes.");
            System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // Output: true
            System.out.println("Ends with '!': " + str.endsWith("!")); // Output: true

            // 14. concat(String str)
            System.out.println("\n14. concat(): Joins strings.");
            System.out.println("Concatenated with ' Welcome!': " + str.concat(" Welcome!")); // Output: Hello, World! Welcome!

            // 15. valueOf()
            System.out.println("\n15. valueOf(): Converts different types to a string.");
            int num = 123;
            String numStr = String.valueOf(num);
            System.out.println("Value of int 123 as String: " + numStr); // Output: 123

            // 16. isEmpty()
            System.out.println("\n16. isEmpty(): Checks if the string is empty (length() is 0).");
            System.out.println("Is str empty: " + str.isEmpty()); // Output: false
            System.out.println("Is emptyStr empty: " + emptyStr.isEmpty()); // Output: true


        }



}
