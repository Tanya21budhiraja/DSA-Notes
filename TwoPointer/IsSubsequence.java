package TwoPointer;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int a = 0;
        int b = 0;
        if (s.length() == 0)
            return true;

        while (a < s.length() && b < t.length()) {
            if (s.charAt(a) == t.charAt(b)) {
                a++;
                b++;
            } else {
                b++;
            }
        }
        // this is a trick what to return
        return a == s.length();
    }
}
