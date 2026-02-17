package DataStructures.Stack;

public class ConversionOfInPrePost {
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
    public static char stackTop(Stack st){
        if(st.top == -1){
            return ' ';
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

    public static int pre(char x){
        if(x == '+' || x == '-'){
            return 1;
        }else if(x == '*' || x == '/'){
            return 2;
        }
        return 0;
    }
    public static boolean isOperand(char x){
        if(x == '+' || x == '-' || x == '*' || x == '/' || x == '^' || x == '(' || x == ')'){
            return false;
        }
        return true;
    }
    public static char[] InToPost(char[] infix){
        Stack st = new Stack ();
        st.size = infix.length;
        st.s = new char[st.size];
        st.top = -1;
        char[]  postfix = new char[st.size];
        int i = 0;
        int j = 0;
        while (i < infix.length){
            if(isOperand (infix[i])){
                postfix[j++] = infix[i++];
            }else {
                if(st.top == -1 || pre (infix[i]) > pre(stackTop (st))){
                    push (st,infix[i++]);
                }else {
                    postfix[j++] = pop (st);
                }
            }
        }
        while (!isEmpty (st)){
            postfix[j++] = pop (st);
        }
        return postfix;
    }
    public static int inStackPre(char x){
        if(x == '+' || x == '-'){
            return 2;
        }else if(x == '*' || x == '/'){
            return 4;
        }else if(x == '^'){
            return 5;
        }else if(x == '('){
            return 0;
        }
        return 0;
    }
    public static int outStackPre(char x){
        if(x == '+' || x == '-'){
            return 1;
        }else if(x == '*' || x == '/'){
            return 3;
        }else if(x == '^'){
            return 6;
        }else if(x == ')'){
            return 7;
        }else if(x == '('){
            return 0;
        }
        return 0;
    }
    public static char[] convertInToPost(char[] infix){
        Stack st = new Stack ();
        st.size = infix.length;
        st.s = new char[st.size];
        st.top = -1;
        char[]  postfix = new char[st.size];
        int i = 0;
        int j = 0;
        while (i < infix.length){

            if (isOperand(infix[i])) {
                postfix[j++] = infix[i++];
            }
            // '(' always pushed
            else if (infix[i] == '(') {
                push(st, infix[i++]);
            }
            // ')' → pop till '('
            else if (infix[i] == ')') {
                while (stackTop(st) != '(') {
                    postfix[j++] = pop(st);
                }
                pop(st); // remove '('
                i++;
            }
            // Operator
            else {
                while (!isEmpty(st) &&
                        outStackPre(infix[i]) <= inStackPre(stackTop(st))) {
                    postfix[j++] = pop(st);
                }
                push(st, infix[i++]);
            }
        }
        while ((!isEmpty (st))){
            postfix[j++] = pop(st);
        }
        return postfix;
    }
    public static void main(String[] args) {

        char[] infix = "a+b*c-d/e".toCharArray ();
        System.out.println ("Infix Expression : "+new String (infix));
        char[] postfix = InToPost (infix);
        System.out.println ("Postfix Expression : "+new String (postfix));
        char[] infix2 = "((a+b)*c)-d^e^f".toCharArray ();
        System.out.println ("Infix Expression : "+new String (infix2));
        char[] postfix2 = convertInToPost (infix2);
        System.out.println ("Postfix Expression : "+new String (postfix2).trim ());
    }
}
