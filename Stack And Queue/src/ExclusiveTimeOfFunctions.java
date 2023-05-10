import java.util.Stack;
class Pair{
    int id;
    int startTime;
    int childExecution;
}
public class ExclusiveTimeOfFunctions {
    public static int[] exclusiveTime(int n, String logs[]) {
        Stack<Pair> stk = new Stack<>();
        int result[] = new int[n];
        for(String current : logs){
            String log[] = current.split(":");
            if(log[1].equals("start")){
                Pair currentExecution = new Pair();
                currentExecution.id = Integer.parseInt(log[0]);
                currentExecution.startTime = Integer.parseInt(log[2]);
                currentExecution.childExecution = 0;
                stk.push(currentExecution);
            } else {
                Pair startTime = stk.pop();
                System.out.println(Integer.parseInt(log[2])+" "+ startTime.startTime);
                int interval = Integer.parseInt(log[2]) - startTime.startTime + 1;
                int executionTime = interval - startTime.childExecution;
                result[startTime.id] += executionTime;
                // update the parent for this interval
                if(!stk.isEmpty()){
                    stk.peek().childExecution += interval;
                }
            }
        }
        for(int i : result){
            System.out.println(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int n =1;
        // String[] list = {"0:start:0","0:start:1","0:start:2","0:end:3","0:end:4","0:end:5"};
        // exclusiveTime(n,list);
        String temp = "a good   example";
	    String newArr[] = temp.split(" ");
	    for(String t : newArr){
	        if(t == " "){
	            System.out.println("the string is space "+ t);
	        }
// 		System.out.println(t);
	    }
    }
}