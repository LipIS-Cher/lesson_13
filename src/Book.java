public class Book {
    private final String bookName;
    private int yearPublication;



    public Book(String bookName, int yearPublication) {
        this.bookName = bookName;
        this.yearPublication = yearPublication;
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
