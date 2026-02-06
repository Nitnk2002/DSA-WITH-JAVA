package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayInsertInSorted {
    static int[] arr = {4, 8, 13, 16, 20, 25, 28, 33,0,0};
    static int n =8;
    public static void main(String[] args) {
        insert(10);
        System.out.println (Arrays.toString(arr));
    }
    public static void insert(int key){
        int i = n-1;
        while(arr[i]>key){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = key;
        n++;
    }

}
