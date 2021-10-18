package javaxm3.sbww;
//给你一个 正 整数 num ，输出它的补数。补数是对该数的二进制表示取反。
public class MYleetCode0222 {
    public int findComplement(int num) {
        int aus = 0;
        boolean flag = false;
        for (int i = 31; i >= 0 ; i--) {
            int a = (1<<i)&num;
            if (a!=0) flag = true;
            if(flag)
            {
                if(a==0) aus+=1<<i;
            }
        }
        return aus;
    }
}
