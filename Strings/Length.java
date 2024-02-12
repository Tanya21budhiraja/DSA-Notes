package Strings;

public class Length {
    public int lengthOfLastWord(String s) {
        // trim is main factor
        String str = s.trim();
        int ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                return ans;
            } else {
                ans++;
            }

        }
        return ans;

    }

}
