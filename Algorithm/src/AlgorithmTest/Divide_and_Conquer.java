package AlgorithmTest;

public class Divide_and_Conquer {
    public static void main(String[] args) {
        hanoiTowe(3,'A','B','C');
    }
    public static void hanoiTowe(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println("第"+n+"个盘从"+a+"->"+c);
        }else{
            hanoiTowe(n-1,a,c,b);
            System.out.println("第"+n+"个盘从"+a+"->"+c);
            hanoiTowe(n-1,b,a,c);

        }
    }
}
