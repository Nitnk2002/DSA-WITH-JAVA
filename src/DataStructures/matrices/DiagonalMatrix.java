package DataStructures.matrices;

public class DiagonalMatrix {
    private int n;
    private int[] a;

    public DiagonalMatrix(int n){
        this.n= n;
        a = new int[n];
    }
    public void set(int i,int j,int x){
        if(i==j){
            a[i-1] = x;
        }
    }
    public int get (int[] a,int i,int j){
        if(i==j){
            return a[i-1];
        }else{
            return 0;
        }
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==j){
                    System.out.print (a[i-1]+" ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println ();
        }
    }

    public static void main(String[] args) {

        DiagonalMatrix dm = new DiagonalMatrix(4);

        dm.set(1, 1, 5);
        dm.set(2, 2, 8);
        dm.set(3, 3, 3);
        dm.set(4, 4, 6);
        dm.display ();
    }
}
