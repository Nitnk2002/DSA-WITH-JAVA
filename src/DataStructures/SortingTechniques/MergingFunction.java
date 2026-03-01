package DataStructures.SortingTechniques;

import java.util.Arrays;

public class MergingFunction {
    public void merge(int[] x,int[] y , int[] z, int m,int n){
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n){
            if(x[i] < y[j]){
                z[k++] = x[i++];
            }else {
                z[k++] = y[j++];
            }
        }
        while (i < m){
            z[k++] = x[i++];
        }
        while (j < n){
            z[k++] = y[j++];
        }
    }
    public void mergeSingle(int[] a, int low, int mid, int high) {

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

    public static void main(String[] args) {

        MergingFunction mf = new MergingFunction ();
        int[] a = {2,10,18,20,23};
        System.out.println ("A : "+ Arrays.toString (a));

        int[] b = {4,9,19,25};
        System.out.println ("B : "+ Arrays.toString (b));

        int r = a.length+b.length;
        int[] c = new int[r];
        mf.merge (a,b,c,a.length,b.length);

        System.out.println ("Sorted : "+Arrays.toString (c));

        System.out.println ();
        int[] d = {2,5,8,12,3,6,7,10};
        System.out.println ("D : "+ Arrays.toString (d));
        mf.mergeSingle (d,0,3,7);
        System.out.println ("Sorted D : "+ Arrays.toString (d));

    }
}
