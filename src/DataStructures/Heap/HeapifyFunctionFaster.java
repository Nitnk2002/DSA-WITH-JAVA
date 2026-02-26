package DataStructures.Heap;

public class HeapifyFunctionFaster extends CreateHeap {

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int delete(int[] a, int n){
        int x = a[0];
        a[0] = a[n-1];
        int i =0;
        int j = 1;

        while (j < n-1){
            if(a[j] < a[j+1]){
                j = j+1;
            }

            if(a[i] < a[j]){
                swap (a,i,j);
                i = j;
                j = 2 * i +1;
            }else {
                break;
            }
        }
        return x;
    }
    public void heapify(int[] a,int n){
        for (int i = (n/2) - 1; i >= 0 ; i-- ) {
            int j = 2* i+1;
            while (j < n-1){
                if(a[j] < a[j+1]){
                    j = j+1;
                }
                if(a[i] < a[j]){
                    swap (a,i,j);
                    i = j;
                    j = 2 * i +1;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,10,30,20,35,40,15};
        HeapifyFunctionFaster hff = new HeapifyFunctionFaster ();
        hff.print (a,a.length,"A");
        hff.heapify (a,a.length);
        hff.print (a,a.length,"Heaified A");
        int[] b = {5,10,30,20};
        hff.print (b,b.length,"B");
        hff.heapify (b,b.length);
        hff.print (b,b.length,"Heaified B");
    }
}
