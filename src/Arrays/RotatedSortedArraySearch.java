package Arrays;

public class RotatedSortedArraySearch {

    public static int search(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] == target) {
                return m;
            }

            // Left sorted portion
            if (nums[s] <= nums[m]) {
                if (target >= nums[s] && target < nums[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            // Right sorted portion
            else {
                if (target > nums[m] && target <= nums[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(nums, target);
        System.out.println("Target found at index: " + index);
    }
}