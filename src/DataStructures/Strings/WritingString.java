package DataStructures.Strings;

public class WritingString {
    public static void main(String[] args) {
        char temp;
        temp = 'A';
       // temp = A;
        // temp = "A";
        System.out.println (temp);
        String temp1 = "AB";
        // String temp1 = 'AB'; // Wrong String written
        // String temp1 = AB;
        System.out.println (temp1);
        char x[] = {'A','B','C'};    //correct to assign
        // char x[3] = {'A','B','C'};    //Wrong to assign
        System.out.println (x);
        //char name[] = "Nitish" // wrong assign
        char name[] = "Nitish".toCharArray ();  //correct assign
        System.out.println (name);

//        String nm = "Nitish";
//        int i;
//        for (i = 0; name[i] != '\0'; i++) {
//
//        }
//        System.out.println ("length of String : "+i);

    }
}
