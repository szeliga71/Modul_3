import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad5.Author;
import zad5.Book;
import zad5.Library;
import java.util.*;
import java.util.stream.Collectors;

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



    @Test
    public void addBookToAuthorForLoopAllOkTest(){
        prepare();
        Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream("Malinowski",bookTest);
        List<Book>malinowskiBook=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Malinowski"))
                .flatMap(entry->entry.getValue()
                        .stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertArrayEquals(malinowskiBook.toArray(),libTest.getBooksOfAuthorToListForLoop("Malinowski").toArray());
    }
    @Test
    public void addBookToAuthorForLoopNullAuthorTest() {
        prepare();
    Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream(null,bookTest);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }

    @Test
    public void addBookToAuthorForLoopEmptyAuthorTest() {
        prepare();
        Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream("",bookTest);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void addBookToAuthorForLoopEmptyAuthorNullBookTest() {
        prepare();
        libTest.addBookToAuthorStream("",null);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }

    @Test
    public void addBookToAuthorStreamAllOKTest(){
        prepare();
        Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream("Malinowski",bookTest);
        List<Book>malinowskiBook=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Malinowski"))
                .flatMap(entry->entry.getValue()
                        .stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertArrayEquals(malinowskiBook.toArray(),libTest.getBooksOfAuthorToListStream("Malinowski").toArray());
    }
    @Test
    public void addBookToAuthorStreamNullAuthorTest(){
        prepare();
        Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream(null,bookTest);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void addBookToAuthorStreamEmptyAuthorTest(){
        prepare();
        Book bookTest=new Book("TestBook","Romans",987);
        libTest.addBookToAuthorStream("",bookTest);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void addBookToAuthorStreamEmptyAuthorNullBookTest(){
        prepare();
        libTest.addBookToAuthorStream("",null);
        Assertions.assertNotEquals(null,libTest.getBooksOfAuthorToListStream(null).toArray());
    }

    @Test
    public void addAuthorNewAuthorTest(){
        prepare();
        Author authorTest=new Author("Sienkiewicz",55,"kryminal");
        libraryMapTest.put(authorTest,new ArrayList<>());
        Assertions.assertEquals(libraryMapTest.keySet(),libTest.getAllAuthorsToSet());
    }
    @Test
    public void addAuthorNewAuthorTest1(){
        prepare();
        Author authorTest=new Author("Sienkiewicz",55,"kryminal");
        libTest.addAuthor(authorTest);
        Assertions.assertEquals(libraryMapTest.keySet(),libTest.getAllAuthorsToSet());
    }
    @Test
    public void addAuthorNullAuthorTest(){
        prepare();
        libTest.addAuthor(null);
        Assertions.assertEquals(libraryMapTest.keySet(),libTest.getAllAuthorsToSet());
    }
    @Test
    public void addAuthorMapNullTest(){
        prepare();
        Author authorTest=new Author("Sienkiewicz",55,"kryminal");
        libraryMapTest=null;
        libTest.addAuthor(authorTest);
        Assertions.assertNotEquals(null,libTest.getAllAuthorsToSet());
    }

    /*public void addAuthor(Author author) {
        libraryOperationList.put(author, new ArrayList<>());*/

    @Test
    public void getBooksOfAuthorToListForLoopAllOKTest() {
        prepare();
        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Malinowski")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertArrayEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream("Malinowski").toArray());
    }

    @Test
    public void getBooksOfAuthorToListNullAuthorNameTest() {
        prepare();
        List<Book> booksEmpty = new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(), libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void getBooksOfAuthorToListIllegalAuthorNameTest() {
        prepare();
        List<Book> booksEmpty = new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(), libTest.getBooksOfAuthorToListStream("Max Kolonko").toArray());
    }
    @Test
    public void getBooksOfAuthorToListEmptyAuthorNameTest() {
        prepare();
        List<Book> booksEmpty = new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(), libTest.getBooksOfAuthorToListStream("").toArray());
    }

    @Test
    public void getBooksOfAuthorToListForLoopNullAuthorNameTest() {
        prepare();
        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Nowak")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertNotEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void getBooksOfAuthorToListForLoopEmptyAuthorNameTest() {
        prepare();

        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Nowak")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertNotEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream("").toArray());
    }
    @Test
    public void getBooksOfAuthorToListForLoopIllegalAuthorNameTest() {
        prepare();

        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Nowak")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertNotEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream("Strus Pedziwiatr").toArray());
    }
    @Test
    public void getBooksOfAuthorToListStreamAllOkTest(){
        prepare();
        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Malinowski")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());
        Assertions.assertArrayEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream("Malinowski").toArray());
    }
     @Test
    public void getBooksOfAuthorToListStreamNullAuthorNameTest1(){
        prepare();
        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Malinowski")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());

        Assertions.assertNotEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream(null).toArray());
    }
    @Test
    public void getBooksOfAuthorToListStreamNullAuthorNameTest2(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream(null).toArray());
    }
     @Test
    public void getBooksOfAuthorToListStreamEmptyAuthorNameTest1(){
        prepare();
        List<Book>malinowskiBooks=libraryMapTest.entrySet().stream()
                .filter(key->key.getKey().getName().equals("Kowalski")).
                flatMap(entry->entry.getValue().stream()).sorted()
                .collect(Collectors.toList());

        Assertions.assertNotEquals(malinowskiBooks.toArray(),libTest.getBooksOfAuthorToListStream("").toArray());
    }
    @Test
    public void getBooksOfAuthorToListStreamEmptyAuthorNameTest(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertArrayEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream("").toArray());
    }
    @Test
    public void getBooksOfAuthorToListStreamNullAuthorNameTest(){
        prepare();
        List<Book>booksEmpty=new ArrayList<>();
        Assertions.assertNotEquals(booksEmpty.toArray(),libTest.getBooksOfAuthorToListStream(null).toArray());
    }
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

   @Test
    public void getAllAuthorsToSetNullMapTest(){
        prepare();
        Set<Author>authors=new HashSet<>(libraryMapTest.keySet());
        libraryMapTest=null;
        Assertions.assertEquals(authors,libTest.getAllAuthorsToSet());
    }

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
