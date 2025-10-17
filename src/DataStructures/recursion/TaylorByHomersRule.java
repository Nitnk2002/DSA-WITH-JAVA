package DataStructures.recursion;

public class TaylorByHomersRule {
    static double sum = 0;

    public static void main(String[] args) {
        System.out.println (taylor(10,1));
    }
    public static double taylor(int n,int x){
        if(n==0){
            return sum;
        }else {
            sum = 1 + x * sum / n;
            return taylor(n-1,x);
        }
    }
}
