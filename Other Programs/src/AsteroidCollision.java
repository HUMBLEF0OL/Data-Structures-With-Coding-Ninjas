import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollisionX(int[] asteroids) {
        Stack<Integer> stk = new Stack<>();
        for (int current : asteroids) {
            if (stk.isEmpty())
                stk.push(current);
            else if (current > 0) {
                if (stk.peek() > 0)
                    stk.push(current);
                else {
                    while (Math.abs(stk.peek()) <= Math.abs(current)) {
                        stk.pop();
                    }
                    if (stk.size() == 0)
                        stk.push(current);

                }
            } else {
                if (stk.peek() < 0)
                    stk.push(current);
                else {
                    while (Math.abs(stk.peek()) <= Math.abs(current)) {
                        stk.pop();
                    }
                    if (stk.size() == 0)
                        stk.push(current);
                }
            }
        }
        int result[] = new int[stk.size()];
        int i = stk.size();
        while (!stk.isEmpty()) {
            result[--i] = stk.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -10, -2, 5 };
        int result[] = asteroidCollisionX(arr);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
