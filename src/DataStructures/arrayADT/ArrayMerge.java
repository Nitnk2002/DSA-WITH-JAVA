package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {

        int[] arr1 = {2,3,4,6};
        int[] arr2 = {1,7,8};
        int[] result = merge (arr1,arr2);
        System.out.println (Arrays.toString (result));
    }
     public static int[] merge(int[] arr1,int[] arr2){
         int i=0,j=0,k=0;
         int[] c = new int[arr1.length+arr2.length];
         while(i<arr1.length && j<arr2.length){
             if(arr1[i]<arr2[j]){
                 c[k++] = arr1[i++];
             }else{
                 c[k++] = arr2[j++];
             }
         }
         for (; i < arr1.length; i++) {
             c[k++] = arr1[i];
         }
         for (; j < arr2.length; j++) {
             c[k++] = arr2[j];
         }
         return c;
     }
}
