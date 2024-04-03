import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zad4.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class SortowanieListyTest {


    Student st1 = new Student(23, 1.82, "Jan", "Kowalski");
    Student st2 = new Student(19, 1.89, "Piotr", "Nowak");
    Student st3 = new Student(22, 1.79, "Eryk", "Ptasinski");
    Student st4 = new Student(24, 1.94, "Mateusz", "Zych");
    Student st5 = new Student(27, 2.00, "Bartosz", "Kaczmarek");
    Student st6 = new Student(25, 1.65, "Matylda", "Niewiadomska");
    Student st7 = new Student(20, 1.69, "Julia", "Niewiadomska");

    List<Student> studentsTestBefore = Arrays.asList(st1, st2, st3, st4, st5, st6, st7);
    List<Student> studentsTestAfter = new ArrayList<>(studentsTestBefore);

    @BeforeEach
    public void prepare() {
        List<Student> studentsTestBefore = Arrays.asList(st1, st2, st3, st4, st5, st6, st7);
        List<Student> studentsTestAfter = new ArrayList<>(studentsTestBefore);

    }

    @Test
    public void arrayComparisonTestAfterSort(){
        Collections.sort(studentsTestBefore);
        Assertions.assertArrayEquals(studentsTestBefore.toArray(), studentsTestAfter.toArray());
    }
    @Test
    public void arrayComparisonTestBeforeSort(){
        Assertions.assertArrayEquals(studentsTestBefore.toArray(), studentsTestAfter.toArray());
    }
}
