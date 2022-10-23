package Lab1.SRP;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Books> books = new ArrayList<>();

    public void addBookToLibrary(Books book){
        books.add(book);
        System.out.println("Book, " + book.getTitle() + ", is added to library!");
    }

    public void printListOfBooks(){
        int i = 1;
        System.out.println("List of book present in the library: ");
        for (Books book : books) {
            System.out.println("Book nr. " + i + " " +book.getTitle());
            i++;
        }
    }
}
