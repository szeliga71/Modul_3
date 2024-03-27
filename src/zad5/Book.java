package zad5;

public class Book implements Comparable<Book>{

    private String title;
    private String genre;
    private int numberOfPages;

    public Book(String title, String genre, int numberOfPages) {
        this.title = title;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public int compareTo(Book book) {

        return Integer.compare(this.numberOfPages,book.numberOfPages);
    }
}
