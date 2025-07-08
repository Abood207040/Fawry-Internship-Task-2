/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

import com.mycompany.fawrytask2.Services.ShippingService;

/**
 *
 * @author HP
 */
public class PaperBook extends Book {
    private int stock;
    public PaperBook(String isbn, String title, int year, double price, String authorName, int stock) {
        super(isbn, title, year, price, authorName);
        this.stock = stock;
    }
    public int getStock() { return stock; }
    public void reduceStock(int quantity) {
        if (quantity > stock) {
            throw new RuntimeException("Not enough stock for paper book: " + title);
        }
        stock -= quantity;
    }
    @Override
    public boolean isForSale() { return true; }
    @Override
    public void handleDelivery(String email, String address) {
        ShippingService.ship(title, address);
    }
}