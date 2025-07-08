/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author HP
 */
public class BookStoreService {
    private Inventory inventory;
    public BookStoreService(Inventory inventory) {
        this.inventory = inventory;
    }
    public double buyBook(String isbn, int quantity, String email, String address) {
        if (!inventory.exists(isbn)) {
            throw new RuntimeException("Book not found");
        }
        Book book = inventory.getBook(isbn);
        if (!book.isForSale()) {
            throw new RuntimeException("Book is not for sale");
        }
        double total = book.getPrice() * quantity;

        if (book instanceof PaperBook) {
            ((PaperBook) book).reduceStock(quantity);
        }
        book.handleDelivery(email, address);
        return total;
    }
}
