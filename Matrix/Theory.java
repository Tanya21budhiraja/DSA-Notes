package Matrix;

import java.util.*;

public class Theory {
    public static void main(String[] args) {
        // 1d array
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));

        // 2d array

        // int[][] arr1 = new int[6][];
        // *only rows are req [size]
        int[][] arr2 = {
                { 2, 3, 4 },
                { 5, 6, 7 }
        };

        // to print row wise
        for (int rows = 0; rows < arr2.length; rows++) {
            for (int cols = 0; cols < arr2[rows].length; cols++) {
                System.out.print(arr2[rows][cols] + " ");
            }
            System.out.println();
        }
        // to print col wise
        for (int col = 0; col < arr2[0].length; col++) {
            for (int row = 0; row < arr2.length; row++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }

        int[][] arr3 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        // to print daigonals

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                if (row == col) {
                    System.out.print(arr3[row][col] + " ");
                }
            }
        }

        // to print
        // { 3 , 2 , 1}
        // { 6 , 5 , 4}
        // { 9 , 8 , 7}

        // to print row wise reverse

        for (int rows = 0; rows < arr3.length; rows++) {
            for (int cols = arr3[rows].length - 1; cols >= 0; cols--) {
                System.out.print(arr3[rows][cols] + " ");
            }
            System.out.println();
        }

        // to print col wise reverse
        //  0 1  2
        // 0{ 7 4 1}
        // 1 { 8 5 2}
        // 2{ 9 6 3}

        for (int col = 0; col < arr3[0].length; col++) {
            for (int row = arr3.length - 1; row >= 0; row--) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

        // to print daigonal wise reverse
        // { 9, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 1 },

        for (int row = arr3.length - 1; row >= 0; row--) {
            for (int col = 0; col < arr3[row].length; col++) {
                if (row == col) {
                    System.out.println(arr3[row][col]);
                }
            }
        }

        // to print zizzag
        for (int rows = 0; rows < arr3.length; rows++) {
            if (rows % 2 != 0) {
                for (int cols = arr3[rows].length - 1; cols >= 0; cols--) {
                    System.out.print(arr3[rows][cols] + " ");
                }
                System.out.println();
            } else {
                for (int cols = 0; cols < arr3[rows].length; cols++) {
                    System.out.print(arr3[rows][cols] + " ");
                }
                System.out.println();
            }
        }
    }
}