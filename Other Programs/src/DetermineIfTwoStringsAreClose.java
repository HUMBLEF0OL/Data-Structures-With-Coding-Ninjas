import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet()))
            return false;

        ArrayList<Integer> l1 = new ArrayList<>(map1.values());
        ArrayList<Integer> l2 = new ArrayList<>(map2.values());

        if (l1.size() != l2.size()) {
            return false;
        }

        Collections.sort(l1);
        Collections.sort(l2);

        return l1.equals(l2);

    }

    public static void main(String[] args) {
        String str1 = "uau";
        String str2 = "ssx";
        boolean result = closeStrings(str1, str2);
        System.out.println(result);

    }
}