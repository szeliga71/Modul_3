import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad2.TodoList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoListTest {

    TodoList tdl1 = new TodoList();

    String task1 = "spacer z psem";
    String task2 = "odkurzanie";
    String task3 = null;
    String task4 = "";

    @Test
    public void addTaskTest() {
        tdl1.add(task1);
        Assertions.assertTrue(tdl1.getList().contains(task1));

    }

    @Test
    public void addTaskNullTest() {
        tdl1.add(task3);
        Assertions.assertTrue(tdl1.getList().contains(task3));

    }

    @Test
    public void addEmptyTaskTest() {
        tdl1.add(task4);
        Assertions.assertTrue(tdl1.getList().contains(task4));

    }

    @Test
    public void addTwoTasksTest() {


        tdl1.add(task1);
        tdl1.add(task2);

        Assertions.assertEquals(tdl1.getList().size(), 2);
    }

    @Test
    public void addFourTaskTest() {

        tdl1.add(task1);
        tdl1.add(task2);
        tdl1.add(task3);
        tdl1.add(task4);

        Assertions.assertEquals(tdl1.getList().size(), 4);
    }

    @Test
    public void removeNumberTest() {


        tdl1.add(task1);
        tdl1.add(task2);

        tdl1.remove(1);

        Assertions.assertFalse(tdl1.getList().contains(task1));


    }

    @Test
    public void removeNumberTest2() {


        tdl1.add(task1);
        tdl1.add(task2);

        tdl1.remove(1);
        Assertions.assertEquals(1, tdl1.getList().size());
    }

    @Test
    public void removeNegativeNumberTest() {
        tdl1.add(task1);
        tdl1.add(task2);

        tdl1.remove(-6);
        Assertions.assertEquals(2, tdl1.getList().size());

    }

    @Test
    public void removeTooBigNumberTest() {
        tdl1.add(task1);
        tdl1.add(task2);

        tdl1.remove(356);
        Assertions.assertEquals(2, tdl1.getList().size());

    }

    @Test
    public void removeZeroTest() {
        tdl1.add(task1);
        tdl1.add(task2);

        tdl1.remove(0);
        Assertions.assertEquals(2, tdl1.getList().size());

    }
}
