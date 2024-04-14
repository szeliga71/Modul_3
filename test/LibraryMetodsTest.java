import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import zad4.Student;
import zad5.Author;
import zad5.Book;
import zad5.Library;

import java.util.*;

public class LibraryMetodsTest {



    private Map<Author, List<Book>> libraryMapTest = new HashMap<>();
    private Library libTest = new Library(libraryMapTest);
    private List<Book> source = new ArrayList<>();
    //@BeforeEach
    public void prepare() {


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

        List<Book> kryminalTest = new ArrayList<>(Arrays.asList(book6t, book7t, book9t, book10t, book13t));
        List<Book> komediaTest = new ArrayList<>(Arrays.asList(book8t, book11t, book15t));
        List<Book> romansTest = new ArrayList<>(Arrays.asList(book1t, book4t, book12t, book14t));
        List<Book> reportazTest = new ArrayList<>(Arrays.asList(book2t, book3t, book5t));


        libraryMapTest.put(aut1, kryminalTest);

        libraryMapTest.put(aut3, komediaTest);

        libraryMapTest.put(aut2, romansTest);

        libraryMapTest.put(aut4, reportazTest);

        source.addAll(reportazTest);
        source.addAll(romansTest);
        source.addAll(komediaTest);
        source.addAll(kryminalTest);
    }
/*
     public void addBookToAuthorForLoop(String authorName, Book book) {

        for (Author author : libraryOperationList.keySet()) {
            if (authorName.equals(author.getName())) {
                libraryOperationList.get(author).add(book);

            }
        }
    }
    public void addBookToAuthorStream(String authorName, Book book) {

        libraryOperationList.entrySet().stream()
                .filter(entry -> authorName.equals(entry.getKey().getName()))
                .findFirst()
                .ifPresentOrElse(
                        entry -> entry.getValue().add(book),
                        () -> System.out.println(" nie znaleziono autora o nazwisku " + authorName)
                );

    }
        public void addAuthor(Author author) {
        libraryOperationList.put(author, new ArrayList<>());
    }
    ==================================================================================================================
        public List<Book> getBooksOfAuthorToListForLoop(String authorName) {

        List<Book> authorBooks = new ArrayList<>();

        for (Map.Entry<Author, List<Book>> entry : libraryOperationList.entrySet()) {
            if (authorName.equals(entry.getKey().getName())) {
                authorBooks = entry.getValue();
            }
        }
        return authorBooks;
    }

    public List<Book> getBooksOfAuthorToListStream(String authorName) {
        return libraryOperationList.entrySet().stream()
                .filter(entry -> authorName.equals(entry.getKey().getName()))
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());
    }

    public List<Author> getAllAuthorsToList() {

        return new ArrayList<>(libraryOperationList.keySet());

    }

    public List<Book> getAllBooksToListLoopFor() {

        List<Book> allBooks = new ArrayList<>();

        for (List<Book> book : libraryOperationList.values()) {
            allBooks.addAll(book);
        }
        return allBooks;
    }

    public List<Book> getAllBooksToListStream() {

        return libraryOperationList.values().stream().flatMap(List::stream).collect(Collectors.toList());
    }
    ==================================================================================================================
 */


    @Test
    public void addBookToAuthorForLoopTest(){}                     //  arg (String authorName, Book book)
    @Test
   public void addBookToAuthorTest(){}                             // arg(String authorName, Book book)
    @Test
    public void addBookToAuthorStreamTest(){}                      // arg (String authorName, Book book)

    @Test
    public void addAuthorTest(){}                                  //Author author

    @Test
    public void getBooksOfAuthorToListForLoopTest(){}   // return List<Book>   arg (String authorName)





    @Test
    public void getBooksOfAuthorToListStreamTest(){}// return List<Book>  arg(String authorName)
    @Test
    public void getBooksOfAuthorToListStreamEmptyAuthorNameTest(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream("").toArray());
    }
    /*@Test
    public void getBooksOfAuthorToListStreamNullAuthorNameTest(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertNotEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream(null).toArray());
    }*/
    @Test
    public void getBooksOfAuthorToListStreamIllegalAuthorNameTest(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream("Maria Konpnicka ").toArray());
    }
    @Test
    public void getBooksOfAuthorToListStreamIllegalAuthorNameTest2(){
        prepare();
        Assertions.assertNotEquals(source.toArray(),libTest.getBooksOfAuthorToListStream("Maria Konpnicka ").toArray());
    }

    @Test
    public void getAllAuthorsToSetTest(){
        prepare();
        Set<Author>authors=new HashSet<>(libraryMapTest.keySet());
        Assertions.assertEquals(authors,libTest.getAllAuthorsToSet());
    }
    @Test
    public void getAllAuthorsToSetEmptyMapTest(){
        prepare();
        Set<Author>authors=new HashSet<>(libraryMapTest.keySet());
        libraryMapTest.clear();
        Assertions.assertNotEquals(authors,libTest.getAllAuthorsToSet());
    }

   /* public void getAllAuthorsToSetNullMapTest(){
        prepare();
        Set<Author>authors=new HashSet<>(libraryMapTest.keySet());
        libraryMapTest=null;
        Assertions.assertThrows(NullPointerException.class, ()-> { libTest.getAllAuthorsToSet(); });
        //Assertions.assertNotEquals(authors,libTest.getAllAuthorsToSet());
    }*/

    @Test
    public void getAllBooksToListLoopForTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        Assertions.assertArrayEquals(source.toArray(),libTest.getAllBooksToListLoopFor().toArray());
    }    //return List<Book>
    @Test
    public void getAllBooksToListForLoopEmptyMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest.clear();
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListLoopFor().toArray());
    }
    @Test
    public void getAllBooksToListForLoopNullMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest=null;
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListLoopFor().toArray());
    }

    @Test
    public void getAllBooksToListForLoopEmptyValueMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest.values().forEach(List::clear);
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListLoopFor().toArray());
    }
    @Test
    public void getAllBooksToListStreamTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        Assertions.assertArrayEquals(source.toArray(),libTest.getAllBooksToListStream().toArray());
    }
    @Test
    public void getAllBooksToListStreamEmptyMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest.clear();
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListStream().toArray());
    }
    @Test
    public void getAllBooksToListStreamNullMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest=null;
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListStream().toArray());
    }
    @Test
    public void getAllBooksToListStreamEmptyValueMapTest(){
        prepare();
        source.sort(Comparator.comparing(Book::getNumberOfPages));
        libraryMapTest.values().forEach(List::clear);
        Assertions.assertNotEquals(source.toArray(),libTest.getAllBooksToListStream().toArray());
    }





}
