package DataStructures.recursion;

public class PowerRecursion {
    public static void main(String[] args) {
        //int r = power(2,5);
        int r = Epower(3,5);
        System.out.println(r);
    }

    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    public static int Epower(int n,int p){
        if(p==0){
            return 1;
        }else if(p%2==0){
            return Epower(n*n,p/2);
        }else{
            return n*Epower(n*n,(p-1)/2);
        }
    }
}
