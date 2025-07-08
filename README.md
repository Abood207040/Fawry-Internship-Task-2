# Fawry-Internship--Task-2

## Project Description

**Book Store** is a modular Java application designed to simulate the core operations of a modern online bookstore. The system supports multiple book types—including physical books, eBooks, and showcase/demo books—while providing robust inventory management and purchase workflows.

The project demonstrates object-oriented design principles, such as inheritance and polymorphism, to ensure extensibility and maintainability. It features:

- **Inventory Management:** Add, remove, and query books in stock, with the ability to automatically remove outdated titles based on publication year.
- **Purchase Operations:** Buy books by ISBN, with logic to handle stock validation, payment calculation, and delivery via shipping or email, depending on the book type.
- **Service Integration:** Simulated integration with shipping and email services for order fulfillment.
- **Extensible Architecture:** Easily add new book types or services by extending the existing class hierarchy.

This project is ideal for demonstrating foundational Java programming skills, including class design, exception handling, and basic service abstraction. It is suitable for educational purposes, internships, or as a starting point for more advanced e-commerce systems.

## Project Structure

- `Book.java` - Abstract base class for all books
- `PaperBook.java`, `EBook.java`, `ShowcaseBook.java` - Book types
- `Inventory.java` - Manages books
- `BookStoreService.java` - Handles buying logic
- `Services/` - Contains `MailService` and `ShippingService` (stubs)
- `Main.java` - Demo and test class

## 🖥 Screenshots

### ✅ Example: Successful Paper Book Purchase
![Screenshot Task 2](screenshots/Screenshot%20Task%202.png)

---

## Technologies Used

- Java

