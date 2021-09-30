package javaxm3.sbww;

public class MyLeetCode0197 {
    public static void main(String[] args) {
        
    }
    public boolean isValidSudoku(char[][] board) {
        
        int[][] l = new int[9][9],
                h = new int[9][9];
        int[][][] f = new int[3][3][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]!='.')
                {
                    l[j][board[i][j]-'0'-1]++;
                    h[i][board[i][j]-'0'-1]++;
                    f[i/3][j/3][board[i][j]-'0'-1]++;
                    if(l[j][board[i][j]-'0'-1]>1||h[i][board[i][j]-'0'-1]>1||f[i/3][j/3][board[i][j]-'0'-1]>1)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
