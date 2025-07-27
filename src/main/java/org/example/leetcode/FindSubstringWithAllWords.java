package org.example.leetcode;

import java.util.*;


/**
 * Problem: FindSubstringWithAllWords
 * Author: Tushar Kokane
 * Date: 2025-07-27
 *
 * Time Complexity: O(n^3)
 * Space Complexity: O(1) (excluding output list)
 */

public class FindSubstringWithAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> resultIndices = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return resultIndices;

        int wordLength = words[0].length();
        int totalWords = words.length;
        int substringLength = wordLength * totalWords;

        // Frequency map of given words
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Iterate through all possible starting points
        for (int i = 0; i <= s.length() - substringLength; i++) {
            Map<String, Integer> wordsSeen = new HashMap<>();
            int j = 0;

            // Check every word-sized chunk in the substring
            while (j < totalWords) {
                int wordStartIndex = i + j * wordLength;
                String currentWord = s.substring(wordStartIndex, wordStartIndex + wordLength);

                if (!wordCountMap.containsKey(currentWord)) {
                    break;
                }

                wordsSeen.put(currentWord, wordsSeen.getOrDefault(currentWord, 0) + 1);

                if (wordsSeen.get(currentWord) > wordCountMap.get(currentWord)) {
                    break;
                }

                j++;
            }

            if (j == totalWords) {
                resultIndices.add(i);
            }
        }

        return resultIndices;
    }

    // For testing the implementation
    public static void main(String[] args) {
        FindSubstringWithAllWords solution = new FindSubstringWithAllWords();

        System.out.println(solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})); // Output: [0, 9]
        System.out.println(solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"})); // Output: []
        System.out.println(solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"})); // Output: [6, 9, 12]
    }
}
