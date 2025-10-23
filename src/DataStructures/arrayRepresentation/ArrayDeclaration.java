package DataStructures.arrayRepresentation;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int [] arr3;
        arr3 = new int[]{11,12,13,14,15};
        int arr4[] = new int[5];
        int[] arr5 = {0};
        int arr6[];
        System.out.println (Arrays.toString(arr));
        System.out.println (Arrays.toString(arr2));
        System.out.println (Arrays.toString(arr3));
        System.out.println (Arrays.toString(arr4));
        System.out.println (Arrays.toString(arr5));
        System.out.println (Arrays.toString(arr6=new int[]{16,17,18,19,20}));
    }
}
