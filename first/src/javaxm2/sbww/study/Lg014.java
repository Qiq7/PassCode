package javaxm2.sbww.study;

import java.util.*;

public class Lg014 {
    private static int[] ma;
    private static int [] mi;
    //private static boolean [] vised;
    private static int d = 0;
    private static int aus = 0;
    private static int n,m;
    private static int [] cost;
    private static int [] cnt;
    private static HashMap<Integer,List<Integer>> edges;
    private static HashMap<Integer,List<Integer>> edge2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
                m = sc.nextInt();
         cost = new int[n+1];
         cnt = new int[n+1];
         edges = new HashMap<>();
         edge2 = new HashMap<>();
         ma = new int[n+1];
         mi = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            cost[i] = sc.nextInt();
        }
        for (int i = 1; i <= m ; i++) {
            int x = sc.nextInt(),
                    y = sc.nextInt(),
                    z = sc.nextByte();
            List<Integer> l0 = edges.getOrDefault(x,new ArrayList<>());
            List<Integer> l1 = edge2.getOrDefault(y,new ArrayList<>());
            l0.add(y);
            l1.add(x);
            edges.put(x,l0);
            edge2.put(y,l1);
            if (z==2){
                List<Integer> l3 = edges.getOrDefault(y,new ArrayList<>());
                List<Integer> l4 = edge2.getOrDefault(x,new ArrayList<>());
                l3.add(x);
                l4.add(y);
                edges.put(y,l3);
                edge2.put(x,l4);
            }
        }
//        for (Map.Entry x:edges.entrySet()) {
//            System.out.println(x.getKey()+"==========");
//            for (Object a:(ArrayList)x.getValue()) {
//                System.out.print(a+"  ");
//            }
//            System.out.println();
//        }

        dfs1(1,Integer.MAX_VALUE);
        Arrays.fill(cnt,0);
        dfs2(n,Integer.MIN_VALUE);
//        System.out.println(Arrays.toString(ma));
//        System.out.println(Arrays.toString(mi));
        for (int i = 1; i <= n ; i++) {
            if (ma[i]!=0&&mi[i]!=0){
//                System.out.println(ma[i]);
//                System.out.println(mi[i]);
//                System.out.println("=============");
                aus=Math.max(aus,ma[i]-mi[i]);
            }
        }

        System.out.println(aus);
        

    }
    public static void dfs2(int u,int m){
       // System.out.println(u);
        cnt[u]++;
        ma[u] = Math.max(cost[u],m);
        for (int i = 1; edge2.containsKey(u) && i < edge2.get(u).size(); i++) {
            int v = edge2.get(u).get(i);
            if (cnt[v]>3)continue;
            dfs2(v,ma[u]);
        }
    }
    public static void dfs1(int u,int m){
        cnt[u]++;
        mi[u] = Math.min(m,cost[u]);
        //System.out.println(u);
        for (int i = 0;edges.containsKey(u) && i < edges.get(u).size(); i++) {
            int v = edges.get(u).get(i);
            if (cnt[v]>3) continue;
            //System.out.println(u+"->"+v);
            dfs1(v,mi[u]);
        }
    }
}
