public class MaximumAverageSubarrayPartI {
    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        double res = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            res = Math.max(res, sum);
        }
        return res / k;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 4, 0, 3, 2 };
        int k = 1;
        double result = findMaxAverage(arr, k);
        System.out.println(result);
    }
}
