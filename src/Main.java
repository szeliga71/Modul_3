public class Main {
    public static void main(String[] args) {


        SumowanieTablicy st=new SumowanieTablicy();

        int[] tab = {3, 21, 9};
        System.out.println(st.sumArray(tab));

        System.out.println(st.sumArrayStr(tab));

        TodoList tdl=new TodoList();

        String task1="posprzatac";
        String task2="umyc naczynia";
        String task3="spacer z psem";
        String task4="nauka angielskiego";

        tdl.add(task1);
        tdl.add(task2);
        tdl.add(task3);
        tdl.add(task4);

        tdl.print();

        tdl.remove(2);

        tdl.print();

        String text="Lorem ipsum dolor sit amet," +
                " consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea Lorem commodo consequat." +
                " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";


        LiczenieSlowWTekscie lswt=new LiczenieSlowWTekscie();


        System.out.println(lswt.countWords(text));
    }
}


