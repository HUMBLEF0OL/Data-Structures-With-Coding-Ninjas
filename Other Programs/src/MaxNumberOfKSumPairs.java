import java.util.HashMap;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(k - nums[i]) != null) {
                if (nums[i] * 2 == k) {
                    int x = (int) Math.floor(map.get(nums[i])) / 2;
                    result = result + x;
                } else {
                    int x = map.get(nums[i]);
                    int y = map.get(k - nums[i]);
                    result = result + Math.min(x, y);
                    map.remove(k - nums[i]);
                }
                map.remove(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int k = 5;
        int Result = maxOperations(arr, k);
        System.out.println(Result);
    }
}
