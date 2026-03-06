package DataStructures.Graphs;

import java.util.Stack;

public class DepthFirstSearchUsingStack {

    public void DFS(int u,int[][] a,int n){
        // Initialize visit tracking array and stack
        int[] visited = new int[8];
        Stack<Integer>  stk = new Stack<> ();
        stk.push (u);

        // Visit start vertex u
        System.out.print (u+", ");
        visited[u] = 1;

        // Initial Adjacent vertex

        int v = 0;
        while (!stk.isEmpty ()){
            while (v < n){
                if(a[u][v] == 1 && visited[v] == 0){
                    stk.push (u);
                    u = v;

                    // Visit current vertex u
                    System.out.print (u+", ");
                    visited[u] = 1;
                    v = -1;
                }
                v++;
            }
            v = u;
            u = stk.peek ();
            stk.pop ();
        }
    }
    public void dfs(int u,int[][] a,int n){
        int[] visited = new int[8];
        Stack<Integer>  stk = new Stack<> ();
        stk.push (u);

        while (!stk.isEmpty ()){
            u = stk.peek ();
            stk.pop ();

            if(visited[u] != 1){
                System.out.print (u+", ");
                visited[u] = 1;

                for (int v = n-1; v >= 0 ; v--) {
                    if(a[u][v] == 1 && visited[v] == 0){
                        stk.push (v);
                    }
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
        int u = 5;
        DepthFirstSearchUsingStack dfsus = new DepthFirstSearchUsingStack ();
        System.out.print ("DFS Vertex : "+u+" -> ");
        dfsus.DFS (u,a,8);
        System.out.println ();

        System.out.print ("dfs Vertex : "+u+" -> ");
        dfsus.dfs (u,a,8);
        System.out.println ();


    }
}
