package DataStructures.matrices;

public class UpperTriangularMatrix {
    private int n;
    private int[] a;

    public UpperTriangularMatrix(int n){
        this.n = n;
        a = new int[n*n];
    }
    public void set(int i,int j,int x){
        int x1 = (n*(i-1))-(((i-1)*(i-2))/2)+(j-i);
        a[x1] = x;
    }
    public int get (int[] a,int i,int j){
        int x1 = (n*(i-1))-(((i-1)*(i-2))/2)+(j-i);
        if(i>j) {
            return a[x1];
        }else{
            return 0;
        }
    }
    public void display(){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.print (a[(n*(i-1))-(((i-1)*(i-2))/2)+(j-i)]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        UpperTriangularMatrix utm = new UpperTriangularMatrix (4);
        utm.set (4,4,1);
        utm.set (3,3,2);
        utm.set (3,4,3);
        utm.set (2,2,4);
        utm.set (2,3,5);
        utm.set (2,4,6);
        utm.set (1,1,7);
        utm.set (1,2,8);
        utm.set (1,3,9);
        utm.set (1,4,10);
        utm.display ();
    }
}
