package Recursion.BasicProblems;

public class PrintNto1 {
    // by recursion
    static void f(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        f(n - 1);
    }

    // by backtrack
    static void f1(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        f1(i - 1, n);
    }

    public static void main(String[] args) {
        // f(6);
        f1(5, 5);
    }
}
