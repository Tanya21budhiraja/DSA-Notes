public class Mattrigs {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 8 },
                { 4, 5, 6, 9 },
                { 7, 8, 9, 10 },
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // row wise
        System.out.println("row wise is");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        // col wise
        System.out.println("col wise is");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        // diagonal wise
        System.out.println("Daigonal wise is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                }
            }
        }

        // print row wise ulta
        System.out.println("row ulta is");

        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // transpose

        int[][] matrix = {
                { 2, 4, -1 },
                { -10, 5, 11 },
                { 18, -7, 6 },
        };

        int n = matrix.length;
        int m = matrix[0].length;

        int[][] arr1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int a = matrix[i][j];
                arr[i][j] = a;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }

    }
}
