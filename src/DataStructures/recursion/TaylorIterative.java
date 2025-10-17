package DataStructures.recursion;

public class TaylorIterative {
    public static void main(String[] args) {
        System.out.println (taylor(10,1));
    }
    public static double taylor(int n, int x) {
        double sum = 1.0;
        double num = 1.0; // to store x^i
        double den = 1.0; // to store i!
        for (int i = 1; i<=n; i++) {
            num = num * x;
            den = den * i;
            sum  += num / den;
        }
        return sum;
    }
}
