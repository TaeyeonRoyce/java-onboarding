package onboarding;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static String solution(String word) {

        Map<Character, Character> treeFrogDictionary = getTreeFrogDictionary();

        char[] chars = word.toCharArray();

        StringBuilder answerString = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            answerString.append(treeFrogDictionary.getOrDefault(chars[i], chars[i]));
        }

        return answerString.toString();
    }

    private static Map<Character, Character> getTreeFrogDictionary() {
        Map<Character, Character> treeFrogDictionary = new HashMap<>();
        char from = 'A';
        char to = 'Z';
        for (int i = 0; i < 26; i++) {
            treeFrogDictionary.put((char)(from + i), (char)(to - i));
        }

        from = 'a';
        to = 'z';
        for (int i = 0; i < 26; i++) {
            treeFrogDictionary.put((char)(from + i), (char)(to - i));
        }

        return treeFrogDictionary;
    }
}
