package zad5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    Map<Author,List<Book>>libraryOperationList;

    public Library(Map<Author, List<Book>> libraryOperationList) {
        this.libraryOperationList = libraryOperationList;
    }

    public List<Book> getBooksOfAuthor(String authorName){
        return null;
    }
    public void addBookToAuthor(String authorName,Book book){

    }
    public List<Author> getAllAuthors(){

        List<Author>authorList;

        authorList= new ArrayList<>(libraryOperationList.keySet());

        return authorList;
    }
    public List<Book> getAllBooks(){
        return null;
    }
    public void getAllBooksAndAuthors(){}
    public void addAuthor(Author author){
        libraryOperationList.put(author,new ArrayList<>());
    }


}
