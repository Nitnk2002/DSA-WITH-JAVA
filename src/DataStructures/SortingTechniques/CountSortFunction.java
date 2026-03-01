package DataStructures.SortingTechniques;

import java.util.Arrays;

public class CountSortFunction {

    public int max(int[] a,int n){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public void countSort(int[] a,int n){
        int max = max (a,n);
        int[] count = new int[max+1];

//        for (int i = 0; i < max+1; i++) {
//            count[i] = 0;
//        }

        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        int i = 0;
        int j = 0;
        while (j < max+1){
            if(count[j] > 0){
                a[i++] = j;
                count[j]--;
            } else {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 3, 6, 7, 10};
        System.out.println ("A : "+ Arrays.toString (a));
        CountSortFunction csf = new CountSortFunction ();
        csf.countSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
}
