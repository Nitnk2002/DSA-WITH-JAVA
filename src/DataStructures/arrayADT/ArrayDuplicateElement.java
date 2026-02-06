package DataStructures.arrayADT;

public class ArrayDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,5,5,6,7};
        duplicateElement (arr);
        noOfDuplicate (arr);
        duplicateWithHashing (arr);
        int[] arr1 = {7,8,2,3,4,3,4,5,7,8,5,3};
        duplicateInUnsorted (arr1);

    }
    //finding duplicate element in sorted array
    public static void duplicateElement(int[] arr){
        int lastDuplicate = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1] && arr[i] != lastDuplicate){
                System.out.print (arr[i]);
                lastDuplicate = arr[i];
                System.out.print ("\t");
            }
        }
        System.out.println ();
    }
    //finding no of duplicate element in  sorted array
    public static void noOfDuplicate(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                int j= i+1;
                while(arr[j] == arr[i]) {
                    j++;
                }
                System.out.println (arr[i]+" is appearing "+(j-i)+" time");
                i = j-1;
            }
        }
    }
    //finding duplicate with hashing method in sorted array its also unsorted array
    //for unsorted array we have to find max element from array and make that length of hashing array
    public static void duplicateWithHashing(int[] arr){
        int max = arr[arr.length-1];
        int[] ha = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            ha[arr[i]]++;
        }
        for (int i = 0; i <= max; i++) {
            if(ha[i]>1){
                System.out.println (i+"\t"+ha[i]);
            }
        }
    }

    //finding duplicate element in unsorted array
    public static void duplicateInUnsorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int count = 1;
            if(arr[i] != -1){
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[i] == arr[j]){
                        count++;
                        arr[j] = -1;
                    }
                }
                if(count>1){
                    System.out.println (arr[i]+"\t"+count);
                }
            }
        }
    }
}
