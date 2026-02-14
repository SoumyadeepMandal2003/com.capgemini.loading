import java.util.ArrayList;
import java.util.stream.Collections;

class Book{
    private int id;
    private String title;
    private String author;
    private int yearPublished;
    private int numberOfPages;

    public Book(int id, String title, String author, int yearPublished, int numberOfPages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{"+ "id=" + id +", title='" + title +", author='" + author +", yearPublished=" + yearPublished +", numberOfPages=" + numberOfPages +'}';
    }
}


class Library{
    private List<Book> books;
    
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if(book == null) {
            return;
        }
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        if(author == null){
            return Collections.emptyList();
        }
        String authorName = author.trim().toLowerCase();
        return books.stream().filter(book -> book.getAuthor().toLowerCase().equals(authorName)).collect(Collectors.toList());
    }

    public List<Book> findLatestBooks(int yearThreshold) {
        return books.stream().filter(book -> book.getYearPublished() > yearThreshold).collect(Collectors.toList());
    }
    
    public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring) {
        String sub = authorSubstring == null ? "" : authorSubstring.trim().toLowerCase();

    }

    public List<Book> findBooksByComplexCriteria(int year, int minPages, String authorSubstring) {
        String sub = (authorSubstring == null) ? "" : authorSubstring.trim().toLowerCase();

        return books.stream()
                .filter(b -> b.getYearPublished() > year)
                .filter(b -> b.getNumberOfPages() >= minPages)
                .filter(b -> {
                    String a = (b.getAuthor() == null) ? "" : b.getAuthor().toLowerCase();
                    return a.contains(sub);
                })
                .collect(Collectors.toList());
    }


    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book(1, "Effective Java", "Joshua Bloch", 2018, 416));
        library.addBook(new Book(2, "Clean Code", "Robert C. Martin", 2008, 464));
        library.addBook(new Book(3, "Java Concurrency in Practice", "Brian Goetz", 2006, 424));

        System.out.println("=== Books by Author (exact match) ===");
        library.findBooksByAuthor("Joshua Bloch").forEach(System.out::println);

        System.out.println("\n=== Latest Books (after 2015) ===");
        library.findLatestBooks(2015).forEach(System.out::println);

        System.out.println("\n=== Complex Criteria ===");
        System.out.println("After year: 2010, Min Pages: 450, Author contains: 'mart' (case-insensitive)");
        library.findBooksByComplexCriteria(2010, 450, "mart").forEach(System.out::println);
    }
}
}