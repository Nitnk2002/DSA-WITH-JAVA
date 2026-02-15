package DataStructures.SparseMatrixandPolynomialusingLinkedList;

public class CreateSparseMatrixUsingLinkedList {

    static class Node{
        int col;
        int val;
        Node next;
    }

    static Node a[];

    public static void createSparse(int rows){
        a = new Node[rows];
    }

    public static void insert(int row,int col ,int val){
        Node t = new Node ();
        t.val = val;
        t.col = col;
        t.next = null;
        if (a[row] == null || a[row].col > col) {
            t.next = a[row];
            a[row] = t;
            return;
        }
        Node p = a[row];

        while (p.next != null && p.next.col < col) {
            p = p.next;
        }

        t.next = p.next;
        p.next = t;
    }
    public static void displaySparseMatrix(int rows, int cols){

        for (int i = 0; i < rows; i++) {
            Node p = a[i];
            for (int j = 0; j < cols; j++) {
                if(p != null && p.col == j) {
                    System.out.print (p.val+" ");
                    p = p.next;
                }else {
                    System.out.print ("0 ");
                }
            }
            System.out.println ();
        }
    }

    public static void main(String[] args) {

        createSparse (5);
        insert (0,4,8);
        insert (1,3,7);
        insert (2,0,5);
        insert (2,4,9);
        insert (3,5,3);
        insert (4,0,6);
        insert (4,3,4);
        displaySparseMatrix (5,6);
    }
}
