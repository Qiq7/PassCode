package javaxm3.sbww;

//请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。
//
//实现词典类 WordDictionary ：
//
//WordDictionary() 初始化词典对象
//void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
//bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些 '.' ，每个 . 都可以表示任何一个字母。
//


public class MyLeetCode0223 {
//    public static void main(String[] args) {
//        MyLeetCode0223 a = new MyLeetCode0223();
//        a.WordDictionary();
//        a.addWord("abc");
//    }


    private Trie0 root;
    public void WordDictionary() {
        root = new Trie0();
    }

    public void addWord(String word) {
        root.insert(word);
    }
    public boolean search(String word) {
        return dfs(word,0,root);
    }
    public boolean dfs(String word,int index,Trie0 root){
        if (index==word.length()){
            return root.isEnd();
        }
        char ch = word.charAt(index);
        if (Character.isLetter(ch)){
            int childrenIndex = ch - 'a';
            Trie0 child = root.getTries()[childrenIndex];
            if(child!=null &&dfs(word, index+1, child)){
                return true;
            }
        }else {
            for (int i = 0; i < 26; i++) {
                Trie0 child = root.getTries()[i];
                if(child!=null&&dfs(word, index+1, child)){
                    return true;
                }
            }
        }

        return false;
    }

}
class Trie0 {
    private Trie0[] tries;
    private boolean isEnd;
    public Trie0(){
        tries = new Trie0[26];
        isEnd = false;
    }
    public boolean isEnd(){
        return isEnd;
    }
    public Trie0[] getTries(){
        return tries;
    }
    public void insert(String word) {
        Trie0 node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch-'a';
            if(node.tries[index]==null) {
                node.tries[index] = new Trie0();
            }
            node = node.tries[index];
        }
        node.isEnd = true;
    }
}