package Matrix;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    fill(matrix, i, j, n, m);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 99999) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void fill(int[][] matrix, int i, int j, int n, int m) {
        for (int col = 0; col < m; col++) {
            if (matrix[i][col] != 0) {
                matrix[i][col] = 99999;
            }
        }

        for (int row = 0; row < n; row++) {
            if (matrix[row][j] != 0) {
                matrix[row][j] = 99999;
            }
        }
    }
}
