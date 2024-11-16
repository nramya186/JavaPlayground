package org.section4.strings_printing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Expressions {
    public static void main(String[] args) {
        System.out.println("Regular expression [regex] :");

        System.out.println("* A Regular expression in Java is a sequence of characters that forms a search pattern. It is used for matching, searching, and manipulating text based on defined rules. Regular expressions can validate input formats, find specific patterns in text, and replace parts of a string.");
        System.out.println("* In Java, regular expressions are handled using the Pattern and Matcher classes in the java.util.regex package.");

        System.out.println("\n1. Pattern: A Pattern is like a search plan. It defines what kind of text you are looking for, such as a phone number or an email address.\n" +
                           "\n2. Matcher: A Matcher is like a tool that uses the Pattern to look for matches in a specific piece of text.\n");

        //Step 1: Create the Pattern:
        System.out.println("Pattern pattern = Pattern.compile(\"\\d{3}\"); // Defines the pattern to match any 3-digit number\n");
        Pattern pattern = Pattern.compile("\\d{3}"); // Defines the pattern to match any 3-digit number

        //Step 2: Create the Matcher:
        System.out.println("Matcher matcher = pattern.matcher(\"The number is 123 in this text.\");\n");
        Matcher matcher = pattern.matcher("The number is 123 in this text.");

        //Step 3: Use the Matcher to Find Matches:
        if (matcher.find()) {
            System.out.println("Found a match: " + matcher.group()); // Outputs: "Found a match: 123"
        } else {
            System.out.println("No match found.");
        }

        System.out.println("Pattern is the rule (\"look for 3-digit numbers\").\n" +
                "Matcher checks the text (\"The number is 123 in this text\") to see if it finds what you're looking for.");

        System.out.println("2. Metacharacters:\n" +
                "These are special characters with unique meanings. Common metacharacters include:");

        // Input text for matching
        String input = "Hello 123 world! This is a test_123 @";

        // Define patterns using different metacharacters
        String[] patterns = {
                "c.t",      // Matches any character between 'c' and 't' (e.g., 'cat', 'cot')
                "^Hello",   // Matches if the string starts with "Hello"
                "world$",   // Matches if the string ends with "world"
                "\\d{3}",   // Matches exactly 3 digits (e.g., '123')
                "\\D+",     // Matches one or more non-digit characters (e.g., 'Hello')
                "\\w{5}",   // Matches exactly 5 word characters (letters, digits, or underscore)
                "\\W",      // Matches any non-word character (e.g., '!')
                "\\s",      // Matches any whitespace character (e.g., space)
                "\\S+"      // Matches one or more non-whitespace characters (e.g., 'Hello123')
        };
        // Quantifiers Examples
        String[] quantifiersPatterns = {
                "ba*",       // Matches 0 or more 'a' after 'b' (matches "b", "ba", "baa")
                "ba+",       // Matches 1 or more 'a' after 'b' (matches "ba", "baa")
                "ba?",       // Matches 0 or 1 'a' after 'b' (matches "b" or "ba")
                "a{3}",      // Matches exactly 3 'a's (matches "aaa")
                "a{2,}",     // Matches 2 or more 'a's (matches "aa", "aaa", "aaaa")
                "a{2,4}",    // Matches between 2 and 4 'a's (matches "aa", "aaa", "aaaa")
        };
       /* Quantifiers:

        ba*: Matches "b", "ba", "baa" (zero or more 'a').
        ba+: Matches "ba", "baa" (one or more 'a').
        ba?: Matches "b" or "ba" (zero or one 'a').
        a{3}: Matches exactly 3 'a's (e.g., "aaa").
        a{2,}: Matches 2 or more 'a's (e.g., "aa", "aaa").
        a{2,4}: Matches between 2 to 4 'a's (e.g., "aa", "aaa", "aaaa").*/

        // Character Classes Examples
        String[] characterClassesPatterns = {
                "[abc]",     // Matches 'a', 'b', or 'c'
                "[^abc]",    // Matches any character except 'a', 'b', or 'c'
                "[a-z]",     // Matches any lowercase letter
                "[A-Z]",     // Matches any uppercase letter
                "[0-9]",     // Matches any digit
                "[a-zA-Z]"   // Matches any letter (lowercase or uppercase)
        };
       /* Predefined Character Classes:
        \\d+: Matches one or more digits (e.g., "123").
        \\D+: Matches one or more non-digits (e.g., "Hello").
        \\w+: Matches one or more word characters (letters, digits, or underscore).
        \\W: Matches a non-word character (e.g., "!").
        \\s+: Matches one or more whitespace characters (e.g., " ").
        \\S+: Matches one or more non-whitespace characters (e.g., "Hello123").
*/

        // Predefined Character Classes Examples
        String[] predefinedClassesPatterns = {
                "\\d+",      // Matches digits (e.g., "123")
                "\\D+",      // Matches non-digits (e.g., "Hello")
                "\\w+",      // Matches word characters (letters, digits, or underscore)
                "\\W",       // Matches non-word characters (e.g., "!", " ")
                "\\s+",      // Matches whitespace characters (e.g., space, tab)
                "\\S+"       // Matches non-whitespace characters (e.g., "Hello123")
        };

        // Special Constructs Examples
        String[] specialConstructsPatterns = {
                "\\d(?=px)",   // Positive lookahead: Matches digits followed by "px"
                "\\d(?!px)",   // Negative lookahead: Matches digits not followed by "px"
                "(?<=USD)\\d+", // Positive lookbehind: Matches digits preceded by "USD"
                "(?<!USD)\\d+"  // Negative lookbehind: Matches digits not preceded by "USD"
        };
       /* Special Constructs:
        \\d(?=px): Matches a digit only if it is followed by "px" (positive lookahead).
        \\d(?!px): Matches a digit only if it is not followed by "px" (negative lookahead).
        (?<=USD)\\d+: Matches digits only if they are preceded by "USD" (positive lookbehind).
        (?<!USD)\\d+: Matches digits only if they are not preceded by "USD" (negative lookbehind).
*/
        // Greedy, Reluctant Quantifiers Examples
        String[] greedyReluctantPatterns = {
                "a.*b",      // Greedy: Matches as much as possible (e.g., "axxxxb")
                "a.*?b"      // Reluctant: Matches as little as possible (e.g., "ab")
        };
     /*   Greedy, Reluctant Quantifiers:
        a.*b: Greedy quantifier; matches "axxxxb" (as much as possible).
        a.*?b: Reluctant quantifier; matches "ab" (as little as possible).*/

        // Loop through each pattern and apply it to the input
        System.out.println("=== Quantifiers ===");
        applyPatterns(input, quantifiersPatterns);

        System.out.println("\n=== Character Classes ===");
        applyPatterns(input, characterClassesPatterns);

        System.out.println("\n=== Predefined Character Classes ===");
        applyPatterns(input, predefinedClassesPatterns);

        System.out.println("\n=== Special Constructs ===");
        applyPatterns(input, specialConstructsPatterns);

        System.out.println("\n=== Greedy, Reluctant Quantifiers ===");
        applyPatterns(input, greedyReluctantPatterns);

    }


    // Helper method to apply patterns and print matches
    private static void applyPatterns(String input, String[] patterns) {
        for (String regex : patterns) {
            // Compile the regex pattern
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            // Check if the pattern matches and print the match
            if (matcher.find()) {
                System.out.println("Pattern '" + regex + "' matched: " + matcher.group());
            } else {
                System.out.println("Pattern '" + regex + "' did not match.");
            }
        }
    }
}
