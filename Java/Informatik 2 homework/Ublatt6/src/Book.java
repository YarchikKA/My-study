import java.time.LocalDate;
import java.util.Objects;

public class Book {
    final private String author;
    final private String title;
    private LocalDate returnDate;
    private boolean bookInBib;

    public Book(String author, String title) throws IllegalLoanException {
        if (author == null || author.isEmpty()) {
            throw new IllegalLoanException("not correct name");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalLoanException("not correct tittle");
        }
        this.author = author;
        this.title = title;
        this.returnDate = null;
        this.bookInBib = true;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReturnDate() throws IllegalLoanException {
        if (bookInBib) {
            throw new IllegalLoanException("the book is in bibliothek");
        }
        return returnDate;
    }

    public boolean isBookInBib() {
        return bookInBib;
    }

    public void returnBook() throws IllegalLoanException {
        if (bookInBib) {
            throw new IllegalLoanException("the book is in bibliothek");
        }
        this.returnDate = null;
        this.bookInBib = true;
    }

    public void takeBook() throws IllegalLoanException {
        if (!bookInBib) {
            throw new IllegalLoanException("the book is not in bibliothek");
        }
        this.returnDate = LocalDate.now().plusDays(14);
        this.bookInBib = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Book b = (Book) obj;
        return Objects.equals(this.title, b.title);
    }

    public String toString() {
        return author + ": " + title + ".";
    }
}
