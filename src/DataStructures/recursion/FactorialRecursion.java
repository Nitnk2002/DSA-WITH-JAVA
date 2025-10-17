package DataStructures.recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        int r = fact(5);
        System.out.println(r);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
