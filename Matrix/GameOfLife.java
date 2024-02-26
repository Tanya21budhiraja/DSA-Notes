package Matrix;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[] dRow = { -1, -1, 0, 1, 1, 1, 0, -1 };
        int[] dCol = { 0, 1, 1, 1, 0, -1, -1, -1 };

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                int liveCount = 0;
                for (int k = 0; k < 8; k++) {
                    int nRow = row + dRow[k];
                    int nCol = col + dCol[k];

                    if (isValid(board, nRow, nCol, n, m) && Math.abs(board[nRow][nCol]) == 1) {
                        liveCount++;
                    }
                }

                if (board[row][col] == 1 && (liveCount < 2 || liveCount > 3)) {
                    board[row][col] = -1;
                }

                if (board[row][col] == 0 && liveCount == 3) {
                    board[row][col] = 2;
                }
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (board[row][col] >= 1) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }

    public boolean isValid(int[][] board, int row, int col, int n, int m) {
        return (row < n && row >= 0 && col < m && col >= 0);
    }
}
