package DataStructures.Graphs;

public class KruskalMinCostSpanningFn {


    private static final int V = 7;
    private static final int I = Integer.MAX_VALUE;
    private static final int E = 9;

    public void printMCST(int[][] t,int[][] a){
        System.out.println ("\nMinimum Spanning Tree Edges (w/ cost)\n");
        for (int i = 0; i < V-1; i++) {
            System.out.println ("["+t[0][i]+"]---["+t[1][i]+"]");
        }
        System.out.println ();
    }

    public void union(int u,int v,int[] s){
        if(s[u] < s[v]){
            s[u] += s[v];
            s[v] = u;
        }else {
            s[v] += s[u];
            s[u] = v;
        }
    }

    public int find(int u, int[] s){
        int x = u;
        int v = 0;
        while (s[x] > 0){
            x = s[x];
        }

        while (u != x){
            v = s[u];
            s[u] = x;
            u = v;
        }
        return x;
    }

    public void kruskalMCST(int[][] a){
        int[][] t = new int[2][V-1];
        int[] track = new int[E];
        int[] set = {-1, -1, -1, -1, -1, -1, -1, -1};

        int i = 0;
        while (i < V-1){
            int min = I;
            int u = 0;
            int v = 0;
            int k = 0;
            for (int j = 0; j < E; j++) {
                if (track[j] == 0 && a[2][j] < min){
                    min = a[2][j];
                    u = a[0][j];
                    v = a[1][j];
                    k = j;
                }
            }

            if(find (u,set) != find (v,set)){
                t[0][i] = u;
                t[1][i] = v;
                union (find (u,set),find (v,set),set);
                i++;
            }
            track[k] = 1;
        }

        printMCST (t,a);
    }

    public static void main(String[] args) {

        int[][] edges = {{ 1, 1,  2,  2, 3,  4,  4,  5,  5},
                        { 2, 6,  3,  7, 4,  5,  7,  6,  7},
                        {25, 5, 12, 10, 8, 16, 14, 20, 18}};
        KruskalMinCostSpanningFn kmcsf = new KruskalMinCostSpanningFn ();

        kmcsf.kruskalMCST (edges);
    }
}
