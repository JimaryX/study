package LeetCode;

public class Problem35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (target <= nums[0] || nums.length == 0) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        if (target == nums[nums.length -1]) return nums.length - 1;
        int i = 0;
        int j = nums.length;
        while (j - i > 1) {
            if (nums[(j + i) / 2] > target) j = (j + i) / 2;
            else if (nums[(j + i) / 2] < target) i = (j + i) / 2;
            else {
                j = (j + i) / 2;
                break;
            }
        }
        return j;
    }

    public void test() {
        searchInsert(new int[]{2, 2}, 2);
    }
}
