package DataStructures.recursion;

public class TowerOfHanoiExp {
    public static void main(String[] args) {
        towerOfHanoi (5,'A','B','C');

    }
    public static void towerOfHanoi(int n,char A,char B, char C){
        if(n>0){
            towerOfHanoi(n-1,A,C,B);
            System.out.println("Move disk "+n+" from "+A+" to "+C);
            towerOfHanoi(n-1,B,A,C);
        }
    }
}
