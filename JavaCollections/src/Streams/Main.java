package Streams;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("J.R.R Tolken", "The Hobbit"));
        books.add(new Book("J.R.R Tolken", "The Lord of The Rings"));
        books.add(new Book("J.K Rollings", "The Game of Thrones"));
        books.add(new Book("J.K Rollings", "The House of Dragons"));
        Library library =  new Library(books);

        library.getBooks().stream().forEach(System.out::println);

        library.getBooks().stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);

    }
}
