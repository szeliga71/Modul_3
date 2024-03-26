import java.util.Arrays;

public class SumowanieTablicy {


    public int sumArray(int[] numbers) {

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


     public int sumArrayStr(int[] numbers) {
       return Arrays.stream(numbers).sum();
    }

}
