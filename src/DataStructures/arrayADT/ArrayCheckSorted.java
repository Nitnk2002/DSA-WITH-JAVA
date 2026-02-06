package DataStructures.arrayADT;

public class ArrayCheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,2};
        System.out.println (checkSorted(arr));
    }
    public static boolean checkSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
