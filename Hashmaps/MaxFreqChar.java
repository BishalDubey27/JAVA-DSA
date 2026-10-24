import java.util.HashMap;
import java.util.Map;
import java.util.*;

class MaxFreqChar {
    public static void main(String[] args) {
        String s = "banana";

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        char result = ' ';
        int max = 0;

        // Find the character with maximum frequency
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        System.out.println("Character: " + result);
        System.out.println("Frequency: " + max);
    }
}