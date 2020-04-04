package LeetCode;

public class Problem27 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 5, 5, 5};
        System.out.println(removeElement(nums, 5));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        for (int M :
                nums) {
            System.out.println(M);
        }
        return i;
    }
}
