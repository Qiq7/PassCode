package javaxm3.sbww;

public class MyLeetCode0051 {
    public static void main(String[] args) {

    }
    public boolean isValidSerialization(String preorder)
    {
        int n = preorder.length();
        int  i = 0,s = 1;
        while (i<n)
        {
            if(s==0) {
                return false;
            }
            else if(preorder.charAt(i)==','){
                i++;
            }else if(preorder.charAt(i) =='#')
            {
                s--;
                i++;
            }else {
                while (i<n&&preorder.charAt(i)!=',')
                {
                    i++;
                }
                s++;
            }

        }
        return s==0;
    }
}
