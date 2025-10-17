package DataStructures.recursion;

public class RecursionExample {

    public static void main(String[] args) {
        int x =3;
        fun(x);
    }
    public static void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);

        }
    }
}
