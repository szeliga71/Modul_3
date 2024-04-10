package zad2;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String>list;

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

        if((number-1>=0)&&(number-1 < list.size())){
        list.remove(number-1);
        }else {
            System.out.println(" prosze podac wlasciwy numer !");
        }

        }

    public List<String> getList() {
        return list;
    }
}

