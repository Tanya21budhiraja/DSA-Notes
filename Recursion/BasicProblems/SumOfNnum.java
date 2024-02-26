package Recursion.BasicProblems;

public class SumOfNnum {
    // parametrised
    static void f(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        f(i - 1, sum + i);
    }

    // functional
    static int f1(int n) {
        if (n == 0) {
            return 0;

        }
        return n + f1(n - 1);
    }

    public static void main(String[] args) {
        f(3, 0);
        System.out.println(f1(3));
    }
}
