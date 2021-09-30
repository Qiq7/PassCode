package javaxm3.sbww;

import java.util.*;

public class MyLeetCode0041 {
    public class Edge{
        int i,a,b,w;
        Edge(int i,int a,int b,int w)
        {
            this.i=i;
            this.w=w;
            this.b=b;
            this.a=a;
        }
    }

    public static void main(String[] args) {

    }
    private int minTreeWeightCal(List<Integer> p,List<Edge> n,int w)
    {
        Collections.sort(n,(a,b)->a.w-b.w);
        for (Edge e:n) {
            int a=Find(p,e.a),b=Find(p,e.b);
            if(a!=b)
            {
                w+=e.w;
                p.set(a,b);
            }
        }
        return w;
    }
    public static int Find(List<Integer> p,int n)
    {
            if(p.get(n)!=n)
            {
                p.set(n,Find(p,p.get(n)));
            }
            return p.get(n);
    }

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges
            (int n, int[][] edges) {
            List<Integer> p=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(i);
        }
        List<Edge> ne=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ne.add(new Edge(i,edges[i][0],edges[i][1],edges[i][2]));
        }

        int minTree=minTreeWeightCal(p,ne,0);

        List<List<Integer>> aus=new ArrayList<>();
        aus.add(new ArrayList<Integer>());
        aus.add(new ArrayList<Integer>());

        List<Edge> t=new ArrayList<>(ne);

        for (Edge e:t) {
            t.remove(e);
            if(minTree!=minTreeWeightCal(new ArrayList<>(p),t,0))
            {
                aus.get(0).add(e.i);
            }
            t.add(e);
        }

        for (Edge e:ne) {
            if(aus.get(0).contains(e.i)) continue;
            ArrayList<Integer> tp=new ArrayList<>(p);
            tp.set(e.a,e.b);
            if(minTree==minTreeWeightCal(tp,t,e.w))
            {
                aus.get(1).add(e.i);
            }
        }
        return aus;
    }
}
