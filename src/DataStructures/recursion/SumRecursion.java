package DataStructures.recursion;

public class SumRecursion {
    public static void main(String[] args) {
        int r = sum(5);
        System.out.println(r);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n-1)+n;
    }
    public static int Isum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
