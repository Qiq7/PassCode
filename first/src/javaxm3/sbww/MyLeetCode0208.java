package javaxm3.sbww;

//给你 二维 平面上两个 由直线构成的 矩形，请你计算并返回两个矩形覆盖的总面积。
//
//每个矩形由其 左下 顶点和 右上 顶点坐标表示：
//
//第一个矩形由其左下顶点 (ax1, ay1) 和右上顶点 (ax2, ay2) 定义。
//第二个矩形由其左下顶点 (bx1, by1) 和右上顶点 (bx2, by2) 定义。
//
public class MyLeetCode0208 {
    public static void main(String[] args) {

    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int s1=0,s2=0,s3=0;
        s1 = (ax2-ax1)*(ay2-ay1);
        s2 = (bx2-bx1)*(by2-by1);
        int overh = Math.min(ay2,by2)-Math.max(ay1,by1)
                ,overw = Math.min(ax2,bx2)-Math.max(ax1,bx1);
        s3 = Math.max(0,overh)*Math.max(0,overw);
        return s1+s2-s3;
    }
}
