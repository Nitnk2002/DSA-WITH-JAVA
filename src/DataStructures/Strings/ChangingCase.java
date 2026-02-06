package DataStructures.Strings;

public class ChangingCase {
    public static void main(String[] args) {
        char name[] = "NITISH".toCharArray ();
        for (int i = 0; i < name.length; i++) {
            if(name[i] >= 65 && name[i] <=90 ){

                name[i] = (char) (name[i]+32);
            }
        }
        System.out.println (name);
    }
}
