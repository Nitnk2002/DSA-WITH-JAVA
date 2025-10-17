package DataStructures.recursion;

public class FibonacciSeries {
    static int[] f = new int[10];
    public static void main(String[] args) {
        System.out.println (rfib (3));
        System.out.println (fib (3));
        for (int i = 0; i < 10; i++) {
            f[i] = -1;
        }
        System.out.println (mfib (3,f));
    }
    public static int rfib(int n){
        if(n<=1){
            return n;
        }else{
            return rfib(n-1)+rfib(n-2);
        }
    }
    public static int fib(int n){
        int a =0;
        int b =1;
        int s=0;
        if(n<=1){
            return n;
        }else {
            for (int i = 2; i <= n; i++) {
                s = a + b;
                a = b;
                b = s;
            }
        }
        return s;
    }
    public static int mfib(int n, int[] f){
        if(n<=1){
            f[n] = n;
            return n;
        }else{
            if(f[n-2]==-1){
                f[n-2] = mfib(n-2,f);
            }
            if(f[n-1]==-1){
                f[n-1] = mfib(n-1,f);
            }
            f[n] = f[n-2]+f[n-1];
            return f[n-2]+f[n-1];
        }

    }
}
