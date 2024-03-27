import zad1.SumowanieTablicy;
import zad2.TodoList;
import zad3.LiczenieSlowWTekscie;
import zad4.SortowanieListy;
import zad4.Student;
import zad5.Author;
import zad5.Book;
import zad5.Library;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        // zad 1
        SumowanieTablicy st = new SumowanieTablicy();

        int[] tab = {3, 21, 9};
        System.out.println(st.sumArray(tab));

        System.out.println(st.sumArrayStr(tab));

        // zad 2

        TodoList tdl = new TodoList();

        String task1 = "posprzatac";
        String task2 = "umyc naczynia";
        String task3 = "spacer z psem";
        String task4 = "nauka angielskiego";

        tdl.add(task1);
        tdl.add(task2);
        tdl.add(task3);
        tdl.add(task4);

        tdl.print();

        tdl.remove(2);

        tdl.print();

        // zad 3

        String text = "Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea Lorem commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


        LiczenieSlowWTekscie lswt = new LiczenieSlowWTekscie();


        System.out.println(lswt.countWords(text));

        // zad 4

        Student st1 = new Student(23, 1.82, "Jan", "Kowalski");
        Student st2 = new Student(19, 1.89, "Piotr", "Nowak");
        Student st3 = new Student(22, 1.79, "Eryk", "Ptasinski");
        Student st4 = new Student(24, 1.94, "Mateusz", "Zych");
        Student st5 = new Student(27, 2.00, "Bartosz", "Kaczmarek");
        Student st6 = new Student(25, 1.65, "Matylda", "Niewiadomska");
        Student st7 = new Student(20, 1.69, "Julia", "Niewiadomska");

        List<Student> students = Arrays.asList(st1, st2, st3, st4, st5, st6,st7);


        // unsorted
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        Collections.sort(students);

        // sorted by lastName
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        SortowanieListy sortowanieListyComparator=new SortowanieListy();

        students.sort(sortowanieListyComparator);

        // sorted by age
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        students.sort(Comparator.comparing(Student::getLastName).thenComparingInt(Student::getAge));

        // sorted concurrently
        for (Student student : students) {
            System.out.println(student);
        }

        //zad 5

        Map<Author,List<Book>> libraryList=new HashMap<>();

        Library library =new Library(libraryList);


    }
}


