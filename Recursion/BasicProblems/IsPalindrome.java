package Recursion.BasicProblems;

public class IsPalindrome {
    static boolean f(int i, int n, String s) {
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return f(i + 1, n, s);

    }

    public static void main(String[] args) {
        String s = "madam";
        int n = s.length();
        System.out.println(f(0, n, s));
    }
}
