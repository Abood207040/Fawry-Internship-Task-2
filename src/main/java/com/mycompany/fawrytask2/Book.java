/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

/**
 *
 * @author HP
 */
public abstract class Book {
    protected String isbn;
    protected String title;
    protected int year;
    protected double price;
    protected String authorName;
    public Book(String isbn, String title, int year, double price, String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.year = year;
        this.price = price;
        this.authorName = authorName;
    }
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public String getAuthorName() { return authorName; }
    public abstract boolean isForSale();
    public abstract void handleDelivery(String email, String address);
}