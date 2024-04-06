package zad5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    private Map<Author,List<Book>>libraryOperationList;

    public Library(Map<Author, List<Book>> libraryOperationList) {

        this.libraryOperationList = libraryOperationList;
    }



    public void getBooksOfAuthor(String authorName){


        for(Author author:libraryOperationList.keySet()){
            if(authorName.equals(author.getName())){
                libraryOperationList.get(author).forEach(System.out::println);

            }
        }

      /*  libraryOperationList.keySet().stream()
                .filter(key->authorName.equals(key.getName()))
                .map(libraryOperationList::get)
                .flatMap(List::stream)
                .forEach(System.out::println);*/


    }
    public void addBookToAuthor(String authorName,Book book){


        for(Author author:libraryOperationList.keySet()){
            if(authorName.equals(author.getName())){
                libraryOperationList.get(author).add(book);

            }
        }

        // wersja stream
   /*     libraryOperationList.entrySet().stream()
                .filter(entry->authorName.equals(entry.getKey().getName()))
                .findFirst()
                .ifPresentOrElse(
                        entry->entry.getValue().add(book),
                        ()-> System.out.println(" nie znaleziono autora o nazwisku "+authorName)
                );*/

    }




    public void getAllAuthors() {

      //  libraryOperationList.keySet().forEach(System.out::println);

        for(Author author:libraryOperationList.keySet()){
            System.out.println(author);
        }

    }

    public void getAllBooks(){

        libraryOperationList.values().stream().flatMap(List::stream).sorted(Comparator.comparing(Book::getNumberOfPages)).forEach(System.out::println);



        /*for (Map.Entry<Author, List<Book>> entry :libraryOperationList.entrySet()){
            System.out.println(entry.getValue());
        }*/


    }

    public void getAllBooksAndAuthors(){

        libraryOperationList.entrySet().stream().forEach(System.out::println);



       /* for (Map.Entry<Author, List<Book>> entry :libraryOperationList.entrySet()){
            System.out.println(entry.toString());
        }*/


    }


    public void addAuthor(Author author){
        libraryOperationList.put(author,new ArrayList<>());
    }

//===================================================================


public List<Book> getBooksOfAuthorToList(String authorName){

    List<Book>authorBooks=new ArrayList<>();

    for(Map.Entry<Author,List<Book>>entry:libraryOperationList.entrySet()){
        if(authorName.equals(entry.getKey().getName())){
            authorBooks=entry.getValue();
        }
    }

    return libraryOperationList.entrySet().stream()
            .filter(entry->authorName.equals(entry.getKey().getName()))
            .flatMap(entry->entry.getValue().stream())
            .collect(Collectors.toList());

    //return authorBooks;
}
    public List<Author> getAllAuthorsToList(){

        return new ArrayList<>(libraryOperationList.keySet());

    }
    public List<Book> getAllBooksToList(){

        List <Book> allBooks=new ArrayList<>();

        for(List<Book>book:libraryOperationList.values()){
            allBooks.addAll(book);


            libraryOperationList.values().stream().flatMap(List::stream).collect(Collectors.toList());
        }

        return libraryOperationList.values().stream().flatMap(List::stream).collect(Collectors.toList()); }
}
