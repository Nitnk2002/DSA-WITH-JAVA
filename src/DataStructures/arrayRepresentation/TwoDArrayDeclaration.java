package DataStructures.arrayRepresentation;

import java.util.Arrays;

public class TwoDArrayDeclaration {
    public static void main(String[] args) {

        int[][] arr = new int[3][4]; // 3 rows and 4 columns
        int[][] arr2 = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int[][] arr3 = new int[3][];
        arr3[0] = new int[2];
        arr3[1] = new int[3];
        arr3[2] = new int[4];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                System.out.print (arr2[i][j]+" ");
            }
            System.out.println ();
        }
        System.out.println (Arrays.deepToString(arr));
        System.out.println (Arrays.deepToString(arr2));
        System.out.println (Arrays.deepToString(arr3));
    }
}
