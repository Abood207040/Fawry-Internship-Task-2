/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fawrytask2;

import com.mycompany.fawrytask2.Services.MailService;

/**
 *
 * @author HP
 */
public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String authorName, String fileType) {
        super(isbn, title, year, price, authorName);
        this.fileType = fileType;
    }
    public String getFileType() { return fileType; }
    @Override
    public boolean isForSale() { return true; }
    @Override
    public void handleDelivery(String email, String address) {
        MailService.send(title, email);
    }
}
