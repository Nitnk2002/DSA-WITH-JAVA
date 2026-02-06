package DataStructures.Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String name = "nitin";
        String reverse = reverseString (name);
        if(reverse.equalsIgnoreCase (name)){
            System.out.println ("palindrome");
        }else {
            System.out.println ("Not palindrome");
        }
    }
    public static String reverseString (String a){
        String b = "";
        int j =0;
        for (int i = a.length ()-1; i >= 0 && j<a.length () ; i--,j++) {
            b = b+a.charAt (i);
        }
        return b;
    }
}
