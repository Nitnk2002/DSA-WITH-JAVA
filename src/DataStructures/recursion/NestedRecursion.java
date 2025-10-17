package DataStructures.recursion;

public class NestedRecursion {
    public static void main(String[] args) {
        int r =0;
        r = fun(95);
        System.out.println (r);
    }
    public static int fun(int n){
        if(n>100){
            return n-10;
        }
        return fun(fun(n+11));
    }
}
