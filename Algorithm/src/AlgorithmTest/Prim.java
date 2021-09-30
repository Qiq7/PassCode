package AlgorithmTest;

import java.util.Arrays;

public class Prim {
        static class MGraph{
        int verxs;
        char[] data;
        int[][] weight;
        public MGraph(int verxs)
        {
            this.verxs=verxs;
            data=new char[verxs];
            weight=new int[verxs][verxs];
        }
    }
    static class MinTree{
        public static void createGraph(MGraph graph,int verxs,char[] data,int[][] weight)
        {
            for (int i = 0; i < verxs; i++) {
                graph.data[i]=data[i];
                for (int j = 0; j < verxs; j++) {
                    graph.weight[i][j]=weight[i][j];
                }
            }
        }
        public static void  show(MGraph graph)
        {
            for (int[] link:graph.weight) {
                System.out.println(Arrays.toString(link));
            }
        }
        public static void prim(MGraph graph,int v)
        {
            int[] visited=new int[graph.verxs];
            visited[v] = 1;
            int h1=-1,h2= -1;
            int minweight=666;
            for (int i = 1; i < graph.verxs; i++) {
                for (int j = 0; j < graph.verxs; j++) {
                    for (int k = 0; k < graph.verxs; k++) {
                        if(visited[j]==1&&visited[k]==0&&graph.weight[j][k]<minweight)
                        {
                            minweight=graph.weight[j][k];
                            h1=j;
                            h2=k;
                        }
                    }
                }
                System.out.println(graph.data[h1]+"  "+graph.data[h2]+"  "+minweight);
                visited[h2] = 1;
                minweight=666;
            }
        }
    }
    public static void main(String[] args) {
        char[] data= new char[]{'A','B','C','D','E','F','G'};
        int verxs=data.length;
        int [][] weight=new int[][]{
                {666,5,7,666,666,666,2},
                {5,666,666,9,666,666,3},
                {7,666,666,666,8,666,666},
                {666,9,666,666,666,4,666},
                {666,666,8,666,666,5,4},
                {666,666,666,4,5,666,6},
                {2,3,666,666,4,6,666}
        };
        MGraph graph=new MGraph(verxs);
        MinTree.createGraph(graph,verxs,data,weight);
        MinTree.show(graph);
        MinTree.prim(graph,0);
    }
}
