package Strings;

import java.util.Arrays;

public class Longest {
    public String longestCommonPrefix(String[] strs) {
        // jab string me baar baar change krna ho toh
        // we use string builder
        StringBuilder ans = new StringBuilder();

        Arrays.sort(strs);
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                break;
            }
            ans.append(strs[0].charAt(i));
        }

        return ans.toString();

    }
}
