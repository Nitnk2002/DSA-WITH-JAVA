package DataStructures.recursion;

public class CombinationRecursion {
    public static void main(String[] args) {
        System.out.println (combination (3,1));
        System.out.println (c(3,1));
    }
    public static int combination(int n, int r){
        if(r==0 || n==r){
            return 1;
        }
        return combination (n - 1, r - 1) + combination (n - 1, r);
    }
    public static int c(int n, int r){
        int t1,t2,t3;
        t1 = fact(n);
        t2 = fact(r)*fact(n-r);
        t3 = t1/t2;
        return t3;
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
