import java.util.Stack;

public class bracketsBalanced {
    public static Boolean helperFunction(String input){
        // converting the string into stack
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(')st.push(input.charAt(i));
            else if(input.charAt(i) == ')'){
                if(st.size() == 0)st.push(input.charAt(i));
                else{
                    if(st.peek() == ')')st.push(input.charAt(i));
                    else st.pop();
                }
            }
        }
        return st.size() == 0;
    }
    public static void main(String[] args) {
        String brackets = ")()()(";
        System.out.print(helperFunction(brackets));

    }
}
