class Book {
    private static String libraryName = "Model Town Library";
    private final String isbn;
    private String title;
    private String author;


    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}


public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("506", "OOPs", "Dhruv Sharma");
        Book book2 = new Book("0906", "Data Structures", "Madhav Aggarwal");

        book1.displayBookDetails();
        book2.displayBookDetails();
        Book.displayLibraryName();
    }
}

