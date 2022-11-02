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
}
