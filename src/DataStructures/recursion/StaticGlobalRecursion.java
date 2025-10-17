package DataStructures.recursion;

public class StaticGlobalRecursion {
    static int x = 0;
    public static void main(String[] args) {

        int r;
        r = fun(5) ;
        System.out.println(r);

    }
//    public static int fun(int n) {
//        //static int
//        if(n>0){
//            return fun(n-1)+n;
//        }
//        return 0;
//    }
    public static int fun(int n) {
        if(n>0){
            x++;
            return fun(n-1)+x;
        }
        return 0;
    }
    //static inside function not allowed
}
