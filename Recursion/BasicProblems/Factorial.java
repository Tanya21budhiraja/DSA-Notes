package Recursion.BasicProblems;

public class Factorial {
    static int f(int n) {
        if (n == 1) {
            return 1;
        }
        return n * f(n - 1);

    }

    public static void main(String[] args) {
        // 5 = 5* 4* 3* 2* 1
        System.out.println(f(5));
    }
}
