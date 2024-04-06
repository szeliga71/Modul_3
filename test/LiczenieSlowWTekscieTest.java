import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad3.LiczenieSlowWTekscie;

import java.util.HashMap;
import java.util.Map;

public class LiczenieSlowWTekscieTest {

    LiczenieSlowWTekscie lstTest=new LiczenieSlowWTekscie();

    @Test
    public void chectForGivenText() {

        String testText = "Ala ma, ]]] kota,kota ma! ]]] Ala";

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Ala", 2);
        testMap.put("ma",2);
        //testMap.put("]]]",2);
        testMap.put("kota",2);

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }

}
