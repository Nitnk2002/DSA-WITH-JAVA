package DataStructures.SortingTechniques;

import java.util.Arrays;

public class QuickSort {

    public void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public int partitionA(int[] a,int low, int high){
        int pivot = a[low];
        int i = low;
        int j = high;

        do{
            do{i++;}while (a[i] <= pivot);
            do{j--;}while (a[j] > pivot);
            if(i < j){
                swap (a,i,j);
            }
        }while (i < j);

        swap (a,low,j);
        return j;
    }
    public void quickSortA(int[] a,int low, int high){
        if(low < high){
            int j = partitionA (a,low,high);
            quickSortA (a,low,j);
            quickSortA (a,j+1,high);
        }
    }

    public int partitionLast(int[] a,int low, int high){
         int pivot = a[high];
         int i  = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if(a[j] < pivot){
                i++;
                swap (a,i,j);
            }
        }
        swap (a,i+1,high);
        return i+1;
    }

    public void quickSortLast(int[] a,int low, int high){
        if(low < high){
            int p = partitionLast (a,low,high);
            quickSortLast (a,low,p-1);
            quickSortLast (a,p+1,high);
        }
    }
    public int partition(int[] a,int low,int high){
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        while (true){
            while (i<=j && a[i] <= pivot){
                i++;
            }
            while (a[j] >= pivot && j >= i){
                j--;
            }
            if(j < i){
                break;
            }else {
                swap (a,i,j);
            }
        }
        swap (a,low,j);
        return j;
    }
    public void quickSort(int[] a,int low, int high){
        if(low < high){
            int p = partition(a, low, high);
            quickSort(a,low,p-1);
            quickSort(a,p+1,high);
        }
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort ();
        int[] a = {3, 7, 9, 10, 6, 5, 12, 4, 11, 2, 32767};
        System.out.println ("A : "+ Arrays.toString (a));
        qs.quickSort (a,0,a.length-1);
        System.out.println ("Sorted A : "+ Arrays.toString (a));
        System.out.println ();

        int[] b = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};
        System.out.println ("B : "+ Arrays.toString (b));
        qs.quickSort (b,0,b.length-1);
        System.out.println ("Sorted B : "+ Arrays.toString (b));
        System.out.println ();

        int[] c = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};
        System.out.println ("C : "+ Arrays.toString (c));
        qs.quickSort (c,0,c.length-1);
        System.out.println ("Sorted C : "+ Arrays.toString (c));
    }

}
