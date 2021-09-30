package javaxm3.sbww;
//over#321
import java.util.Arrays;

public class MyLeetCode0025 {
    public static void main(String[] args) {
        int[] a={6,7},b={6,0,4};
        int k=5;
        //System.out.println(Arrays.toString(sub(a,4)));
        System.out.println(Arrays.toString(maxNumber(a,b,k)));
    }
    public static  int[] maxNumber(int[] nums1,int [] nums2,int k)
    {
        int[] maxnumber=new int[k];
        int n=nums1.length,m=nums2.length;
        int s=Math.max(0,k-m),e=Math.min(n,k);
        for (int i = s; i <= e; i++) {
            int[] sub1=sub(nums1,i);
            int[] sub2=sub(nums2,k-i);
            int[] maxnu=merge(sub1,sub2);
            if(com(maxnu,maxnumber)>0)
            {
                    System.arraycopy(maxnu,0,maxnumber,0,k);
            }
            System.out.println(i+"-----------------");
            System.out.println(Arrays.toString(sub1));
            System.out.println(Arrays.toString(sub2));
            System.out.println(Arrays.toString(maxnu));
        }
        return maxnumber;
    }
    public static int[] sub(int[] a,int i)
    {
        int l=i;
        int[] nus=new int[i];
        int m,t=0,k;
        for (int j = 0; j < i; j++) {
            m=0;
            for ( k = t; l!=0&&k <= a.length-l; k++) {
                if(m<a[k]){
                        m=a[k];
                        t=k+1;
                }
            }
            if(l!=0)nus[j]=m;
            l--;
        }
        return nus;
    }
    public static int com(int[] a,int[] b)
    {
        int n=a.length,m=b.length;
        int x1=0,x2=0;
        while (x1!=n&&x2!=m)
        {
            if (a[x1++] != b[x2++]) {
                return a[x1-1]-b[x2-1];
            }
        }
        return a.length-b.length;
    }
    public static int[] merge(int[] a,int[] b)
    {
        int[] nus=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i!=a.length&&j!=b.length)
        {
            if(a[i]>b[j])
            {
                nus[k++]=a[i++];
            }else if(a[i]<b[j]){
                nus[k++]=b[j++];
            }else{
                if(com1(a,i,b,j)>0) {
                    nus[k++] = a[i++];
                }
                 else nus[k++]=b[j++];

            }
        }
        while (i!=a.length)
        {
            nus[k++]=a[i++];
        }
        while (j!=b.length)
        {
            nus[k++]=b[j++];
        }
        return nus;
    }
    public static int com1(int[] a,int i,int[] b,int j)
    {
        int i1=i,i2=j;
        int n=a.length,m=b.length;
        while (i!=n&&j!=m)
        {
            if (a[i++] != b[j++]) {
                return a[i-1]-b[j-1];
            }
        }
        return a.length-i1-b.length+i2;
    }
}
