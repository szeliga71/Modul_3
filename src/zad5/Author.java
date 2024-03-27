package zad5;

public class Author {

    private String name;
    private int age;
    private String favouriteGenre;


    public Author(String name, int age, String favouriteGenre) {
        this.name = name;
        this.age = age;
        this.favouriteGenre = favouriteGenre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }
}
