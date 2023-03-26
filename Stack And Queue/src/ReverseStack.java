import java.util.Stack;
public class ReverseStack {

    public static void  helperFunction(Stack<Integer> st,Stack<Integer> helper){
        if(st.size() == 0)return;

        int top = st.pop();
        helperFunction(st, helper);

        while(st.size()>0){
            helper.push(st.pop());
        }

        st.push(top);

        while(helper.size()>0){
            st.push(helper.pop());
        }
    }
    public static void main(String[] args) {
        // array containing stack data
        Stack<Integer> st = new Stack<>();
        
        Stack<Integer> helper=new Stack<>();
        int arr[] = {1,2,3,4,5};
        for (int i : arr) {
            st.push(i);
        }
        System.out.println(st);
        helperFunction(st,helper);
        System.out.println(st);
    }
}
