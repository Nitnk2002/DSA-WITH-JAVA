package DataStructures.Stack;

public class ParenthesisMatching {
    static class Stack{
        int size;
        int top;
        char[] s;
    }
    public static void push(Stack st, char x){
        if(st.top == st.size-1){
            System.out.println ("Stack overflow");
        }else {
            st.top++;
            st.s[st.top] =x;
        }
    }
    public static char pop(Stack st){
        char x = ' ';
        if(st.top == -1){
            System.out.println ("Stack UnderFlow");
        }else {
            x = st.s[st.top];
            st.top--;
        }
        return x;
    }
    public static boolean isEmpty(Stack st){
        if(st.top == -1){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isBalance(char[] exp){

        Stack st = new Stack ();
        st.size = exp.length;
        st.top = -1;
        st.s = new char[st.size];
        for (int i = 0; i < exp.length; i++) {
            if(exp[i] == '('){
                push (st,exp[i]);
            } else if (exp[i] == ')') {
                if(isEmpty (st)){
                    return false;
                }
                pop (st);
            }
        }
        return isEmpty (st) ? true : false;
    }
    public static void main(String[] args) {
        char[] expression = "((a+b)*(c-d)".toCharArray ();
        System.out.println ("Is Expression  Balanced ? : "+isBalance (expression));
    }
}
