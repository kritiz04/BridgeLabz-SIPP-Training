public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Borrowed: " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }
}
