import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad1.SumowanieTablicy;

public class SumowanieTablicyTest {

    SumowanieTablicy stTest=new SumowanieTablicy();



    @Test
    public void testArraySum(){
        int []testTab={1,3,5};
        Assertions.assertEquals(9,stTest.sumArray(testTab));
    }
    @Test
    public void testArraySumForNull(){
        int[]testTab=null;
        Assertions.assertEquals(0,stTest.sumArray(testTab));
    }
    @Test
    public void testArraySumForEmptyArray(){
        int[]testTab=new int[0];
        Assertions.assertEquals(0,stTest.sumArray(testTab));
    }

    @Test
    public void testArraySumForOneNegativeNumber(){
        int []testTab={1,-3,5};
        Assertions.assertEquals(0,stTest.sumArray(testTab));
    }
    @Test
    public void testArraySumForAllNegativeNumbers(){
        int []testTab={-1,-3,-5,-87};
        Assertions.assertEquals(0,stTest.sumArray(testTab));
    }
    @Test
    public void testArraySumForSingleElement(){
        int []testTab={1};
        Assertions.assertEquals(1,stTest.sumArray(testTab));
    }
    @Test
    public void testArraySumForNoElement(){
        int []testTab={};
        Assertions.assertEquals(0,stTest.sumArray(testTab));
    }
    @Test
    public void testArrayForSumMaxIntValue(){
        int[]testTab={2147483647,789,456,45222289};
        Assertions.assertEquals(2192707181L,stTest.sumArray(testTab));

    }

    @Test
    public void testArrayForSumBiggestIntValue(){
        int[]testTab={2147483647,2147483646,2147483645,2147483647};
        Assertions.assertEquals(8589934585L,stTest.sumArray(testTab));

    }

}
