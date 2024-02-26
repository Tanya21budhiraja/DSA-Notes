package Recursion.BasicProblems;

public class Print1toN {
    // By recursion
    static void f(int i, int n) {
        if (i >= n) {
            return;
        }
        System.out.println(i);
        f(i + 1, n);
    }
    // by backtracking

    static void f1(int i, int n) {
        if (i < 1) {
            return;
        }

        f1(i - 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        // f(1, 6);
        f1(5, 5);
    }
}
