package task;

public class Main4 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "To Kill a Mockingbird", "Harper Lee", "Classics", 20.99);
        Book book2 = new Book(2, "The Catcher in the Rye", "J.D. Salinger", "Fiction", 18.99);
        Book book3 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", "Classics", 24.99);

        book1.sale();
        book2.sale();
        book3.sale();
    }
}