package DataStructures.Graphs;

public class DepthFirstSearchUsingRecursion {

    static int[] visited =  new int[8];

    public void DFS(int u,int[][] a,int n){
        if(visited[u] == 0){
            System.out.print (u+", ");
            visited[u] = 1;
            for (int v = 1; v < n ; v++) {
                if(a[u][v] == 1 && visited[v] == 0){
                    DFS (v,a,n);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 1, 0, 1, 0, 0, 0, 0},
                    {0, 1, 1, 0, 1, 1, 0, 0},
                    {0, 1, 0, 1, 0, 1, 0, 0},
                    {0, 0, 0, 1, 1, 0, 1, 1},
                    {0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 1, 0, 0}};
        DepthFirstSearchUsingRecursion dfsur = new DepthFirstSearchUsingRecursion ();

        System.out.print ("Vertex : 4 -> ");
        dfsur.DFS (4,a,8);
        System.out.println ();


    }
}
