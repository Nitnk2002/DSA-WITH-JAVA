package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8};
        int result = missingNumber (arr);
        System.out.println ("Missing No. -> "+result);
        missingNumber1 (arr);
        System.out.println ("Multiple Missing Number");
        int[] a = {6,7,8,9,11,12,15,16,17,18,19};
        missingNumber2 (a);
        int[] ua = {3,7,4,9,12,6,1,2,10};
        missingNumber3 (ua);
    }
    //single missing element in sorted array
    public static int missingNumber(int[] a){
        int sum =0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        n = n+1;
        int tempSum = (n*(n+1))/2;
        return tempSum-sum;
    }
    //single missing element in sorted Array
    public static void missingNumber1(int[] a){
        int diff =a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] - i != diff){
                System.out.println ("Missing No. -> "+(i+diff));
                break;
            }
        }
    }
    // Multiple missing element in sorted Array
    public static void missingNumber2(int[] a){
        int n = a.length;
        int diff = a[0];
        for (int i = 0; i < n; i++) {
            if(a[i] -  i != diff){
                while(diff<a[i]-i){
                    System.out.println (i+diff);
                    diff++;
                }
            }
        }
    }
    //Missing Element in unsorted Array
    public static void missingNumber3(int[] a){
        int max = Arrays.stream(a).max().getAsInt();
        int[] h = new int[max+1];
        for (int i = 0; i < a.length ; i++) {
            if (a[i] >= 0 && a[i] < h.length) {
                h[a[i]]++;
            }

        }
        for (int i = 1; i < h.length; i++) {
            if(h[i] == 0){
                System.out.println ("Missing Element : "+i);
            }
        }
    }


}
