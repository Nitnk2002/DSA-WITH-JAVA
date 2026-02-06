package DataStructures.Strings;

public class ComparingStrings {
    public static void main(String[] args) {
        char a[] = "painter".toCharArray ();
        char b[] = "painting".toCharArray ();
        int i,j;
        for (i = 0,j =0; i < a.length && j < b.length ; i++,j++) {
            //if(a[i] != b[j]) break;
            if(a[i] == b[j]) System.out.println ("equal");
            else if(a[i] < b[j]) System.out.println ("smaller");
            else System.out.println ("greater");
        }
    }
}
