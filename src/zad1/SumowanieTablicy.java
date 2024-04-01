package zad1;

import java.util.Arrays;

public class SumowanieTablicy {


    public int sumArray(int[] numbers) {

        int sum = 0;

        if(numbers.length>0){

        for (int number : numbers) {
            if(number<=0){
                System.out.println(" dostarczona tablica nie zawiera tylko liczb naturalnych");
                sum=0;
                break;
            }else{
            sum += number;}
        }

        }
        return sum;
    }


/*     public int sumArrayStr(int[] numbers) {
       return Arrays.stream(numbers).sum();
    }*/

}
