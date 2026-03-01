package DataStructures.SortingTechniques;

import java.util.Arrays;

public class RecursiveMergeSort {

    public void merge(int[] a,int low,int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        int[] b = new int[a.length];
        while (i <= mid && j <= high){
            if(a[i] < a[j]){
                b[k++] = a[i++];
            }else {
                b[k++] = a[j++];
            }
        }
        while (i <=  mid){
            b[k++] = a[i++];
        }
        while (j <=  high){
            b[k++] = a[j++];
        }
        for (int l = low; l <= high; l++) {
            a[l] = b[l];
        }
    }

    public void recursiveMergeSort(int[] a,int low,int high){
        if(low < high){
            int mid = low + (high-low)/2;

            recursiveMergeSort (a,low,mid);
            recursiveMergeSort (a,mid+1,high);

            merge (a,low,mid,high);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 3, 6, 7, 10};
        System.out.println ("A : "+ Arrays.toString (a));
        RecursiveMergeSort rms = new RecursiveMergeSort ();

        rms.recursiveMergeSort (a,0,a.length-1);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
}
