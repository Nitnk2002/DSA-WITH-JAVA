package DataStructures.Stack;

public class EvaluationOfPostFix {
    static class Stack{
        int size;
        int top;
        int[] s;
    }
    public static void push(Stack st, int x){
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
    public static int peek(Stack st, int pos){
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
    public static boolean isOperand(char x){
        if(x == '+' || x == '-' || x == '*' || x == '/' || x == '^' || x == '(' || x == ')'){
            return false;
        }
        return true;
    }
    public static int evalPostfix(char[] postfix){
        Stack st = new Stack ();
        st.size = postfix.length;
        st.s= new int[st.size];
        st.top = -1;
        int x1 = 0, x2 = 0,r =0;
        for (int i = 0; i < postfix.length; i++) {
            if(isOperand(postfix[i])){
                push (st,postfix[i]-48);
            }else{
                x2 = pop (st);
                x1 = pop (st);
                switch (postfix[i]){
                    case '+' : r = x1 + x2;
                        push (st,r);
                        break;
                    case '*' : r = x1 * x2;
                        push (st,r);
                        break;
                    case '-' : r = x1 - x2;
                        push (st,r);
                        break;
                    case '/' : r = x1 / x2;
                        push (st,r);
                        break;
                }
            }
        }
        return r;
    }
    public static void main(String[] args) {
        char[] postfix = {'3','5','*','6','2','/','+','4','-'};
        int result = evalPostfix (postfix);
        System.out.println (result);
    }
}
