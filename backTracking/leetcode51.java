import java.util.*;

public class leetcode51 {

    public static void main(String[] args) {

        int n = 6;
        List<List<String>> ans = solveNQueens(n);
        for (List<String> board : ans) {
            System.out.println(board);
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++){
         
           board[i][j] = '.';
            }
        }
        solve(0, board, ans);
        return ans;
    }

        

    public static void solve(int row, char[][] board, List<List<String>> ans) {
        if (row == board.length) {
            List<String> temp = new ArrayList<>();
            for (char[] r : board) {
                temp.add(new String(r));
            }
            ans.add(temp);
            return;
        }
        
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                solve(row + 1, board, ans);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col) {
        // row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        //left digonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
       // right digonal

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }
}
