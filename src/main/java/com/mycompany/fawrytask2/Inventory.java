/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author HP
 */
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();
    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println(" book is Added: " + book.getTitle());
    }
    public void removeBook(String isbn) {
        books.remove(isbn);
    }
    public Book getBook(String isbn) {
        return books.get(isbn);
    }
    public void removeOutdatedBooks(int maxAge) {
        books.values().removeIf(book -> {
            boolean outdated = (2024 - book.getYear()) > maxAge;
            if (outdated) {
                System.out.println(book.getTitle() + " is outdated and removed");
            }
            return outdated;
        });
    }
    public boolean exists(String isbn) {
        return books.containsKey(isbn);
    }
}