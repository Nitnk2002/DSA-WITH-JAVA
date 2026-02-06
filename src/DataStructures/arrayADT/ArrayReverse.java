package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayReverse {
    static int[] a = {1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println (Arrays.toString(a));
        System.out.println ("reverse : ");
        reverse();
        System.out.println (Arrays.toString(a));
        reverseTwo();
        System.out.println (Arrays.toString(a));
    }
    public static void reverse(){
        int[] b  = new int[a.length];
        for(int i=0,j=a.length-1;j >= 0;i++,j--){
            b[i] = a[j];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }
    public static void reverseTwo(){
        for(int i=0,j=a.length-1;i<j;i++,j--){
            ArrayLinearSearch.swap (a, i, j);
        }
    }
}
