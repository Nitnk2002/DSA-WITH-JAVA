package DataStructures.Strings;

public class FindingDuplicateInString {
    public static void main(String[] args) {
        String s = "finding";
        duplicateInString (s);
    }
    public static void duplicateInString(String a){
        int[] h = new int[26];
        for (int i = 0; i < a.length (); i++) {
            h[a.charAt (i)-97] +=1;
        }
        for (int i = 0; i < 26; i++) {
            if (h[i] > 1) {
                System.out.print (h[i]);
                System.out.println (" : "+(char) (i + 97));
            }
        }
    }
}
