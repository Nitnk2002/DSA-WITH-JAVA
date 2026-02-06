package DataStructures.arrayADT;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayLinearSearch {
    static int[] a = {1,2,3,4,5};
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println (linearSearch(arr,3));
        System.out.println (improveLinearSearch(a,3));
        System.out.println (Arrays.toString(a));
    }
    public static int improveLinearSearch(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                swap(arr,i,i-1);
                return i-1;
            }
        }
        return -1;
    }
    public static int linearSearch(int[] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
