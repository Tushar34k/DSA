package org.example.array;

import java.util.*;

public class FindConcatenatedSubstringIndices {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        // Frequency map for the words
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Loop over all possible starting points within a word length window
        for (int i = 0; i < wordLength; i++) {
            int left = i, right = i;
            int count = 0;
            Map<String, Integer> seen = new HashMap<>();

            while (right + wordLength <= s.length()) {
                String currentWord = s.substring(right, right + wordLength);
                right += wordLength;

                if (wordFreq.containsKey(currentWord)) {
                    seen.put(currentWord, seen.getOrDefault(currentWord, 0) + 1);
                    count++;

                    while (seen.get(currentWord) > wordFreq.get(currentWord)) {
                        String leftWord = s.substring(left, left + wordLength);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    if (count == wordCount) {
                        result.add(left);
                    }

                } else {
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        String s1 = "barfoothefoobarman";
        String[] words1 = {"foo", "bar"};
        System.out.println("Input: " + s1);
        System.out.println("Words: " + Arrays.toString(words1));
        System.out.println("Output: " + findSubstring(s1, words1));

        String s2 = "barfoofoobarthefoobarman";
        String[] words2 = {"bar", "foo", "the"};
        System.out.println("Input: " + s2);
        System.out.println("Words: " + Arrays.toString(words2));
        System.out.println("Output: " + findSubstring(s2, words2));
    }
}
