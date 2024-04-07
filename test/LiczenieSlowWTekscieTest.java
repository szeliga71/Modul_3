import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zad3.LiczenieSlowWTekscie;

import java.util.HashMap;
import java.util.Map;

public class LiczenieSlowWTekscieTest {

    LiczenieSlowWTekscie lstTest=new LiczenieSlowWTekscie();

    @Test
    public void checkForGivenText() {

        String testText = "Ala ma kota kota ma Ala";

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Ala", 2);
        testMap.put("ma",2);
        testMap.put("kota",2);

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }
    @Test
    public void checkForGivenTextWithSpecialCharacters() {

        String testText = "Ala,ma, bialego kota,kota!ma!,bialego?Ala!";

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Ala", 2);
        testMap.put("ma",2);
        testMap.put("bialego",2);
        testMap.put("kota",2);

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }
    @Test
    public void checkForGivenTextEmpty() {

        String testText ="";;

        Map<String, Integer> testMap = new HashMap<>();

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }
    @Test
    public void checkForGivenTextNull() {

        String testText =null;

        Map<String, Integer> testMap = new HashMap<>();

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }

    @Test
    public void checkForGivenTextOneWord() {

        String testText ="Matylda";

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("Matylda",1);

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }
    @Test
    public void checkForGivenTextManyIdenticalWords() {

        String testText ="las las las las las ";

        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("las",5);

        Assertions.assertEquals(lstTest.countWords(testText), testMap);

    }

}
