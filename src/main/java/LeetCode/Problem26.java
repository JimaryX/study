package LeetCode;

public class Problem26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] == nums[j + 1]) {
                i++;
            }
        }
        return nums.length - i;
    }
}
