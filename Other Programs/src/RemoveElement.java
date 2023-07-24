public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0, j = nums.length - 1;
        for (; i <= j; i++) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i--;
                j--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 }, val = 2;
        removeElement(nums, val);
    }
}
