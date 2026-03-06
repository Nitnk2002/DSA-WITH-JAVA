package DataStructures.Graphs;

public class PrimsMinSpanningFn {


    private static final int V = 8;
    private static final int I = Integer.MAX_VALUE;

    public void printMST(int[][] t,int[][] g){
        System.out.println ("\\n Minimum Spanning Tree Edges (w/ cost)\\n");
        int sum = 0;
        for (int i = 0; i < V - 2 ; i++) {
            int c = g[t[0][i]][t[1][i]];
            System.out.println ("["+t[0][i]+"]---["+t[1][i]+"] cost : "+c);
            sum += c;
        }
        System.out.println ();
        System.out.println ("Total cost of MST : "+sum);
    }

    public void primsMST(int[][] g,int n){
        int u = 0;
        int v = 0;
        int min = I;
        int[] track = new int[V];
        int[][] t = new int[2][V-2];

        for (int i = 1; i < V ; i++) {
            track[i] = I;
            for (int j = i; j < V; j++) {
                if(g[i][j] < min){
                    min = g[i][j];
                    u = i;
                    v = j;
                }
            }
        }
        t[0][0] = u;
        t[1][0] = v;
        track[u] = track[v] = 0;

        for (int i = 0; i < V; i++) {
            if(track[i] != 0){
                if(g[i][u] < g[i][v]){
                    track[i] = u;
                }else {
                    track[i] = v;
                }
            }
        }

        for (int i = 1; i< n-1; i++){
            int k = 0;
            min = I;
            for (int j = 1; j < V; j++){
                if (track[j] != 0 && g[j][track[j]] < min){
                    k = j;
                    min = g[j][track[j]];
                }
            }
            t[0][i] = k;
            t[1][i] = track[k];
            track[k] = 0;

            // Update track array to track min cost edges
            for (int j = 1; j < V; j++){
                if (track[j] != 0 && g[j][k] < g[j][track[j]]){
                    track[j] = k;
                }
            }
        }
        printMST (t,g);
    }

    public static void main(String[] args) {
        int[][] cost = {
            {I, I, I, I, I, I, I, I},
            {I, I, 25, I, I, I, 5, I},
            {I, 25, I, 12, I, I, I, 10},
            {I, I, 12, I, 8, I, I, I},
            {I, I, I, 8, I, 16, I, 14},
            {I, I, I, I, 16, I, 20, 18},
            {I, 5, I, I, I, 20, I, I},
            {I, I, 10, I, 14, 18, I, I},
        };

        int n = cost.length;
        PrimsMinSpanningFn pmsf = new PrimsMinSpanningFn ();
        pmsf.primsMST (cost,n-1);
    }
}
