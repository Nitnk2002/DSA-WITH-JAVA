package DataStructures.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchUsingQueue {

    public void BFS(int vtx, int[][] a,int n){
        Queue<Integer> Q = new LinkedList<> ();

        int[] visited = new int[8];

        System.out.print (vtx+", ");
        visited[vtx] = 1;
        Q.add (vtx);

        while (!Q.isEmpty ()){
            int u = Q.poll ();
            for (int v = 1; v < n; v++) {
                if(a[u][v] == 1 && visited[v] == 0){
                    System.out.print (v+", ");
                    visited[v] = 1;
                    Q.add (v);
                }
            }
        }
        System.out.println ();
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

        System.out.print ("Vertex : 1 -> ");
        BreadthFirstSearchUsingQueue bfsq = new BreadthFirstSearchUsingQueue ();
        bfsq.BFS (1,a,8);
        System.out.print ("Vertex : 4 -> ");
        bfsq.BFS (4,a,8);


    }
}
