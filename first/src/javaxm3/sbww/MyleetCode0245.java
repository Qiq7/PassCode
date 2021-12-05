package javaxm3.sbww;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class MyleetCode0245 {
    public boolean isRectangleCover(int[][] rectangles) {
        int n = rectangles.length;
        int[][] re = new int[n*2][4];
        int id = 0;
        for (int i = 0; i < n; i++) {
            re[id++] = new int[]{
              rectangles[i][0],rectangles[i][1],rectangles[i][3],1
            };
            re[id++] = new int[]{
              rectangles[i][2],rectangles[i][1],rectangles[i][3],-1
            };
        }
        Arrays.sort(re,(a,b)->{
            return a[0]==b[0]?a[1]-b[1]:a[0]-b[0];
        });
        List<int[]> l = new LinkedList<>(),
                r = new LinkedList<>();

        for (int i = 0; i < n*2;) {
            int cr = i;
            l.clear();
            r.clear();
            while (cr<n*2&&re[i][0]==re[cr][0])cr++;
            for (int j = i; j < cr; j++) {
                int [] cur = new int[]{
                  re[j][1],re[j][2]
                };
                List<int[]> list = re[j][3]==1?l:r;
                if (list.isEmpty()){
                    list.add(cur);
                }else {
                    int [] pre = list.get(list.size()-1);
                    if(pre[1]>cur[0]){
                        System.out.println(pre[1]+"  "+cur[0]);
                        return false;
                    }else if (pre[1]==cur[0]){
                        pre[1] = cur[1];
                    }else {
                        list.add(cur);
                    }
                }
            }
            if(i>0&&cr<n*2){
                if (l.size()!=r.size()) {
                    System.out.println("size");
                    return false;
                }
                for (int j = 0; j < l.size(); j++) {
                       if (l.get(j)[0]==r.get(j)[0]&&l.get(j)[1]==r.get(j)[1]) continue;
                    System.out.println("!=");
                       return false;
                }
            }else {
                if (l.size()+r.size()!=1) {
                    for (int[] x:l) {
                        System.out.println(x[0]+" "+" "+x[1]);
                        System.out.println();
                    }
                    System.out.println(Arrays.toString(r.toArray()));
                    System.out.println("h"+i+" "+cr);
                    return false;
                }
            }

            i = cr;
        }

        return true;
    }
}
