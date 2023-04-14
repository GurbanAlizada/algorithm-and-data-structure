package task;
public class Book {
    private int id;
    private String name;
    private String authorName;
    private String genre;
    private double price;

    public Book(int id, String name, String authorName, String genre, double price) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.genre = genre;
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void sale() {
        double discountedPrice = price * 0.8;
        System.out.println("Book genre: " + genre);
        System.out.println("Book name: " + name);
        System.out.println("Discounted price: " + discountedPrice);
    }
}