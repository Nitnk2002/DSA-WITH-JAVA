package DataStructures.matrices;

public class LowerTriangularMatrix {
    //lower triangular matrix with row major
    //for column method index will formulate (n(i-1)-(j-2)(j-1)/2)+(i-j);
    private int n;
    private int[] a;

    public LowerTriangularMatrix(int n){
        this.n = n;
        a = new int[n*n];
    }
    public void set(int i,int j,int x){
        a[(i*(i-1)/2)+(j-1)] = x;
    }
    public int get (int[] a,int i,int j){
        if(i<j) {
            return a[(i * (i - 1) / 2) + (j - 1)];
        }else{
            return 0;
        }
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i>=j){
                    System.out.print (a[(i * (i - 1) / 2) + (j - 1)]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        LowerTriangularMatrix ltm = new LowerTriangularMatrix (4);
        ltm.set (1,1,1);
        ltm.set (2,1,2);
        ltm.set (2,2,3);
        ltm.set (3,1,4);
        ltm.set (3,2,5);
        ltm.set (3,3,6);
        ltm.set (4,1,7);
        ltm.set (4,2,8);
        ltm.set (4,3,9);
        ltm.set (4,4,10);
        ltm.display ();
    }
}
