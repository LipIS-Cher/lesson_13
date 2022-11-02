import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner firstsName = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String firstName = firstsName.next();

        Scanner lastsName = new Scanner(System.in);
        System.out.print("Введите фамилию автора: ");
        String lastName = lastsName.next();

        Scanner booksName = new Scanner(System.in);
        System.out.print("Введите название книги: ");
        String bookName = booksName.next();

        Scanner yearPublic = new Scanner(System.in);
        System.out.print("Введите год издания книги: ");
        int yearPublication = yearPublic.nextInt();

        Author author = new Author(firstName, lastName);
        Book book = new Book(bookName, yearPublication, author);

        System.out.println("author.getFirstName() = " + author.getFirstName());
        System.out.println("author.getLastName() = " + author.getLastName());
        System.out.println("book.getBookName() = " + book.getBookName());
        System.out.println("book.getYearPublication() = " + book.getYearPublication());

        Scanner yearPublicNew = new Scanner(System.in);
        System.out.print("Введите измененный год издания книги: ");
        int yearPublicationNew = yearPublicNew.nextInt();
        book.setYearPublication(yearPublicationNew);

        System.out.println("book.getYearPublication() = " + book.getYearPublication());

    }
}