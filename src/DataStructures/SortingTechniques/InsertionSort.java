package DataStructures.SortingTechniques;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] a, int n){
        for (int i = 0; i < n; i++) {
            int j = i-1;
            int x = a[i];
            while (j > -1 && a[j] > x){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
    }

    public static void main(String[] args) {
        int[] a = {19,17,15,13,11,9,7,5,3,1};

        System.out.println ("A : "+ Arrays.toString (a));
        InsertionSort is = new InsertionSort ();
        is.insertionSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
}
