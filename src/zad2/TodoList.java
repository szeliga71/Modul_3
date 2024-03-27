package zad2;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<String>list;

    public TodoList(){
        list=new ArrayList<>();
    }

    public void add(String task){
        list.add(task);
    }

    public void print(){
        for(String task:list){
            System.out.println((list.indexOf(task)+1)+". "+task);
        }
    }
    public void remove(int number){
        try{
        list.remove(number-1);}
        catch(IndexOutOfBoundsException e){
            System.out.println(" prosze podac wlasciwa pozycje do usuniecia !");
        }
    }
}
