import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zad4.Student;
import zad5.Author;
import zad5.Book;
import zad5.Library;

import java.util.*;

public class LibraryMetodsTest {

    Map<Author, List<Book>> libraryListTest = new HashMap<>();

    Library libraryTest = new Library(libraryListTest);

    Author aut1 = new Author("Kowalski", 65, "Kryminal");
    Author aut2 = new Author("Malinowski", 39, "Romans");
    Author aut3 = new Author("Nowak", 45, "Komedia");
    Author aut4 = new Author("Kaminski", 22, "Reportaz");


    Book book1t = new Book("Lato", "Romans", 256);
    Book book2t = new Book("Miasto", "Reportaz", 184);
    Book book3t = new Book("Fabryka pustki", "Reportaz", 325);
    Book book4t = new Book("Wiosna", "Romans", 94);
    Book book5t = new Book("Lotnisko bezdomnych", "Reportaz", 238);
    Book book6t = new Book("Lawina zlota", "Kryminal", 302);
    Book book7t = new Book("Upadek szefa", "Kryminal", 412);
    Book book8t = new Book("Misiaki Psiaki", "Komedia", 187);
    Book book9t = new Book("Zagadka psiej budy", "Kryminal", 239);
    Book book10t = new Book("Zbita szyba", "Kryminal", 471);
    Book book11t = new Book("Milutek kikutek", "Komedia", 128);
    Book book12t = new Book("Jesien", "Romans", 410);
    Book book13t = new Book("Napad na Bank", "Kryminal", 653);
    Book book14t = new Book("Biala Zima", "Romans", 175);
    Book book15t = new Book("Laleczki Przepioreczki", "Komedia", 562);
    @BeforeEach
    public void prepare() {



        List<Book> kryminalTest = new ArrayList<>(Arrays.asList(book6t, book7t, book9t, book10t, book13t));

        libraryListTest.put(aut1, kryminalTest);

        List<Book> komediaTest = new ArrayList<>(Arrays.asList(book8t, book11t, book15t));

        libraryListTest.put(aut3, komediaTest);

        List<Book> romansTest = new ArrayList<>(Arrays.asList(book1t, book4t, book12t, book14t));

        libraryListTest.put(aut2, romansTest);

        List<Book> reportazTest = new ArrayList<>(Arrays.asList(book2t, book3t, book5t));

        libraryListTest.put(aut4, reportazTest);
    }


  /*      @Test
    public void getBooksOfAuthorTest(){
    String authorName="Nowak";
    String expectedOutput=" ";
    List<Book>resultList=new ArrayList<>(Arrays.asList(book8t, book11t, book15t));

        Assertions.assertEquals(expectedOutput,libraryTest.getBooksOfAuthor(authorName));
        }
*/
}
