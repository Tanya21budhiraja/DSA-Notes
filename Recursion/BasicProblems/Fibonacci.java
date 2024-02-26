package Recursion.BasicProblems;

public class Fibonacci {
    // 0 1 1 2 3
    // (n-1) + (n-2)
    static int f(int n) {
        if (n <= 1) {
            return n;
        }
        return f(n - 1) + f(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(f(4));

    }

}
