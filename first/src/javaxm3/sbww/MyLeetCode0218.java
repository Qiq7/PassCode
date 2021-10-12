package javaxm3.sbww;
//给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
//
//返回被除数 dividend 除以除数 divisor 得到的商。
//
//整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
//

public class MyLeetCode0218 {

    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE){
            if (divisor==1)return Integer.MIN_VALUE;
            if (divisor==-1) return Integer.MAX_VALUE;
        }
        if (divisor==Integer.MIN_VALUE)
        {
            return dividend==Integer.MIN_VALUE?1:0;
        }
        if(dividend==0) return 0;
        boolean rev=false;
        if(dividend>0)
        {
            dividend=-dividend;
            rev=!rev;
        }
        if (divisor>0)
        {
            divisor=-divisor;
            rev=!rev;
        }
        int l = 1,r = Integer.MAX_VALUE,aus = 0;
        while (l<=r){
            int mid = l+((r-l)>>1);
            boolean ch=f(divisor,mid,dividend);
            if (ch)
            {
                aus=mid;
                if(mid==Integer.MAX_VALUE){
                    break;
                }
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return rev?-aus:aus;
    }
    public boolean f(int y,int z,int x)
    {
        int result=0,add=y;
        while (z!=0){
            if((z&1)!=0){
                if (result<x-add){
                    return false;
                }
                result+=add;
            }
            if (z!=1)
            {
                if(add<x-add)
                {
                    return false;
                }
                add+=add;
            }
            z>>=1;
        }
        return true;
    }
}
