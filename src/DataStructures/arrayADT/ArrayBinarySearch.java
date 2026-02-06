package DataStructures.arrayADT;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println ("index : "+binarySearch(arr,4,0,arr.length-1));
        System.out.println ("index : "+rbinarySearch(arr,3,0,arr.length-1));
    }
    public static int binarySearch(int[] arr,int key,int low,int high){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
                return mid;
            }else if(key < arr[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static int rbinarySearch(int[] arr,int key,int low,int high){
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key){
               return mid;
            }else if(key < arr[mid]){
                return rbinarySearch(arr,key,low,mid-1);
            }else{
                return rbinarySearch(arr,key,mid+1,high);
            }
        }
        return -1;
    }
}
