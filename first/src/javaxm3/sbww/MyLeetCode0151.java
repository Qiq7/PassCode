package javaxm3.sbww;

public class MyLeetCode0151 {
    public static void main(String[] args) {

    }
    public String maximumTime(String time) {
        char[] ch = time.toCharArray();
        if(ch[0] == '?')
        {
            if(ch[1]!='?') {
                if (Integer.parseInt(("" + ch[1])) <= 3) {
                    ch[0] = '0'+2;
                } else {
                    ch[0] = '0'+1;
                }
            }else {
                ch[0] = '0'+ 2;
                ch[1] = '0'+3;
            }
        }else{
            if(ch[1]=='?') {
                if (Integer.parseInt(("" + ch[0])) <= 1) {
                    ch[1] = '0'+9;
                } else {
                    ch[1] = '0'+3;
                }
            }
        }        if(ch[3] == '?')
        {
            if(ch[4]!='?') {
                ch[3] = '0'+5;
            }else{
                ch[3] = '0'+5;
                ch[4] = '0'+9;
            }
        }else{
            if(ch[4]=='?') {
                ch[4] = '0'+9;
            }
        }



        return new String(ch);
    }
}
