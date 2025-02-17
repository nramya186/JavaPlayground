package org.section22.collection_framework.map.library_system;

import java.util.HashMap;
import java.util.Map;

public class Library_impl {

    Map<String,Book> books = new HashMap<>() ;
    Book book = new Book("Ramya","Ramya",100.0);

    public static void main(String[] args) {
        Library_impl lb = new Library_impl();
        lb.book.getAuthor();
    }

}
