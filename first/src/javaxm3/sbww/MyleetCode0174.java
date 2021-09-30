package javaxm3.sbww;

public class MyleetCode0174 {
    public static void main(String[] args) {

    }
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0, j = s.length()-1;
        while (i<j)
        {
            while (i<s.length()&&!isok(ch[i]))
            {
                i++;
            }
            while (j>=0&&!isok(ch[j]))
            {
                j--;
            }
            if(j>i){
                swap(ch,i,j);
                j--;
                i++;
            }
        }
        return new String(ch);
    }
    public boolean isok(char ch)
    {
        return "aeiouAEIOU".indexOf(ch)>=0;
    }
    public void swap(char[] x,int i,int n)
    {
        char ch = x[i];
        x[i] = x[n];
        x[n] = ch;
    }
}
