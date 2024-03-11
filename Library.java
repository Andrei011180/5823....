import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Book<String>, LibraryCard<Integer, String>> issuedBooks;

    public Library() {
        issuedBooks = new HashMap<>();
    }

    public void addBook(Book<String> book, LibraryCard<Integer, String> card) {
        issuedBooks.put(book, card);
    }

    public void issueLibraryCard(Book<String> book, LibraryCard<Integer, String> card) {
        addBook(book, card);
    }
    public void displayIssuedBooks() {
        for (Map.Entry<Book<String>, LibraryCard<Integer, String>> entry : issuedBooks.entrySet()) {
            System.out.println("Book: " + entry.getKey().getTitle() + ", Card Number: " + entry.getValue().getCardNumber() + ", Book Info: " + entry.getValue().getBookInfo());
        }
    }
}