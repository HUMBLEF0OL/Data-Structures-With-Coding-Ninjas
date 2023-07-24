public class RemoveDuplicateFromSorted {
    public static int removeDuplicates(int[] nums) {
        int j = 1, i = 1, count = 0;
        for (; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        removeDuplicates(nums);
    }
}
