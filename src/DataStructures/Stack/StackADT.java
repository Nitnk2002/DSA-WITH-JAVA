package DataStructures.Stack;

import java.util.Scanner;

public class StackADT {

    static class Stack{
        int size;
        int top;
        int[] s;
    }
    public static void push(Stack st,int x){
        if(st.top == st.size-1){
            System.out.println ("Stack overflow");
        }else {
            st.top++;
            st.s[st.top] =x;
        }
    }
    public static int pop(Stack st){
        int x = -1;
        if(st.top == -1){
            System.out.println ("Stack UnderFlow");
        }else {
            x = st.s[st.top];
            st.top--;
        }
        return x;
    }
    public static int peek(Stack st,int pos){
        int x = -1;
        if(st.top-pos+1 < 0){
            System.out.println ("Invalid Position");
        }else{
            x = st.s[st.top-pos+1];
        }
        return x;
    }
    public static int stackTop(Stack st){
        if(st.top == -1){
            return -1;
        }
        else {
            return st.s[st.top];
        }
    }

    public static boolean isEmpty(Stack st){
        if(st.top == -1){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isFull(Stack st){
        if(st.top == st.size - 1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Size of stack : ");
        st.size = sc.nextInt ();
        st.s = new int[st.size];
        st.top = -1;
        System.out.println ("Stack is Empty status : "+isEmpty (st));
        push (st,2);
        push (st,3);
        push (st,4);
        System.out.println ("Stack is full Status : "+isFull (st));
        System.out.println ("Peek Element : "+peek (st,2));
        System.out.println ("Popped Element : "+pop (st));
        System.out.println ("Stack is full Status : "+isFull (st));
    }
}
