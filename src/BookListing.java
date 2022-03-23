public class BookListing {
    private Book book;
    private double price;
    public BookListing(Book b, double p) {
        book = b;
        price = p;
    }

    public void printListing() {
        book.printBookInfo();
        System.out.println(", $" + price);
    }
}
