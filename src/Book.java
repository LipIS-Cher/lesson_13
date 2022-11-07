import java.util.Objects;

public class Book {
    private final String bookName;
    private int yearPublication;

    public Author author;

    public Book(String bookName, int yearPublication, Author author) {
        this.bookName = bookName;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return Objects.equals(bookName, book.bookName) && Objects.equals(yearPublication, book.yearPublication) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return bookName + yearPublication + author;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublication, author);
    }
}
