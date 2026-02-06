package DataStructures.Strings;


public class PermutationOfString {
    static int[] a = new int[10];
    static char[] res =new char[10];

    public static void main(String[] args) {
        char[] a = "ABC".toCharArray ();
        permutation (a,0);
        System.out.println ("2 nd Method ");
        perm (a,0, a.length-1);
    }
    public static void perm(char s[], int l, int h){

        if(l == h){
            System.out.println (new String(s));
        }else {
            for (int i = l; i <=h; i++) {
                swap(s,l,i);
                perm(s,l+1,h);
                swap(s,l,i);
            }
        }
    }
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void permutation(char s[],int k){
        if(k== s.length){
            System.out.println (new String(res,0,s.length));
        }else{
            for (int j = 0; j < s.length; j++) {
                if(a[j] == 0){
                    res[k] = s[j];
                    a[j] = 1;
                    permutation (s,k+1);
                    a[j] =0;
                }
            }
        }
    }
}
