// import java.util.Stack;

public class numberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        int students[] = {1,1,1,0,0,1};
        int sandwiches[] = {1,0,0,0,1,1};
        /*
        -------------------------- First Attempt ---------------------------
        Stack<Integer> studentStack = new Stack<>();
        int currentStudentIndex = 0;
        for(int i =0;i< sandwiches.length;i++){
            if(!studentStack.isEmpty() && studentStack.peek() == sandwiches[i]){
                studentStack.pop();
            } else if(currentStudentIndex == students.length){
               System.out.println(studentStack.size());
               break;
            }
            else {
                for(int j = currentStudentIndex;j<students.length;j++){
                    if(sandwiches[i] != students[j]) studentStack.push(students[j]);
                    else{
                        studentStack.push(students[j]);
                        currentStudentIndex = ++j;
                        break;
                    }
                    if(j == students.length-1)currentStudentIndex = ++j;
                }
                i--;
            }
        }
        System.out.println(0);
         */

         /*------------------------- Better Approach -------------------------*/
         // count the number of students who wants sandwiches of each types
        int zeroes = 0;
        int ones = 0;
        for(int i : students){
            if(i == 0)zeroes++;
            else ones++;
        }
        // now according to the sandwich type at the top of the stack update the counter
        for(int i : sandwiches){
            if(i == 0){
                // if there are no sandwiches left of type 0 return number of student left for type 1
                if(zeroes ==0)System.out.print(ones);
                zeroes--;
            } else{
                if(ones == 0)System.out.print(zeroes);
                ones--;
            }
            
        }
        System.out.print(0);
    }
}
