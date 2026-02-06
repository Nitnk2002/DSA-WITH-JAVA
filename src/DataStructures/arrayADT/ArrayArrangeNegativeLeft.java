package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayArrangeNegativeLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-4,5,6};
        int n = arr.length-1;
        int i =0;
        while(i<n){
            while (arr[i] < 0) {
                i++;
            }
            while(arr[n]>0){
                n--;
            }
            if(i<n){
                ArrayLinearSearch.swap(arr,i,n);
            }
        }
        System.out.println (Arrays.toString(arr));
    }

}
