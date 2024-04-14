package zad5;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Library {

    private Map<Author, List<Book>> libraryOperationList;

    public Library(Map<Author, List<Book>> libraryOperationList) {

        this.libraryOperationList = libraryOperationList;
    }

    public void getBooksOfAuthorForLoop(String authorName) {

        for (Author author : libraryOperationList.keySet()) {
            if (authorName.equals(author.getName())) {
                libraryOperationList.get(author).forEach(System.out::println);

            }
        }
    }
    public void getBooksOfAuthorStream(String authorName) {
        libraryOperationList.keySet().stream()
                .filter(key -> authorName.equals(key.getName()))
                .map(libraryOperationList::get)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
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

    public void getAllAuthors() {

        //  libraryOperationList.keySet().forEach(System.out::println);

        for (Author author : libraryOperationList.keySet()) {
            System.out.println(author);
        }

    }

    public void getAllBooks() {
        libraryOperationList.values().stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparing(Book::getNumberOfPages))
                .forEach(System.out::println);

    }

    public void getAllBooksENTRYSET() {
        for (Map.Entry<Author, List<Book>> entry : libraryOperationList.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void getAllBooksAndAuthors() {

        libraryOperationList.entrySet().stream()
                .forEach(System.out::println);

    }

    public void getAllBooksAndAuthorsENTRYSET() {
        for (Map.Entry<Author, List<Book>> entry : libraryOperationList.entrySet()) {
            System.out.println(entry.toString());
        }

    }

    public void addAuthor(Author author) {
        libraryOperationList.put(author, new ArrayList<>());
    }

//========================================================================
//========================Metody zwracajace wynik poszukiwan =============

    public List<Book> getBooksOfAuthorToListForLoop(String authorName) {

        List<Book> authorBooks = new ArrayList<>();

        if (authorName != null && !authorName.isEmpty()) {
        for (Map.Entry<Author, List<Book>> entry : libraryOperationList.entrySet()) {
            if (authorName.equals(entry.getKey().getName())) {
                authorBooks = entry.getValue();
            }
        }
            return authorBooks;
        }else{System.out.println("prosze podac prawidlowy argument");}

        return authorBooks;
    }

    public List<Book> getBooksOfAuthorToListStream(String authorName) {
        return libraryOperationList.entrySet().stream()
                .filter(entry -> authorName.equals(entry.getKey().getName()))
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.toList());
    }

    public Set<Author> getAllAuthorsToSet() {

        if(libraryOperationList==null){
            throw new NullPointerException(" Mapa nie istnieje jest nullem!");
        }
        return new HashSet<>(libraryOperationList.keySet());

    }

    public List<Book> getAllBooksToListLoopFor() {

        List<Book> allBooks = new ArrayList<>();

        for (List<Book> book : libraryOperationList.values()) {
            allBooks.addAll(book);
        }
        allBooks.sort(Comparator.comparing(Book::getNumberOfPages));
        return allBooks;
    }

    public List<Book> getAllBooksToListStream() {

        return libraryOperationList.values().stream().flatMap(List::stream).sorted(Comparator.comparing(Book::getNumberOfPages)).collect(Collectors.toList());
    }


}
