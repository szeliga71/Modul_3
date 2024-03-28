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

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favouriteGenre='" + favouriteGenre + '\'' +
                '}';
    }
}
