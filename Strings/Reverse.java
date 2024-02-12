package Strings;

public class Reverse {
    public String reverseWords(String s) {
        // split function alag h isme
        String[] str = s.trim().split("\\s+");
        String ans = "";
        for (int i = str.length - 1; i > 0; i--) {
            ans += str[i] + " ";
        }
        return ans + str[0];

    }
}
