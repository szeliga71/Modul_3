import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad1.SumowanieTablicy;

public class TestSumowanieTablicy {

    SumowanieTablicy stTest=new SumowanieTablicy();



    @Test
    public void testArraySum(){
        int []testTab={1,3,5};
        Assertions.assertEquals(9,stTest.sumArray(testTab));
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

}
