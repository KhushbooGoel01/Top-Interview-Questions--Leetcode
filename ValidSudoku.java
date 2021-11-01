

public boolean isValidSudoku(char[][] board) {
    boolean[][] col = new boolean[9][9];
    boolean[][] row = new boolean[9][9];
    boolean[][] block = new boolean[9][9];
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.') {
                continue;
            }
            int digit = board[i][j] - '1';
            int blockId = i / 3 * 3 + j / 3;
            if (col[j][digit]) {
                return false;
            } else {
                col[j][digit] = true;
            }
            if (row[i][digit]) {
                return false;
            } else {
                row[i][digit] = true;
            }
            if (block[blockId][digit]) {
                return false;
            } else {
                block[blockId][digit] = true;
            }
        }
    }
    return true;
}
