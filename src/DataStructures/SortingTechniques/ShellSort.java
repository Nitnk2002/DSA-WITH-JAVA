package DataStructures.SortingTechniques;

import java.util.Arrays;

public class ShellSort {

    public void shellSort(int[] a,int n){
        for (int gap = n/2; gap >= 1; gap/=2) {
            for (int j = gap; j < n; j++) {
              int temp = a[j];
              int i = j-gap;
              while (i >= 0 && a[i] >temp){
                  a[i+gap] = a[i];
                  i = i-gap;
              }
              a[i+gap] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};
        System.out.println ("A : "+ Arrays.toString (a));
        ShellSort ss = new ShellSort ();
        ss.shellSort (a,a.length);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
    }
}
