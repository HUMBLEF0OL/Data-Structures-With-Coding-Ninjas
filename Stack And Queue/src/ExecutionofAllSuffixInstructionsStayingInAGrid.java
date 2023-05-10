public class ExecutionofAllSuffixInstructionsStayingInAGrid {
    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int result[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            String currentPathString = s.substring(i);
            int currentPath[] = startPos;
            int pathCounter = 0;
            for (int j = 0; j < currentPathString.length(); j++) {
                char currentTurn = currentPathString.charAt(j);
                if (currentTurn == 'L' && currentPath[0] > 0) {
                    currentPath[0] -= 1;
                    pathCounter++;
                } else if (currentTurn == 'R' && currentPath[0] < n) {
                    currentPath[0] += 1;
                    pathCounter++;
                } else if (currentTurn == 'U' && currentPath[1] > 0) {
                    currentPath[1] -= 1;
                    pathCounter++;
                } else if (currentTurn == 'D' && currentPath[1] < n) {
                    currentPath[1] += 1;
                    pathCounter++;
                } else {
                    break;
                }
            }
            result[i] = pathCounter;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        int startPos[] = { 1, 1 };
        String str = "LURD";
        executeInstructions(n, startPos, str);

    }
}