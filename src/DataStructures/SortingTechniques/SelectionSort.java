package DataStructures.SortingTechniques;

import java.util.Arrays;

public class SelectionSort {

    public void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void selectionSort(int[] a,int n){
        for (int i = 0; i < n-1; i++) {
            int j;
            int k;
            for (j = k = i;j < n;j++){
                if(a[j] < a[k]){
                    k = j;
                }
            }
            swap (a,i,k);
        }
    }

    public static void main(String[] args) {
        int[] a = {3,7,9,10,6,5,12,4,11,2};
        System.out.println ("A : "+ Arrays.toString (a));

        SelectionSort ss = new SelectionSort ();
        ss.selectionSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
}
