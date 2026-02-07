package DataStructures.matrices;

public class ToeplitzMatrix {

    private int n;
    private int[] a;

    public ToeplitzMatrix(int n){
        this.n = n;
        a = new int[n+n-1];
    }

    public void set(int i,int j,int x){
        if(i<=j){
            a[j-i] = x;
        }else{
            a[n+i-j-1] = x;
        }
    }
    public int get(int i,int j,int x){
        if(i<=j){
            return a[j-i];
        }else{
            return a[n+i-j-1];
        }
    }
    public void display(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i<=j){
                    System.out.print (a[j-i]+" ");
                }else{
                    System.out.print(a[n+i-j-1]+" ");
                }
            }
            System.out.println ();
        }
    }

    public static void main(String[] args) {
        ToeplitzMatrix tm = new ToeplitzMatrix (4);

        tm.set (1,1,2);
        tm.set (1,2,3);
        tm.set (1,3,4);
        tm.set (1,4,5);
        tm.set (2,1,7);
        tm.set (3,1,8);
        tm.set (4,1,9);

        tm.display ();

    }
}
