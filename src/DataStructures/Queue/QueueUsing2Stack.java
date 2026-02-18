package DataStructures.Queue;

import java.util.Scanner;

public class QueueUsing2Stack {

    static class Stack{
        int top;
        int size;
        int[] s;
    }
    public static void push(Stack st,int x){
        if(st.top == st.size-1){
            System.out.println ("Stack is full");
        }else {
            st.top++;
            st.s[st.top] = x;
        }
    }
    public static int pop(Stack st){
        int x = -1;
        if(st.top == -1){
            System.out.println ("Stack is Empty");
        }else {
            x =st.s[st.top];
            System.out.println ("Pop Data : "+x);
            st.top--;
        }
        return x;
    }
    public static boolean isEmpty(Stack st){
        if(st.top == -1){
            return true;
        }
        return false;
    }
    public static void enqueue(Stack st,int x){
        push (st,x);
    }
    public static int dequeue(Stack st1,Stack st2){
        int x = -1;
        if(isEmpty (st2)){
            if(isEmpty (st1)){
                System.out.println ("Queue is Empty");
                return x;
            }else {
                while (!isEmpty (st1)){
                    push (st2,pop (st1));
                }
                x = pop (st2);
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Stack st1 = new Stack ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Size : ");
        st1.size = sc.nextInt ();
        st1.s = new int[st1.size];
        st1.top = -1;
        Stack st2 = new Stack ();
        st2.size = st1.size;
        st2.s = new int[st2.size];
        st2.top = -1;
        enqueue (st1,1);
        enqueue (st1,2);
        enqueue (st1,3);
        enqueue (st1,4);
        System.out.println ("Dequeue data : "+ dequeue (st1,st2));
    }
}
