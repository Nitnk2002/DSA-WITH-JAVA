package DataStructures.matrices;

public class SymmetricMatrix {
    private int n;
    private int[] a;

    public SymmetricMatrix(int n){
        this.n = n;
        a = new int[n];
    }
    public void set(int i,int j,int x){
        if(i==j) {
            a[i-1] = x;
        }
    }
    public int get (int[] a,int i,int j){
        if(i<=j) {
            return a[i-1];
        }else{
            return a[j-1];
        }
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.print (a[i-1]+" ");
                }else{
                    System.out.print(a[j-1]+" ");
                }
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        SymmetricMatrix sm = new SymmetricMatrix (4);
        sm.set (1,1,1);
        sm.set (2,2,2);
        sm.set (3,3,3);
        sm.set (4,4,4);

        sm.display ();
    }
}
