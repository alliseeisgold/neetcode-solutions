// approach:
// trivial: isValidRow(i) && isValidColumn(i) && isValidSubBox(i) for every i from 1 to 9

class Solution {
    public boolean isValidSudoku(char[][] board) {
        // checking row and column
        for (int i = 0; i < 9; i++) {
            // int[] rowCounter = new int[9];
            // int[] columnCounter = new int[9];
            Set<Character> rowCounter = new HashSet<>();
            Set<Character> columnCounter = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rowCounter.add(board[i][j])) {
                    return false;
                }
                
                if (board[j][i] != '.' && !columnCounter.add(board[j][i])) {
                    return false;
                }
            }
        }

        // checking square 3 x 3
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                // int[] counter = new int[9];
                Set<Character> counter = new HashSet<>();
                for (int row = i; row < i + 3; row++){
                    for (int column = j; column < j + 3; column++) {
                        if (board[row][column] != '.' && !counter.add(board[row][column])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
