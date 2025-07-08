/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author HP
 */
public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, double price, String authorName) {
        super(isbn, title, year, price, authorName);
    }
    @Override
    public boolean isForSale() { return false; }
    @Override
    public void handleDelivery(String email, String address) {
        System.out.println("[Quantum book store] Showcase book is not for sale or delivery.");
    }
}
