package javaxm3.sbww;
//over #605
public class MyLeetCode0037 {
    public static void main(String[] args) {
        int a[]={1,0,0,0,1};
        System.out.println(canPlaceFlowers(a,2));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1)
        {
            if(n==0||(flowerbed[0]==0&&n==1)) return true;
            else return false;
        }else
        for (int i = 0; i < flowerbed.length; i++) {
            if(n==0) return true;
            if(flowerbed[i]==1)
            {
                continue;
            }else
            {
                if(i==0)
                {
                    if(flowerbed[i+1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }else if (i==flowerbed.length-1)
                {
                    if(flowerbed[i-1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }else {
                    if(flowerbed[i+1]==0&&flowerbed[i-1]==0)
                    {
                        flowerbed[i]=1;
                        n--;
                    }
                }
            }
        }
        if(n==0) return true;
        else return false;
    }
}
