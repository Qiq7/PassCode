package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0196 {

    public static void main(String[] args) {

    }
    class Trie{
        String word;
        Map<Character,Trie> children;
        boolean isWord;
        public Trie()
        {
            this.word="";
            this.children = new HashMap<>();
        }
        public void insert(String word)
        {
            Trie cur = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if(!cur.children.containsKey(c))
                {
                    cur.children.put(c,new Trie());
                }
                cur = cur.children.get(c);
            }
            cur.word = word;
        }
    }
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public void dfs(char[][] bord, Trie now, int i1, int j1, Set<String> aus)
    {
        if(!now.children.containsKey(bord[i1][j1]))
        {
            return;
        }
        char ch = bord[i1][j1];
        now = now.children.get(ch);
        if (now.word!="")
        {
            aus.add(now.word);
        }
        bord[i1][j1] = '#';
        for (int[] dir:dirs) {
            int i2 = i1+dir[0],j2 = j1+dir[1];
            if(i2>=0&&i2<bord.length&&j2>=0&&j2<bord[i2].length)
            {
                dfs(bord,now,i2,j2,aus);
            }
        }
        bord[i1][j1] = ch;
    }
    public List<String> findWords(char[][] board, String[] words) {
            Trie trie = new Trie();
        for (String word:words) {
            trie.insert(word);
        }
        Set<String> aus = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(board,trie,i,j,aus);
            }
        }
        return new ArrayList<String>(aus);
    }
}
