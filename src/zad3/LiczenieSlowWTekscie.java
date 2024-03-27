package zad3;

import java.util.HashMap;
import java.util.Map;

public class LiczenieSlowWTekscie {

    public Map<String, Integer> countWords(String text) {

        Map<String, Integer> mapOfWords = new HashMap<>();

        String[] words = text.split("[^a-zA-Z0-9]+");


        for (String word : words) {

            if (mapOfWords.containsKey(word)) {
                mapOfWords.merge(word,1,Integer::sum);
            } else {
                mapOfWords.put(word, 1);
            }
        }
        return mapOfWords;}
}
