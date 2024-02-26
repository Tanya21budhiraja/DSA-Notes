package Matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> set = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (set.contains(board[row][col])) {
                    return false;
                }

                set.add(board[row][col]);

            }
        }

        for (int col = 0; col < 9; col++) {
            Set<Character> set = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] == '.') {
                    continue;
                }
                if (set.contains(board[row][col])) {
                    return false;
                }

                set.add(board[row][col]);

            }
        }

        for (int row = 0; row < 9; row += 3) {
            int er = row + 2;
            for (int col = 0; col < 9; col += 3) {
                int ec = col + 2;

                if (!validate(board, row, er, col, ec)) {
                    return false;
                }

            }

        }
        return true;
    }

    public boolean validate(char[][] board, int sr, int er, int sc, int ec) {
        Set<Character> set = new HashSet<>();
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                if (set.contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] == '.') {
                    continue;
                }
                set.add(board[i][j]);

            }
        }
        return true;
    }

}
