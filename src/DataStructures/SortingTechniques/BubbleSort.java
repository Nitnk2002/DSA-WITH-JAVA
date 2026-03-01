package DataStructures.SortingTechniques;

import java.util.Arrays;

public class BubbleSort {

    public void swap(int[] a,int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void bubbleSort(int[] a,int n){
        int flag = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(a[j] > a[j+1]){
                    swap (a,j,j+1);
                    flag = 1;
                }
            }
            if(flag == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] a= {3,7,9,10,6,5,12,4,11,2};

        int n = a.length;
        System.out.println ("A : "+ Arrays.toString (a));
        BubbleSort bs = new BubbleSort ();
        bs.bubbleSort (a,n);
        System.out.println ("Sorted A : "+Arrays.toString (a));
    }
}
