package AlgorithmTest;

public class Dynamic_Proogramming {
    public static void main(String[] args) {
        int[] w={1,4,3};
        int[] val={1500,3000,2000};
        int Maxm=4;
        int n=val.length;
        int [][] v=new int[n+1][Maxm+1];
        int[][] path=new int[n+1][Maxm+1];
        for (int i = 0; i <v.length ; i++) {
            v[i][0] = 0;
        }
        for (int i = 0; i < v[0].length ; i++) {
            v[0][i] = 0;
        }
        for (int i = 1; i < v.length; i++) {
            for (int j = 1; j < v[0].length; j++) {
                if(w[i-1]>j)
                {
                    v[i][j] = v[i-1][j];
                }else {
                    if(v[i-1][j]<val[i-1]+v[i-1][j-w[i-1]])
                    {
                        v[i][j] = val[i-1]+v[i-1][j-w[i-1]];
                        path[i][j] = 1;
                    }else {
                        v[i][j] = v[i-1][j];
                    }
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j]+"     ");
            }
            System.out.println();
        }
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[i].length; j++) {
                //if(path[i][j]==1)
                {
                    System.out.print(path[i][j]+"     ");
                }

            }
            System.out.println();
        }


    }
    public static void knapsack01()
    {

    }
}
