package javaxm3.sbww;

public class MyLeetCode0259 {
    public boolean validTicTacToe(String[] board) {

        char[][] map = new char[3][3];
        int x = 0,o = 0;
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j)=='X'){
                    x++;
                }
                if (board[i].charAt(j)=='O'){
                    o++;
                }
                map[i][j] = board[i].charAt(j);
            }
//            map[i][0] = board[i].charAt(0);
//            map[i][1] = board[i].charAt(1);
//            map[i][2] = board[i].charAt(2);
        }

        boolean a = c(map,'X'),
                b = c(map,'O');
        if (x<o||x>o+1){
            return false;
        }
        if (a&&x<=o){
            return false;
        }
        if (b&&x!=o){
            return false;
        }
        if (a&&b) return false;
        return true;
    }
    public boolean c(char[][] map,char c){
        for (int i = 0; i < map.length; i++) {

            if (map[i][0]==c && map[i][1]==c && map[i][2]==c) return true;
            if (map[0][i]==c && map[1][i]==c && map[2][i]==c) return true;

        }
        boolean a = true,b = true;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i==j){
                    a&=map[i][j]==c;
                }
                if (i+j==2){
                    b&=map[i][j]==c;
                }
            }
        }



        return a||b;
    }
}
