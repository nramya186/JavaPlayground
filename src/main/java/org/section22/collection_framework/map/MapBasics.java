package org.section22.collection_framework.map;

public class MapBasics {

    public static void main(String[] args) {
        System.out.println(" ===================Map================");
        System.out.println("A Map is a part of the Java Collection Framework that stores key-value pairs. Unlike other collections like List and Set, a Map does not store individual elements but maintains a mapping between a key and its corresponding value.");

        System.out.println("======1. Key Features of Map =======\n" +
                "No duplicate keys – Each key in a Map must be unique.\n" +
                "Multiple values allowed – A single key maps to a single value, but different keys can have the same values.\n" +
                "Efficient retrieval – Data retrieval using keys is very fast.\n" +
                "Allows null values – Some implementations (like HashMap) allow null keys and values, while others (like Hashtable) do not.");

        System.out.println("======2. Map Implementations in Java\n" +
                "The Java Collections Framework provides several implementations of Map, including:\n" +
                "\n" +
                "HashMap – Unordered, allows null keys and values, fast performance.\n" +
                "LinkedHashMap – Maintains insertion order, allows null keys and values.\n" +
                "TreeMap – Stores keys in sorted order (natural or custom comparator), does not allow null keys.\n" +
                "Hashtable – Thread-safe but does not allow null keys or values.");
    }
}
