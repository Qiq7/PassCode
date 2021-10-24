package javaxm3.sbww;

public class MyLeetcode0226 {
    public int[] constructRectangle(int area) {
        int l=area,w=1;
        for (int i = 1; i*i <= area ; i++) {
            if(area%i==0){
                int a = area/i;
                System.out.println(a);
                if(a>=i){
                    if(Math.abs(l-w)>Math.abs(a-i)){
                        l = a;
                        w = i;
                    }
                }
            }
        }
        return new int[]{l,w};
    }
}
