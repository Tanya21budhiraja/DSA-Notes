package Recursion.BasicProblems;

public class PrintName {
    // PRINT NAME i TIMES
    static void f(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("tanya");
        f(i + 1, n);
    }

    public static void main(String[] args) {
        // int n = 5;
        f(0, 5);
    }
}
