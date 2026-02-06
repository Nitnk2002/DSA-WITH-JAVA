package DataStructures.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        char a[] = "How are You".toCharArray ();
        System.out.println (a);
        countVowelAndConsonant (a);
        countingWords (a);
        char  name[] = "anil".toCharArray ();
        if(validateAString (name)){
            System.out.println ("Valid ");
        }else{
            System.out.println ("Invalid");
        }

        System.out.println ("Reversed String : "+ Arrays.toString (reverseString (name)));
    }
    public static char[] reverseString(char a[]){
        int i,j=0;
        for ( i = 0; i < a.length; i++) {

        }
        i= i-1;
        for ( j = 0; j < i; j++,i--) {
            char temp;
            temp = a[j];
            a[j] = a[i];
            a[i] =temp;
        }
        System.out.println (a);
        return a;
    }
    public static boolean validateAString(char[] name){
        for (int i = 0; i < name.length; i++) {
            if (!(name[i] >=65 && name[i]<=90 || name[i]>=97 && name[i] <=122) && !(name[i] ==48 && name[i] == 57)){
                return false;
            }
        }
        return true;
    }
    public static void countingWords (char a[]){
        int word =1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == ' ' && a[i-1] != ' '){
                word++;
            }
        }
        System.out.println ("No. of Word : "+word);
    }
    public static void countVowelAndConsonant(char a[]){
        int vCount =0;
        int cCount =0;
        for(int i=0; i< a.length;i++){
            if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' ||
            a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U'
            ){
                vCount++;
            }else if(a[i] >=65 && a[i]<=90 || a[i]>=97 && a[i] <=122 ){
                cCount++;
            }
        }
        System.out.println ("Consonant count : "+cCount);
        System.out.println ("Vowel count : "+vCount);
    }
}
