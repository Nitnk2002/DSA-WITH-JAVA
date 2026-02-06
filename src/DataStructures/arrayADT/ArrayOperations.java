package DataStructures.arrayADT;

import java.util.Arrays;

public class ArrayOperations {
    // operations on array
    int length;
    int capacity;
    int[] a;
    ArrayOperations(int length){
        this.length = 0;
        this.capacity = length;
        a = new int[length];
    }
    void insert(int index, int x){
        for (int i =this.length; i >index ; i--) {
            a[i] = a[i-1];
        }
        a[index] = x;
        this.length++;
    }

    int delete(int index){
        int x = a[index];
        for (int i = index; i < length ; i++) {
            a[i] = a[i+1];
        }
        length--;
        return x;
    }
    int search(int x){
        int low = 0;
        int high = capacity-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[mid]==x){
                return mid;
            }else if(x < a[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    int get(int index){
        if(index<0 || index>capacity){
            return -1;
        }
        return a[index];
    }
    void set(int index,int x){
        if(index>0 || index<capacity){
            a[index] = x;
        }
    }
    int max(){
        int max = a[0];
        for (int i = 1; i < capacity; i++) {
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
    int min(){
        int min = a[0];
        for (int i = 0; i < capacity; i++) {
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
    int sum(){
        int sum = 0;
        for (int i = 0; i < capacity; i++) {
            sum += a[i];
        }
        return sum;
    }
    int average(){
        return sum()/capacity;
    }
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(5);
        arr.insert(0,1);
        arr.insert(3,3);
        arr.insert(2,4);
        arr.insert(4,5);
        System.out.println (Arrays.toString(arr.a));
        System.out.println (arr.delete(0));
        System.out.println (Arrays.toString(arr.a));
        System.out.println (arr.search(3));
        System.out.println (arr.get(2));
        arr.set(2,10);
        System.out.println (Arrays.toString(arr.a));
        System.out.println (arr.max());
        System.out.println (arr.min());
        System.out.println (arr.sum());
        System.out.println (arr.average());
    }
}
