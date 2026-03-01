package DataStructures.SortingTechniques;

import java.util.Arrays;

public class IterativeMergeSort {
    public void merge(int[] a, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;

        int[] b = new int[a.length];

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                b[k++] = a[i++];
            } else {
                b[k++] = a[j++];
            }
        }
        while (i <= mid) {
            b[k++] = a[i++];
        }

        while (j <= high) {
            b[k++] = a[j++];
        }

        for (int l = low; l <= high; l++) {
            a[l] = b[l];
        }
    }
    public void iterativeMergeSort(int[] a,int n){
        int p = 0;
        for ( p = 2; p <= n ; p = p*2) {
            for (int i = 0; i+p-1 < n; i = i+p) {
                int low = i;
                int high = i+p-1;
                int mid = (low+high)/2;
                merge (a,low,mid,high);
            }
        }
        if(p/2 < n){
            merge (a,0,p/2-1,n-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,8,12,3,6,7,10};
        System.out.println ("A : "+ Arrays.toString (a));
        IterativeMergeSort ims = new IterativeMergeSort ();
        ims.iterativeMergeSort (a,a.length);
        System.out.println ("Sorted A : "+Arrays.toString (a));
    }
}
