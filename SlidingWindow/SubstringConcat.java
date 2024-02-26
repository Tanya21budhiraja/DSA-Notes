package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringConcat {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int n = words[0].length();

        // Create a map to store the counts of each word in the words array
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Loop through the possible starting positions of a word
        for (int i = 0; i < n; i++) {
            int left = i; // Left boundary of the sliding window
            int count = 0; // Count of valid words in the current window

            // Create a map to track word counts in the current window
            Map<String, Integer> curr = new HashMap<>();

            for (int j = i; j <= s.length() - n; j += n) {
                String word = s.substring(j, j + n);

                if (map.containsKey(word)) {
                    curr.put(word, curr.getOrDefault(word, 0) + 1);
                    count++;

                    // Adjust the window by removing leftmost words if necessary
                    while (curr.get(word) > map.get(word)) {
                        String leftWord = s.substring(left, left + n);
                        curr.put(leftWord, curr.get(leftWord) - 1);
                        count--;
                        left += n;
                    }

                    // If all words are found, add the starting index to the result
                    if (count == words.length) {
                        ans.add(left);
                        String leftWord = s.substring(left, left + n);
                        curr.put(leftWord, curr.get(leftWord) - 1);
                        count--;
                        left += n;
                    }
                } else {
                    // Reset the window if the current word is not in the words array
                    curr.clear();
                    count = 0;
                    left = j + n;
                }
            }
        }

        return ans;
    }
}
