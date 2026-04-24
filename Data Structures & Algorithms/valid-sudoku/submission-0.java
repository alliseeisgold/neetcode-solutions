// approach:
// trivial: isValidRow(i) && isValidColumn(i) && isValidSubBox(i) for every i from 1 to 9

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking row and column
        for (int i = 0; i < 9; i++) {
            int[] rowCounter = new int[9];
            int[] columnCounter = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int rowCell = board[i][j] - '0' - 1;
                    rowCounter[rowCell]++;
                    if (rowCounter[rowCell] > 1) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    int columnCell = board[j][i] - '0' - 1;            
                    columnCounter[columnCell]++;
                    if (columnCounter[columnCell] > 1) {
                       return false;
                    }
                }
            }
        }

        // checking square 3 x 3
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] counter = new int[9];
                for (int row = i; row < i + 3; row++){
                    for (int column = j; column < j + 3; column++) {
                        if (board[row][column] != '.') {
                            int cell = board[row][column] - '0' - 1;
                            counter[cell]++;
                            if (counter[cell] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}
