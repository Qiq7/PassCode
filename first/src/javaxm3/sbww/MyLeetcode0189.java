package javaxm3.sbww;

import java.util.ArrayList;
import java.util.List;

public class MyLeetcode0189 {
    public static void main(String[] args) {

    }
    public String blank(int n)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public StringBuffer join(String[] words,int left,int right,String seq){
        StringBuffer sb = new StringBuffer(words[left]);
        for (int i = left+1; i < right; i++) {
            sb.append(seq);
            sb.append(words[i]);
        }
        return sb;
    }
    public List<String> fullJustify(String[] words, int maxWidth){
        List<String> aus = new ArrayList<>();
        int right =0,n = words.length;
        while (true)
        {
            int left = right;
            int sumLen = 0;
            while (right<n&&sumLen+words[right].length()+right-left<=maxWidth){
                sumLen+=words[right++].length();
            }
            if(right==n)
            {
                StringBuffer sb = join(words,left,n," ");
                sb.append(blank(maxWidth-sb.length()));
                aus.add(sb.toString());
                return aus;
            }
            int numWords = right - left;
            int numSpaces = maxWidth - sumLen;

            if(numWords==1)
            {
                StringBuffer sb = new StringBuffer(words[left]);
                sb.append(blank(numSpaces));
                aus.add(sb.toString());
                continue;
            }
            int avgSpace = numSpaces/(numWords-1);
            int extraSpace = numSpaces%(numWords-1);

            StringBuffer sb = new StringBuffer();
            sb.append(join(words,left,left+extraSpace+1,blank(avgSpace+1)));
            sb.append(blank(avgSpace));
            sb.append(join(words,left+extraSpace+1,right,blank(avgSpace)));
            aus.add(sb.toString());

        }
    }

}
