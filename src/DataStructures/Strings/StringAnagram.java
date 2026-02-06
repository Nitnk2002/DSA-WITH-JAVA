package DataStructures.Strings;

public class StringAnagram {
    public static void main(String[] args) {
        //meaning different but alphabet letter same
        char a[] = "verbose".toCharArray ();
        char b[] = "observe".toCharArray ();
        int[] h = new int[26];
        for (int i = 0; i < a.length ; i++) {
            h[a[i] - 97] += 1;
        }
        int i= 0;
        for ( i = 1; i < b.length; i++) {
            h[b[i] - 97] -= 1;
            if(h[b[i] - 97] < 0){
                System.out.println ("not anagram");
                break;
            }
        }
        if(i == a.length){
            System.out.println ("anagram");
        }
    }
}
