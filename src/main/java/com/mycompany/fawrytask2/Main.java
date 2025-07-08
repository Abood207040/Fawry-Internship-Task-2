/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fawrytask2;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        BookStoreService store = new BookStoreService(inv);
        PaperBook pb = new PaperBook("ISBN001", "Java Basics", 2018, 120, "Abdullah Ahmed", 5);
        EBook eb = new EBook("ISBN002", "Clean Code", 2015, 90, "Roberto Carlos", "PDF");
        ShowcaseBook sb = new ShowcaseBook("ISBN003", "Design Patterns", 2012, 0, "Auc");
        ShowcaseBook op = new ShowcaseBook("ISBN004", "OOP", 2000, 0, "AAST");
        inv.addBook(pb);
        inv.addBook(eb);
        inv.addBook(sb);
        inv.addBook(op);
        inv.removeOutdatedBooks(20);
        try {
            double paid = store.buyBook("ISBN001", 2, "ahmed@gmail.com", "Cairo");
            System.out.println(paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            double paid = store.buyBook("ISBN002", 1, "ahmed@gmail.com", "Cairo");
            System.out.println(paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            store.buyBook("ISBN003", 1, "ahmed@gmail.com", "Cairo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}