package Recursion;
// RECURSION MEANS A FUNCTION CALLING ITSELF UNTIL A SPECIFIC CONDITION IS MET

public class Theory {

    static void f() {
        System.out.println("1");
        f();

    }

    static int count = 0;

    static void add() {
        while (count < 6) { // to prevent infinite recursion === base condition
            System.out.println(count);
            count++;

            add();
        }

    }

    public static void main(String[] args) {
        // for (int i = 0; i < 6; i++) {
        // f();
        // }

        // f();
        add();
    }

    // THIS WILL GIVE U AN INFINITE RECURSION BEACUSE U HAVE NOT MENTIONED ANY BASE
    // CASE

    // BASE CASE IS NECCESARY
}
