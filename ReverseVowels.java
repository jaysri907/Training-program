package Apexon;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();

        // Step 1: Collect the vowels from the string
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

        // Step 2: Reverse the list of vowels
        StringBuilder reversedVowels = new StringBuilder();
        for (int i = vowels.size() - 1; i >= 0; i--) {
            reversedVowels.append(vowels.get(i));
        }

        // Step 3: Reconstruct the string with reversed vowels
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(reversedVowels.charAt(vowelIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String input = "hello world";
        String output = reverseVowels(input);
        System.out.println("Original String: " + input);
        System.out.println("String with Reversed Vowels: " + output); // Output: "holle werld"
    }
}

